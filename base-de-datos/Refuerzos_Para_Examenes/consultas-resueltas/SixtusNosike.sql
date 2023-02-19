/*Ejercicio 1.	*/
SELECT *
FROM profesores
WHERE profesores.apellidos LIKE "%A" AND profesores.especialidad = "INFORMÁTICA";

/*Ejercicio 2. */
SELECT MIN(salario) "Salario Mínimo", MAX(salario) "Salario Máximo"
FROM personal 
GROUP BY cod_centro
HAVING MIN(salario) > 1200;

/*Ejercicio 3.	*/
SELECT personal.apellidos, centros.tipo_centro
FROM personal LEFT JOIN centros
ON personal.cod_centro = centros.cod_centro
WHERE personal.funcion = "ADMINISTRATIVO"; /*LA PARTE DE QUE NO TENGA ASIGNADO 
											NINGÚN CENTRO "NO HE SABIDO HACERLO"*/
											
/*Ejercicio 4.	*/
SELECT COUNT(*) AS "Cantidad Profesores de Informática"
FROM centros INNER JOIN profesores
ON profesores.especialidad = "INFORMÁTICA" AND centros.nombre = "IES EL QUIJOTE";

/*Ejercicio 5.	*/
SELECT profesores.dni, centros.nombre
FROM centros RIGHT JOIN profesores
ON centros.cod_centro = profesores.cod_centro
ORDER BY profesores.apellidos ASC, centros.nombre DESC;
