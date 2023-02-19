SELECT fabricantes.Nom_Fab
FROM fabricantes
WHERE EXISTS(SELECT *
FROM productos
WHERE productos.cod_Fab=fabricantes.cod_Fab);

SELECT fabricantes.Nom_Fab
FROM fabricantes
WHERE NOT EXISTS(SELECT *
FROM productos
WHERE productos.cod_Fab=fabricantes.cod_Fab);

SELECT *
FROM productos prod
WHERE precio >=all(SELECT precio
FROM productos prod2
WHERE prod2.cod_fab=prod.cod_fab);
/*EXTRA*/
SELECT *
FROM productos
WHERE precio= any(SELECT MAX(precio)
FROM productos
GROUP BY cod_fab);

SELECT *
FROM productos prod
WHERE precio >=all(SELECT avg(precio)
FROM productos prod2
WHERE prod2.cod_fab=prod.cod_fab);

SELECT fabricantes.Nom_Fab,productos.Precio
FROM fabricantes natural JOIN productos
where productos.Precio=any(SELECT MAX(precio)
FROM productos
GROUP BY cod_fab);

SELECT *
FROM productos
WHERE precio=(SELECT max(productos.precio)
FROM productos WHERE productos.Cod_Fab=(SELECT cod_fab FROM fabricantes WHERE nom_fab='INVES'));