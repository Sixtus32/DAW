/*--------- CORREGIDO EN CLASE -------*/

/* 1 Mostrar los datos de los autores qcuyo pais de nacimiento es españa o cuba, que no tengan fecha de devolución*/

SELECT*
FROM autores
WHERE pais_nac IN("ESPAÑA","CUBA") AND fecha_defun IS NULL;

/* otra forma */
SELECT*
FROM autores
WHERE pais_nac="ESPAÑA" OR pais_nac="CUBA" AND fecha_defun IS NULL; -- Con el OR es necesario repetir el campo. El having funcionaria pero es mas para agrupaciones.


/* 2 Mostrar los datos de los libros cuyo precio coincida con el minimo */
SELECT *
FROM libros
WHERE precio = (SELECT MIN(PRECIO)  -- Es necesario que el precio se compare con algo, el where no puede ir con MAX, MIN (si podrían ir con el having si estamos agrupando) 
					FROM libros);
					

/* 3 Mostrar el codigo de autror junto con la cantidad de libros */
-- grup by, en el select solo puedo poner la funcion por la que agrupo, 
SELECT cod_autor, COUNT(*)
FROM escriben
GROUP BY cod_autor
HAVING COUNT(*)>2;

/* 4 Mostrar todas las editoriales cuyo nombre termine en "A". Obtener de forma */
SELECT *
FROM editoriales
WHERE editoriales.nom_editorial LIKE"%A"
ORDER BY nom_editorial, loc_editorial DESC;

/* 5 Mostrar los libros de la editoria anaya*/
SELECT *
FROM libros
WHERE cod_editorial = (SELECT cod_editorial
								FROM editoriales
								WHERE nom_editorial="anaya");
