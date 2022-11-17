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


						
						