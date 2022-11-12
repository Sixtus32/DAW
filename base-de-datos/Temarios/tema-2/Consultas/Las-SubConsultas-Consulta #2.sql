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

/*Mostrar los datos de los trabajadortes que trabajan en el departamento que se encuentrqa en Bilbao.*/
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
						


						
						