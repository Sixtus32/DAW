/*AGRUPAR POR MAX NOTA*/
SELECT MAX(BD), NRE 
FROM ALUMNO
GROUP BY CURSO;

/*Media de salarios para cada direc. como voy a grupar por dir lo pongo*/
SELECT dir,AVG(SALARIO)
FROM EMPLEADOS 
GROUP BY dir;

/*ORDENAR. SI ESTAS SELECCIONANDO TODOS LOS CAMPOS NO HARA FALTA EL * . */
SELECT * FROM 
EMPLEADOS 
ORDER BY DIR;

/*mostrar salario por max por oficio.*/
SELECT OFICIO, MAX(SALARIO)
FROM EMPLEADOS depart
GROUP BY OFICIO



