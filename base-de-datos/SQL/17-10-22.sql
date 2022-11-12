/******OPERADOR LIKE *****/
/*Empleados cuyo apellido comience por A */

SELECT APELLIDO, SALARIO
FROM empleados
WHERE apellido LIKE 'A%';

/* Filtrar aquellos apellidos que terminen en o */

SELECT APELLIDO
FROM empleados
WHERE apellido LIKE '%O';

/*Apellidos y salarios de los empleados cuyo apellido contenga una R */

SELECT apellido
FROM empleados 
WHERE apellido LIKE '%R%';

/*Empleados cuyo apellido tenga 3 caracteres */
SELECT apellido
FROM empleados 
WHERE apellido LIKE '___';

/* Funcion LENGTH, cuya longitud tenga 3 caracteres */
SELECT apellido
FROM empleados 
WHERE LENGTH (apellido)=3;

/********** ORDER BY ***********/ /*se muestran los apellidos en orden ascendente.*/
SELECT *
FROM empleados 
ORDER BY apellido ASC;

SELECT *
FROM empleados 
ORDER BY apellido DESC; /*Lo mismo que el de arriba pero descendente*/

/* Empleados que ganan mas de 1500€ ordenados de forma descendente por salario */
SELECT *
FROM empleados 
WHERE salario > 1500
ORDER BY salario DESC;

/*  */
SELECT oficio, apellido
FROM empleados
ORDER BY oficio ASC, apellido DESC; /*Primero nos ordena por oficio, y luego por apellido.






