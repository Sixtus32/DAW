/**		CONSULTAS REPASO  1.PARTE					TABLAS : 		FABRICANTE 		Y		PRODUCTO **/

/*1.	Calcula el número total de productos que 
hay en la tabla productos.*/
SELECT COUNT(*) AS "Número de productos"
FROM productos;

/*2.	Calcula el número total de fabricantes 
que hay en la tabla fabricante.*/
SELECT COUNT(*) AS "Número de fabricantes"
FROM fabricantes;

/*3.	Calcula el número de valores distintos 
de código de fabricante aparecen en la tabla 
productos.*/
SELECT DISTINCT(Cod_Fab) AS "Códigos Distintos"
FROM productos;

/*4.	Calcula la media del precio de todos 
los productos.*/
SELECT AVG(precio) AS "Media de Precios"
FROM productos;

/*5.	Calcula el precio más barato de todos 
los productos.*/
SELECT MIN(precio) AS "Precio Mínimo"
FROM productos;fabric

/*6.	Calcula el precio más caro de todos 
los productos*/
SELECT MAX(precio) AS "Precio Máximo"
FROM productos;

/*7.	Calcula la suma de los precios de 
todos los productos.*/
SELECT SUM(precio) AS "Suma de los Precios"
FROM productos;

/*8.	Calcula el número de productos que 
tiene el fabricante con código 1.*/
SELECT COUNT(*) "Número de productos"
FROM productos
WHERE productos.Cod_Fab = 1;

/*9.	Calcula la media del precio de todos 
los productos del fabricante 1*/
SELECT (precio)
FROM productos														/**/
WHERE Cod_Fab = 1;

/*10.	Calcula el precio más barato de todos 
los productos del fabricante 3*/
SELECT MIN(precio) "Precio más barato"
FROM productos
WHERE Cod_Fab = 3;


/*11.	Calcula el precio más caro de todos 
los productos del fabricante 2.*/
SELECT MAX(precio) 
FROM productos
WHERE Cod_Fab = 2;

/*12.	Calcula la suma de todos los productos 
del fabricante 4.*/
SELECT SUM(precio)
FROM productos
WHERE Cod_Fab = 4;



/**		CONSULTAS REPASO  2.PARTE			USO DE GROUP BY	and ORDER BY	TABLAS : 		FABRICANTE 		Y		PRODUCTO **/

/*13.	Mostrar el precio medio de los productos 
de cada fabricante, junto con el código de 
fabricante y el nombre del mismo. Redondear a dos decimales.*/
SELECT round(AVG(precio),2)
FROM productos
GROUP by Cod_Fab;

/*14.	Mostrar el salario medio por departamento, 
junto con el código del departamento. 
Redondear a dos decimales.*/
SELECT ROUND(AVG(salario),2)
FROM empleados
GROUP BY dept_no;

/*15.	Calcular el salario medio que se gana 
en cada oficio, ordenando por la media de salario 
de forma descendente. Mostrar el oficio y la media 
del salario redondeada a dos decimales.*/
SELECT oficio, ROUND(AVG(salario)) as media
FROM empleados
GROUP BY oficio
ORDER by media DESC;

/*16.	Mostrar el código del director (dir) 
junto con la emdia de salarios que cobran 
sus empleados, ordenando por salario de 
forma descendente y redondeando la media a dos decimales.*/
SELECT dir, round(AVG(salario)) salary
FROM empleados
GROUP BY emp_no
ORDER BY salary DESC;


/*17.	Mostrar el salario medio de los empleados en función del
año en que fueron contratados. */
SELECT AVG(salario)
FROM empleados 
GROUP BY YEAR(fecha_alt);

/**		CONSULTAS REPASO  3.PARTE			USO DE HAVING	TABLAS : 		FABRICANTE 		Y		PRODUCTO **/

/*18.	Mostrar el salario medio para cada oficio, 
y el oficio, pero solo para aquellos oficios cuyo 
salario máximo redondeado a dos decimales 
sea mayor o igual que 3000 euros*/
SELECT round(AVG(salario),2) as medio
FROM empleados 
GROUP BY oficio 
HAVING medio >= 3000;


/*19.	Mostrar el número de departamento de aquellos 
departamentos cuyo  salario medio de los que tengan 
como oficio "EMPLEADO" sea mayor de  1500 euros.*/
SELECT dept_no
FROM empleados 
WHERE oficio = "EMPLEADO"
GROUP BY dir
HAVING AVG(salario) > 1500;



/**		CONSULTAS DEL EXAMEN 		**/
/* 1 Mostrar los datos de los autores qcuyo pais de nacimiento es españa o cuba, que no tengan fecha de devolución*/
SELECT * 
FROM autores 
WHERE pais_nac IN ("ESPAÑA","CUBA") AND fecha_defun IS NULL;

/* 2 Mostrar los datos de los libros cuyo precio coincida con el minimo */
SELECT * 
FROM libros 
WHERE precio = (SELECT MIN(precio)
					FROM libros);


/* 3 Mostrar el codigo de autror junto con la cantidad de libros */
-- grup by, en el select solo puedo poner la funcion por la que agrupo, 
SELECT cod_autor, COUNT(*) cantidad
FROM escriben
GROUP BY cod_autor
HAVING cantidad > 2;

/* 4 Mostrar todas las editoriales cuyo nombre termine en "A". Obtener de forma */
SELECT *
FROM editoriales
WHERE nom_editorial LIKE "%A";

/* 5 Mostrar los libros de la editoria anaya*/
SELECT *
FROM libros
WHERE cod_editorial = (SELECT cod_editorial
								FROM editoriales
								WHERE nom_editorial = "ANAYA");


/**		CONSULATAS CON JOIN 			**/
/* 1.	Obtener los nombres de los alumnos y los códigos de las asignaturas en las que están matriculados		*/
/* 2.	Obtener los nombres de todos los alumnos, (aunque no estén matriculados en ninguna asignatura)  junto
con los códigos de las asignaturas en las que están matriculados	
/* 3.	Obtener los nombres de las asignaturas, junto con los nif de los alumnos matriculados						*/
/* 4.	Obtener los nombres de todas las asignaturas, junto con los nif de los alumnos matriculados si los hay*/
/* 5.	Obtener los nombres de los alumnos, el nombre de la asignatura, y la nota en cada una de ellas			*/
/* 6.	Seleccionar los nombres de todos los alumnos y su nota en la asignatura de FOL								*/
















repaso