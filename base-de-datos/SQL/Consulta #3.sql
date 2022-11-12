SELECT *
FROM alum2006;

/*2*/
SELECT nombre, apellidos
FROM alum2006
WHERE poblacion="GUADALAJARA"; 

/*3*/

SELECT DNI, NOMBRE, APELLIDOS, CURSO, NIVEL, CLASE, (YEAR (CURDATE))-YEAR(fecha_nac)) AS 'EDAD'
FROM alum2006
ORDER BY  apellidos, nombre ASC;

/*4*/
SELECT dni
FROM alum2006
WHERE fecha_nac IS NULL;
/*5*/
SELECT dni
FROM alum2006
WHERE fecha_nac IS NOT NULL;
/*6*/
select DNI, NOMBRE, APELLIDOS 


/*9*/
SELECT dni, nombre, apellidos, GREATEST (Faltas1,Faltas2,Faltas3)
FROM alum2006
WHERE nivel= 'ESO' ;


