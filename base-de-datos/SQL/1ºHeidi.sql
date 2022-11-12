SELECT *
FROM empleados;

SELECT apellido, oficio
FROM empleados;

SELECT apellido, salario, salario*14 as "Salario_anual"
FROM empleados;

SELECT *
FROM empleados
WHERE salario > 2000;



SELECT apellido, salario, salario%10 AS "10% Salario"
FROM empleados;

SELECT *
FROM empleados
WHERE apellido = "SALA" OR  APELLIDO = "Gil";

SELECT *
FROM empleados
WHERE salario >= 1500 ;
SELECT *
FROM empleados
WHERE Oficio<>'vendedor';

SELECT *
FROM empleados
WHERE (salario >=1000) AND (SALARIO <=1500);

SELECT *
FROM empleados
WHERE apellido = "SALA" OR  APELLIDO = 'Gil';

SELECT *, Salario*14 AS "Salario_anual"
FROM empleados
WHERE Salario*14>=30000;

/* no va ver en clase*/
SELECT *, Salario*14 AS "Salario_anual"
FROM empleados
WHERE Salario_anual>=30000;


SELECT * 
FROM empleados
WHERE salario > 3000 OR dir=7839 AND ;
/* ESTAS DOS EXPRESIONES VALEN PARA LO MISMO*/

SELECT * 
FROM empleados
WHERE salario > 1500 AND NOT oficio='DIRECTOR';

SELECT * 
FROM empleados
WHERE salario > 1500 AND  oficio<>'DIRECTOR';
/* FIN EXPRESIONES HACEN LOS MISMO*/


/* ESTAS DOS EXPRESIONES VALEN PARA LO MISMO*/
SELECT * 
FROM empleados
WHERE salario IN (1000,1500,2000)

SELECT * 
FROM empleados
WHERE salario=1000 OR salario=1500 or salario=2000;
/* FIN EXPRESIONES HACEN LOS MISMO*/


SELECT * 
FROM empleados
WHERE oficio IN ('VENDEDOR','ANALISTA') ;


/*Fecha de alta todos */

SELECT apellido, oficio, empleados, fecha_alt
FROM empleados
WHERE YEAR (fecha_alt) IN (1990,1991);













