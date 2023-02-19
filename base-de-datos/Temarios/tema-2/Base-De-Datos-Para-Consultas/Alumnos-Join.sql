
SELECT alumnos.apenom,notas.cod
FROM alumnos INNER JOIN notas
ON alumnos.nif = notas.nif;