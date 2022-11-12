/*1*/

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
FROM alum2006
WHERE apellidos LIKE "%perez%";

/*7*/

SELECT DNI, NOMBRE, APELLIDOS, CURSO, NIVEL, CLASE
FROM alum2006
WHERE poblacion IN ('MARCHAMALO','CABANILLAS','YUNQUERA');

/* 88888888888888888888888888888888 */

Select DNI, NOMBRE, APELLIDOS, CURSO, NIVEL, CLASE 
FROM alum2006
WHERE year(CURDATE())- YEAR (fecha_nac)  BETWEEN  17 and 20;



/*9*/

SELECT DNI, NOMBRE, APELLIDOS, GREATEST (Faltas1,Faltas2,Faltas3)
FROM alum2006
WHERE nivel = 'ESO' ;

/*10 */

SELECT DNI, NOMBRE, APELLIDOS, NIVEL, (faltas1+faltas2+faltas3)/3 as 'MED_FALTAS'
FROM alum2006
WHERE nivel IN ('ESO', 'ESI');

/*11    333333333333333333333333333*/

SELECT DNI, NOMBRE, APELLIDOS, NIVEL
FROM alum2006
WHERE YEAR(fecha_nac)=1985 AND MONTHNAME(fecha_nac)='February';

/*12*/

SELECT 
FROM alum2006
WHERE ;

/*13*/

SELECT 
FROM alum2006
WHERE ;

/*14*/

SELECT 
FROM alum2006
WHERE ;

/*15*/

SELECT DNI, NOMBRE, APELLIDOS, CURSO, NIVEL, CLASE, year(CURDATE())- YEAR (fecha_nac) AS 'EDAD'
FROM alum2006
WHERE nivel NOT IN ('ESO','BAC')
ORDER BY curso, nivel, clase ASC, apellidos DESC;

/*16*/
SELECT 
FROM alum2006
WHERE ;


