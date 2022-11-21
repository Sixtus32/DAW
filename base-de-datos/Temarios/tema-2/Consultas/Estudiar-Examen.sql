/*EXAMEN*/

/*Obtener los nombres de aquellos 
con la fecha igual a NULL*/
SELECT nombre
FROM alum2006
WHERE fecha_nac IS NULL;

/*Obtener todos los datos de aquellos
cuyo dia de nacimiento sea distinto a 16*/
SELECT *
FROM alum2006
WHERE day(fecha_nac) != 16;

/*Obtener todos los datos de los que cuya
fecha de nacimiento sea distinto a 1990 y 1989*/
SELECT * 
FROM alum2006
WHERE YEAR(fecha_nac) NOT IN (1990,1989);

/*Juntar valores campo*/
SELECT CONCAT(nombre," ",poblacion) 'Nombre y Población'
FROM alum2006;

/* devolver los valores en MÁYUSCULAS*/
SELECT UPPER(nombre)
FROM alum2006;

/*Obtener el DNI y fecha de nac. 
Y SITUAR LA PALABRA 'FECHA Nula'
si esta es igual NULL*/
SELECT dni,IFNULL(fecha_nac,"Fecha Nula") AS 'fecha'
FROM alum2006;