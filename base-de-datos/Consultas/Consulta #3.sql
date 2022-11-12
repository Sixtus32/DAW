/*ejercio 13*/
SELECT COD_FAB,ROUND(2),AVG(precio)
FROM productos
GROUP BY cod_fab;