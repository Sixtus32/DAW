SELECT * 
FROM empleados, departamentos;

SELECT oficio,empleados.dept_no /*Evitar el ambiguedad con el uso "empleados.dept_no" para saber a que tabla se refiere.*/
FROM empleados,departamentos
WHERE departamentos.dept_no = empleados.dept_no;


/* con el JOIN como se haría el anterior.	*/
SELECT * 
FROM empleados INNER JOIN departamentos
ON empleados.dept_no = departamentos.dept_no;