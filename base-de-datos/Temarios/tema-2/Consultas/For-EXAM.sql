

/*					CONSULTAS RESUMEN			*/

/*1.	Calcula el número total de productos que 
hay en la tabla productos.*/
SELECT COUNT(Nom_prod) "Numero De Productos"
FROM productos;

/*2.	Calcula el número total de fabricantes 
que hay en la tabla fabricante.*/
SELECT COUNT(Nom_Fab)
FROM fabricantes;

/*3.	Calcula el número de valores distintos 
de código de fabricante aparecen en la tabla 
productos.*/
SELECT DISTINCT(Cod_Fab)
FROM fabricantes;

/*4.	Calcula la media del precio de todos 
los productos.*/
SELECT AVG(precio)
FROM productos;

/*5.	Calcula el precio más barato de todos 
los productos.*/
SELECT MIN(precio)
FROM productos;

/*6.	Calcula el precio más caro de todos 
los productos*/
SELECT MAX(precio)
FROM productos;

/*7.	Calcula la suma de los precios de 
todos los productos.*/
SELECT SUM(precio)
FROM productos;


/*8.	Calcula el número de productos que 
tiene el fabricante con código 1.*/
SELECT COUNT(Nom_Prod) "Número De Productos"
FROM productos
WHERE Cod_Fab = 1;


/*9.	Calcula la media del precio de todos 
los productos del fabricante 1*/
SELECT round(AVG(precio),2) "Media de precio"
FROM productos
WHERE Cod_Fab = 1;

/*10.	Calcula el precio más barato de todos 
los productos del fabricante 3*/
SELECT MIN(precio) "Más barato"
FROM productos
WHERE Cod_Fab = 3;

/*11.	Calcula el precio más caro de todos 
los productos del fabricante 2.*/
SELECT MAX(precio) "Más caro"
FROM productos
WHERE cod_fab = 2;

/*12.	Calcula la suma de todos los productos 
del fabricante 4.*/
SELECT SUM(precio) "Suma Total"
FROM productos
WHERE cod_fab=4;

/***************************		GROUP BY		**************************/

/*13.	Mostrar el precio medio de los productos 
de cada fabricante, junto con el código de 
fabricante y el nombre del mismo. Redondear a dos decimales.*/
SELECT round(AVG(precio),2) AS "Precio Medio",Cod_Fab
FROM productos
GROUP BY Cod_Fab;

/*14.	Mostrar el salario medio por departamento, 
junto con el código del departamento. 
Redondear a dos decimales.*/
SELECT round(AVG(salario),2) AS "Salario Medio", dept_no
FROM empleados
GROUP BY dept_no;

/*15.	Calcular el salario medio que se gana 
en cada oficio, ordenando por la media de salario 
de forma descendente. Mostrar el oficio y la media 
del salario redondeada a dos decimales.*/
SELECT oficio,round(AVG(salario),2) AS media
FROM empleados
GROUP BY oficio
ORDER BY media DESC;

/*16.	Mostrar el código del director (dir) 
junto con la emdia de salarios que cobran 
sus empleados, ordenando por salario de 
forma descendente y redondeando la media a dos decimales.*/
SELECT dir, round(AVG(salario),2) AS media
FROM empleados
GROUP BY dir
ORDER BY media desc;

/*17.	Mostrar el salario medio de los empleados en función del
año en que fueron contratados. */
SELECT year(fecha_alt) "AÑO",AVG(salario) AS media
FROM empleados
GROUP BY year(fecha_alt);

/*****************************	CLÁSULA HAVING 	*************************/

/*18.	Mostrar el salario medio para cada oficio, 
y el oficio, pero solo para aquellos oficios cuyo 
salario máximo redondeado a dos decimales 
sea mayor o igual que 3000 euros*/
SELECT oficio,round(AVG(salario),2) media
FROM empleados
GROUP BY oficio
HAVING media >= 3000;

/*19.	Mostrar el número de departamento de aquellos 
departamentos cuyo  salario medio de los que tengan 
como oficio "EMPLEADO" sea mayor de  1500 euros.*/
SELECT dept_no
FROM empleados
WHERE oficio = "EMPLEADO"
GROUP BY dept_no
HAVING AVG(salario) > 	1500;

SELECT dept_no, COUNT(*) AS Numero
FROM empleados
GROUP BY dept_no
HAVING COUNT(*) > 3
ORDER BY COUNT(*) DESC;


/*1.	Mostrar la media de salarios por departamento.*/
SELECT AVG(salario) "Media de salario"
FROM empleados
GROUP BY dept_no;

/*2.	Hallar el sario máximo, el mínimo y la diferencia 
entre ellos para cada departamento.*/
SELECT MAX(salario) Maximo,MIN(salario) Minimo, (MAX(salario) - MIN(salario)) as diferencia
FROM empleados
GROUP BY dept_no;

/*3.	Mostrar los departamentos que tengan más de dos
trabajadores con oficio ‘VENDEDOR’.*/
SELECT dept_no
FROM empleados
WHERE oficio = "VENDEDOR"
GROUP BY dept_no
HAVING COUNT(emp_no) > 2;

/*4.	Mostrar los códigos de los departamentos cuya media 
de salario sea la más alta.*/
SELECT dept_no
FROM empleados
GROUP BY dept_no
HAVING AVG(salario) >= ALL (SELECT AVG(salario)
									FROM empleados
									GROUP BY dept_no);

/*5.	Mostrar el número de departamento de aquellos 
departamentos cuyo salario medio de los que tengan 
como oficio "EMPLEADO" sea mayor de 1500 euros*/
SELECT dept_no
FROM empleados
WHERE oficio = "EMPLEADO"
GROUP BY dept_no
HAVING AVG(salario) > 1500;

/*6.	Mostrar el número de departamento y el número 
de empleados que pertenecen al mismo para todos aquellos 
departamentos cuyo número de empleados sea mayor que 3. 
Ordena por el número de empleados de forma descendente.*/
SELECT dept_no, count(emp_no)
FROM empleados
GROUP BY dept_no
HAVING COUNT(emp_no) > 3
ORDER BY COUNT(emp_no) DESC;


/*************************************************************/

/*1.	Selecciona los  apellidos de aquellos empleados 
cuyo oficio sea el  mismo que el de 'GIL'.*/
SELECT apellido
FROM empleados
WHERE oficio = (SELECT oficio
					FROM empleados 
					WHERE apellido = 'GIL');

/*2.	Selecciona los apellidos de aquellos empleados 
cuyo oficio sea el  mismo que el del empleado número 7369.*/
SELECT apellido 
FROM empleados 
WHERE oficio = (SELECT oficio 
					FROM empleados
					WHERE emp_no = 7369);
					

/*3.	Selecciona el número de empleado, el apellido y el oficio 
de aquellos empleados cuyo oficio coincida con algún 
oficio de los empleados del departamento número 20.*/
SELECT emp_no,apellido, oficio
FROM empleados
WHERE oficio = ANY (SELECT oficio 
					FROM empleados
					WHERE dept_no = 20);

/*4.	Selecciona el apellido, el salario y el número de 
departamento de aquellos empleados que trabajen en el mismo 
departamento que el empleado de apellido 'ARROYO' 
y cuyo salario sea menor que el de éste.*/
SELECT apellido, salario, dept_no
FROM empleados
WHERE dept_no = (SELECT dept_no
						FROM empleados
						WHERE apellido = "ARROYO") AND salario < (SELECT salario
																			FROM empleados
																			WHERE apellido = "ARROYO");

/*5.	Muestra el apellido y el salario de aquellos empleados 
cuyo salario sea menor que la media de la empresa.*/
SELECT apellido,salario
FROM empleados
WHERE salario < (SELECT AVG(salario) 
						FROM empleados);

/*6.	Seleccionar el apellido y el salario de los empleados 
cuyo salario sea mayor que el mayor salario medio de todos 
los departamentos.*/
SELECT apellido, salario
FROM empleados
WHERE salario > ALL (SELECT AVG(salario)
							FROM empleados
							GROUP BY dept_no);
							
/*7.	Seleccionar el apellido y el salario de los empleados 
cuyo salario sea mayor que el mayor salario medio de al 
menos un departamento.*/
SELECT apellido, salario
FROM empleados
WHERE salario >= ANY (SELECT AVG(salario)
							FROM empleados
							GROUP BY dept_no);
							
/*8.	Mostrar los nombres de los departamentos 
en los que haya empleados asignados.*/
SELECT dnombre
FROM departamentos
WHERE dept_no IN (SELECT dept_no
						FROM empleados);



