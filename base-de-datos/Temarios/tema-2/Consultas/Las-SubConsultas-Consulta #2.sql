/* Subconsultas utilizar consultas de otras para hacer unas nuevas */

/* Obtener los nombres de los empleados que trabajan  en el departamento
de contabilidad. */
SELECT dnombre 
FROM departamentos
WHERE dnombre = "Contabilidad";

SELECT apellido, dept_no
FROM empleados
WHERE dept_no=10;
/*-----------------------haciendo por separado--------------------------*/


/* 	FORMA DE reallizar correctamente las subconsultas	 */
SELECT apellido,dept_no
FROM empleados 
WHERE dept_no = (	SELECT dept_no
						FROM departamentos
						WHERE dnombre = "Contabilidad");

/*Mostrar los datos de los trabajadortes que trabajan en el departamento que se encuentrqa en Barcelona.*/
SELECT *
FROM empleados
WHERE dept_no = (	SELECT dept_no
						FROM departamentos
						WHERE loc = "barcelona");

/*los empleados que trabajan en el departamento de investigación*/
SELECT * 
FROM empleados
WHERE dept_no = (SELECT dept_no
						FROM departamentos
						WHERE dnombre = "investigación");
						
/* Obtener todos los datos de los productos que fabrica Inves.*/
SELECT * 
FROM productos
WHERE Cod_fab = ( SELECT Cod_fab
						FROM fabricantes
						WHERE Nom_Fab = "INVES");


/* IN .		PARA PONER MÁS VALORES DONDE EL WHERE  EJ.	where cod_fab  IN  1,2,3,4 		
 <> 		es igual a distinto.		*/
 
 
 /* Obtener los empleados que ganan más(salario) que GIL*/
 SELECT * 
 FROM empleados 
 WHERE salario > (SELECT salario 
 						 FROM empleados
						  WHERE apellido = "gil");
						
/* Obtener los empleados que ganan más que los de oficio ANALISTA,
Cuando la subconsulta devolve más de una fila usamos : all, some ...*/
SELECT * 
FROM empleados 
WHERE salario >= ALL (SELECT salario
							FROM empleados 
							WHERE oficio = "analista");

						

/* cuando sabemos que la subconsulta nos va a devolver una sola fila, usaremos los operadores.*/


/*******************************************************************************/
/*1.	Selecciona los apellidos de aquellos empleados 
cuyo oficio sea el mismo que el de Gil*/
SELECT apellido
FROM empleados 
WHERE oficio = ( SELECT oficio
						FROM empleados 
						WHERE apellido = 'gil'
                );
                
/*2.	2.	Selecciona los apellidos de aquellos 
empleados cuyo oficio sea el  mismo que el 
del empleado número 7369.*/
SELECT apellido
FROM empleados 
WHERE oficio = ( SELECT oficio
                  FROM empleados
						WHERE emp_no = 7369);

/*!!!!!3.	Selecciona el número de empleado, 
el apellido y el oficio de aquellos empleados 
cuyo oficio coincida (distinto) con algún oficio de 
los empleados del departamento número 20.!!!!!!!*/
SELECT emp_no, apellido, oficio
FROM empleados 
WHERE oficio  = SOME (SELECT DISTINCT oficio 
                 FROM empleados 
					  WHERE dept_no = 20);
					  
SELECT emp_no, apellido, oficio 
FROM empleados 
WHERE oficio IN (SELECT DISTINCT oficio 
                  FROM empleados
						WHERE dept_no = 20);

/*4.	Selecciona el apellido, el salario 
y el número de departamento de aquellos 
empleados que trabajen en el mismo departamento 
que el empleado de apellido 'ARROYO' y 
cuyo salario sea menor que el de éste*/
SELECT apellido, salario, dept_no
FROM empleados
WHERE dept_no = (SELECT dept_no
                 FROM empleados
					  WHERE apellido = 'ARROYO')
					  AND salario < (SELECT salario
					                 FROM empleados 
										  WHERE apellido = 'ARROYO');
					  
/*5.	Muestra el apellido y el salario de 
aquellos empleados cuyo salario sea menor 
que la media de la empresa.*/	
SELECT apellido, salario
FROM empleados 
WHERE salario < AVG(salario);

/*6.	Seleccionar el apellido y el salario de los 
empleados cuyo salario sea mayor que el mayor 
salario medio de todos los departamentos.*/
SELECT apellido, salario
FROM empleados 
WHERE salario 
						