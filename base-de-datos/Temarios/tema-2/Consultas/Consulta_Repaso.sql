
/*1.	Devuelve un listado de todos los pedidos que se realizaron 
durante el año 2017, cuya cantidad total sea superior a 500€. */
SELECT * 
FROM pedido
WHERE YEAR(pedido.fecha) = 2017 AND pedido.total > 500;

/*2.	Devuelve el identificador, nombre y primer apellido de 
aquellos clientes cuyo segundo apellido no es NULL. 
El listado deberá estar ordenado alfabéticamente por apellidos y nombre.*/
SELECT id, nombre, apellido1
FROM cliente
WHERE apellido2 IS NOT NULL 
ORDER BY apellido1, nombre;

/*3.	Devuelve un listado de los nombres de los clientes 
que no empiezan por A. 
El listado deberá estar ordenado alfabéticamente.*/
SELECT nombre
FROM cliente
WHERE nombre NOT LIKE "A%" 
ORDER BY nombre ASC;

				/* TAMBIÉN VÁLIDOS.	preguntar a la profesora*/
				SELECT nombre 
				FROM cliente 
				WHERE nombre LIKE "A%"
				ORDER BY nombre;
				

/*4.	Devuelve un listado que muestre todos los clientes, 
con todos los pedidos que han realizado y con los datos 
de los comerciales asociados a cada pedido.*/
SELECT *
FROM cliente c 
INNER JOIN pedido p 
ON c.id = p.id_cliente
INNER JOIN comercial co 
ON p.id_comercial = co.id;


/*5.	Devuelve un listado de todos los clientes 
que realizaron un pedido durante el año 2017, 
cuya cantidad esté entre 300 € y 1000 €.*/
SELECT c.*
FROM cliente c INNER JOIN pedido p
ON c.id = p.id_cliente
WHERE YEAR(p.fecha) = 2017 
AND p.total BETWEEN 300 AND 1000;

/* 6.	Devuelve el nombre de todos los clientes 
que han realizado algún pedido 
con el comercial Daniel Sáez Vega.*/
SELECT c.nombre
FROM cliente c 
INNER JOIN pedido p
ON c.id = p.id_cliente
INNER JOIN comercial co
ON co.id = p.id_comercial
WHERE co.nombre = "Daniel" AND co.apellido1 = "Sáez" AND co.apellido2 = "Vega"
GROUP BY c.nombre;

/*7.	Devuelve un listado con todos los clientes 
junto con los datos de los pedidos que han realizado. 
Este listado también debe incluir los clientes 
que no han realizado ningún pedido. 
El listado debe estar ordenado alfabéticamente 
por el primer apellido, segundo apellido 
y nombre de los clientes.*/
SELECT *
FROM cliente c LEFT JOIN pedido p
ON c.id = p.id_cliente
ORDER BY c.apellido1, c.apellido2, c.nombre;


/*8.	Devuelve un listado con todos los comerciales 
junto con los datos de los pedidos que han realizado. 
Este listado también debe incluir los comerciales 
que no han realizado ningún pedido. 
El listado debe estar ordenado alfabéticamente 
por el primer apellido, segundo apellido 
y nombre de los comerciales.*/

SELECT *
FROM comercial co LEFT JOIN pedido p
ON co.id = p.id_comercial
ORDER BY co.apellido1, co.apellido2, co.nombre;



/*9.	Devuelve un listado que solamente muestre 
los clientes que no han realizado ningún pedido.*/
SELECT c.*
FROM cliente c LEFT JOIN pedido p 
ON c.id = p.id_cliente
WHERE p.id IS NULL;

/*10.	Calcula la cantidad total que suman 
todos los pedidos que aparecen en la tabla pedido.											!!!!!!!*/	
SELECT SUM(p.total) "Suma Total"
FROM pedido p;

/*11.	Calcula la cantidad media de 
todos los pedidos que aparecen en la tabla pedido.											!!!!!!!!!!*/
SELECT AVG(p.total) "Cantidad Media"
FROM pedido p;

			/* O puede ser esto */
			SELECT AVG(p.total)
			FROM pedido p INNER JOIN cliente c 
			ON p.id_cliente=c.id
			INNER JOIN comercial co
			ON p.id_comercial = co.id
			GROUP BY c.nombre, co.nombre;
			


/*12.	Calcula el número total de comerciales 
distintos que aparecen en la tabla pedido.*/

SELECT DISTINCT(comercial.id)
FROM comercial inner join pedido
ON comercial.id = pedido.id_comercial
GROUP BY comercial.nombre;

/*13.	Calcula el número total de clientes 
que aparecen en la tabla cliente.*/
SELECT COUNT(*) "Número de clientes"
FROM cliente;


/*14.	Calcula cuál es la mayor cantidad 
que aparece en la tabla pedido.*/
SELECT MAX(pedido.total) "Mayor Cantidad"
FROM pedido;

/*15.	Devuelve un listado con todos los pedidos 
que ha realizado Adela Salas Díaz. 
(Sin utilizar INNER JOIN).*/
SELECT *
FROM pedido 
WHERE pedido.id_cliente = ALL (SELECT cliente.id
										FROM cliente
										WHERE cliente.nombre = "Adela");

/*16.	Devuelve el número de pedidos 
en los que ha participado el comercial 
Daniel Sáez Vega. (Sin utilizar INNER JOIN)*/
SELECT COUNT(*) "nº Participación Pedido"
FROM pedido 
WHERE pedido.id_comercial = (SELECT comercial.id
									FROM comercial
									WHERE comercial.nombre = "Daniel");

/*17.	Devuelve el pedido más caro que existe 
en la tabla pedido si hacer uso de MAX, ORDER BY ni LIMIT.					!!!! creo que quiso decir SIN*/
SELECT max(pedido.total) "Pedido Mayor"
FROM pedido;

		/*La manera que seguramente buscaba.*/
		SELECT pedido.total 
		FROM pedido
		WHERE pedido.total >= ALL (SELECT pedido.total
											FROM pedido);

/*18.	Devuelve un listado de los clientes 
que no han realizado ningún pedido. 
(Utilizando ANY o ALL).																	MAL SEGURO*/
SELECT *
FROM cliente
WHERE cliente.id = ALL (SELECT pedido.id_cliente
								FROM pedido
								WHERE pedido.total =  NULL);

/*19.	Devuelve un listado de los clientes 
que no han realizado ningún pedido. 
(Utilizando IN o NOT IN).*/
SELECT cliente.nombre 
FROM cliente
WHERE cliente.id NOT IN (SELECT pedido.id_cliente
									FROM pedido);
									
					/*Otra forma... SIN USAR EL IN o NOT IN*/
					SELECT cliente.nombre 
					FROM cliente LEFT JOIN pedido
					ON cliente.id = pedido.id_cliente
					WHERE pedido.id_cliente IS NULL;
					

/*20.	Devuelve un listado de los comerciales 
que no han realizado ningún pedido. 
(Utilizando IN o NOT IN).*/
SELECT comercial.nombre
FROM comercial
WHERE comercial.id NOT IN (SELECT pedido.id_comercial
									FROM pedido);
					
					/*Otra forma ... SIN USAR EL IN o NOT IN*/	
					SELECT comercial.nombre 
					FROM comercial LEFT JOIN pedido
					ON comercial.id = pedido.id_comercial
					WHERE pedido.id_comercial IS NULL;
					
/*21.	Devuelve un listado de los clientes 
que no han realizado ningún pedido. 
(Utilizando EXISTS o NOT EXISTS).*/
SELECT cliente.nombre
FROM cliente 
WHERE NOT EXISTS (SELECT *
						FROM pedido
						WHERE pedido.id_cliente = cliente.id);
						
						/*Otra forma .... */
						SELECT cliente.nombre FROM cliente
						LEFT JOIN pedido ON cliente.id = pedido.id_cliente
						WHERE pedido.id_cliente IS NULL;

/*22.	Devuelve un listado de los comerciales
 que no han realizado ningún pedido. 
 (Utilizando EXISTS o NOT EXISTS).*/
SELECT comercial.nombre FROM comercial
WHERE NOT EXISTS 
(SELECT * FROM pedido 
WHERE pedido.id_comercial = comercial.id);