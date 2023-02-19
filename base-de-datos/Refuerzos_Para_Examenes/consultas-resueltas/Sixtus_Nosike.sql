/*EJERCIO 1*/
SELECT * 
FROM libros
WHERE cod_editorial <= 20
GROUP BY cod_editorial
HAVING unidades_vendidas > 1000;

/*EJERCICIO 2*/
SELECT * 
FROM libros
WHERE precio = ALL (SELECT max(precio) 
					FROM libros);

/*EJERCICIO 3*/
SELECT cod_autor "Código de autor", COUNT(*) "Cantidad Escrita"
FROM escriben
GROUP BY cod_libro
HAVING COUNT(*) > 2;

/*EJERCICIO 4*/
SELECT nom_editorial
FROM editoriales
WHERE nom_editorial ENDS "S";

/*EJERCICIO 5*/
SELECT *
FROM editoriales
WHERE cod_editorial = (SELECT cod_editorial
								FROM editoriales
								WHERE nom_editorial = "ANAYA");


