
/*ejercicio 1.*/
/*Y INNER JOIN PRINCIPIO BUSCA COMBINAR VARIAS TABLAS
A LA VEZ.*/
SELECT apenom, cod
FROM alumnos INNER JOIN notas
ON alumnos.nif = notas.nif;

/*ejercicio 2*/
/*Y EL LEFT JOIN BUSCARÁ TREAR TODOS LOS DATOS DE 
DE LA ESPECIFICA AUNQUE NO EXISTA UNA CAMPO EN LA 
TABLA SIGUIENTE REFERENTE A ELLA*/
SELECT apenom,cod 
FROM alumnos LEFT JOIN notas
ON alumnos.nif = notas.nif;

/*ejercicio 3.*/
SELECT asignaturas.nombre, notas.nif
FROM asignaturas INNER JOIN notas
ON asignaturas.cod = notas.cod;

/*ejercico 4.*/
SELECT a.nombre, n.nif
FROM asignaturas a LEFT JOIN notas n
ON a.cod = n.cod;


/*ejercico 5.*/
SELECT apenom,nombre,nota
FROM alumnos INNER JOIN notas INNER JOIN asignaturas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod;



/*ejercicio 6*/
SELECT apenom, nota
FROM alumnos INNER JOIN asignaturas LEFT JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod
WHERE asignaturas.nombre = 'FOL';

/*ejercicio 7*/
SELECT nota, apenom
FROM alumnos INNER JOIN asignaturas INNER JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod
WHERE nombre = 'FOL';


/**ESPECIAL . ....**/
/*Ejercicio 8.*/
SELECT nota, apenom
FROM alumnos INNER JOIN asignaturas LEFT JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod
WHERE nombre = 'FOL';


/*Ejercicio 9. */
SELECT asignaturas.cod, alumnos.apenom, notas.nota
FROM alumnos INNER JOIN asignaturas INNER JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod;

/*Ejercicio 10. */
SELECT alumnos.apenom, asignaturas.nombre, notas.nota
FROM alumnos INNER JOIN asignaturas INNER JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod;



/*Ejercicio 11*/
SELECT asignaturas.nombre, alumnos.apenom, notas.nota
FROM alumnos INNER JOIN notas RIGHT JOIN asignaturas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod;

/*Ejercicio 12*/
SELECT nombre, apenom, nota
FROM alumnos INNER JOIN notas INNER JOIN asignaturas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod;