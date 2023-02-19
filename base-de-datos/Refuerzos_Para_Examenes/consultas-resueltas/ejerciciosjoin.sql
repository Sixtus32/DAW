/*																																				*/
/*										EJERCICIOS CON JOIN DE DOS O MÁS TABLAS													*/
/*																																				*/
/* 1.	Obtener los nombres de los alumnos y los códigos de las asignaturas en las que están matriculados		*/
SELECT apenom, cod
FROM alumnos INNER JOIN notas
ON alumnos.nif = notas.nif;


/* 2.	Obtener los nombres de todos los alumnos, (aunque no estén matriculados en ninguna asignatura)  junto
con los códigos de las asignaturas en las que están matriculados															*/
SELECT apenom, cod
FROM alumnos LEFT JOIN notas
ON alumnos.nif = notas.nif;

/* 3.	Obtener los nombres de las asignaturas, junto con los nif de los alumnos matriculados						*/
SELECT nombre, nif
FROM asignaturas INNER JOIN notas
ON asignaturas.cod = notas.cod;


/* 4.	Obtener los nombres de todas las asignaturas, junto con los nif de los alumnos matriculados si los hay*/
SELECT nombre, nif
FROM asignaturas LEFT JOIN notas
ON asignaturas.cod = notas.cod;

/* 5.	Obtener los nombres de los alumnos, el nombre de la asignatura, y la nota en cada una de ellas			*/
SELECT apenom, nombre, nota
FROM alumnos INNER JOIN asignaturas INNER JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod;


/* 6.	Seleccionar los nombres de todos los alumnos y su nota en la asignatura de FOL								*/
SELECT apenom, nota
FROM alumnos INNER JOIN asignaturas LEFT JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod
WHERE nombre = 'FOL';


/* 7.	Obtener las notas obtenidas en FOL y los nombres de los alumnos que las han obtenido						*/
SELECT nota, apenom
FROM alumnos INNER JOIN asignaturas INNER JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod
WHERE nombre = 'FOL';
/* 8.	Obtener las notas de FOL y los alumnos que las han obtenido, mostrando también los alumnos no
matriculados																																*/
SELECT nota, apenom
FROM alumnos INNER JOIN asignaturas LEFT JOIN notas
ON alumnos.nif = notas.nif AND notas.cod = asignaturas.cod
WHERE nombre = 'FOL';

/* 9.	Obtener el código de asignaturas, los nombres de los alumnos que están matriculados y su nota en la
misma																																			*/
SELECT cod, apenom, nota
FROM alumnos INNER JOIN notas
ON notas.nif = alumnos.nif;


/* 10.	Obtener los nombres de los alumnos, el nombre de la asignatura en la que están matriculados y su
nota en la misma																															*/
SELECT apenom, nombre, nota
FROM asignaturas INNER JOIN alumnos INNER JOIN notas
ON asignaturas.cod = notas.cod AND notas.nif = alumnos.nif;




/* 11.	Obtener los nombres de todas las asignaturas junto con los nombres de los alumnos matriculados y su nota.*/
SELECT nombre, apenom, nota
FROM alumnos INNER JOIN notas RIGHT JOIN asignaturas
ON asignaturas.cod = notas.cod AND notas.nif = alumnos.nif;


/* 12.	Obtener los nombres de las asignaturas que tengan alumnos, junto con los nombres de los alumnos matriculados y su nota.*/
SELECT nombre, apenom, nota
FROM asignaturas INNER JOIN alumnos INNER JOIN notas
ON asignaturas.cod = notas.cod AND notas.nif = alumnos.nif;

/* Mostrar los nombres de las asignaturas en las que hay más de dos alumnos matriculados */
SELECT nombre
FROM asignaturas INNER JOIN notas   
ON asignaturas.cod = notas.cod
GROUP BY notas.cod
HAVING COUNT(*) >= 2;
/* Mostrar el numero de alumnos matriculados en la asignatura de RET */
SELECT COUNT(*)
FROM notas INNER JOIN asignaturas
ON asignaturas.cod = notas.cod
WHERE nombre = 'RET';

SELECT COUNT(*)
FROM notas
WHERE cod =
		(SELECT cod
		FROM asignaturas
		WHERE nombre = 'RET');
