/*ejercio 13.	Mostrar el precio MEDIO de los productos de cada fabricante, 
junto con el código de fabricante y el nombre del mismo. 
Redondear a dos decimales. de cada grupo saco una fila*/
SELECT Cod_Fab,Round(AVG(precio),2) AS MEDIA
FROM productos
GROUP BY Cod_Fab;

/*ejercicio 14.	Mostrar el salario medio por departamento,
junto con el código del departamento. Redondear a dos decimales*/
SELECT dept_no,round(AVG(salario),2) AS "SALARIO MEDIO"
FROM empleados
GROUP BY dept_no;

/*ejercicio 15.	Calcular el salario medio que se gana
en cada oficio, ordenando por la media de salario de forma 
descendente. Mostrar el oficio y la media del salario redondeada
a dos decimales.*/
SELECT oficio, round(AVG(salario),2) AS media
FROM empleados
GROUP BY oficio
ORDER BY media DESC;

/*ejercicio 16.	Mostrar el código del director (dir) 
junto con la media de salarios que cobran sus empleados,
ordenando por salario de forma descendente y redondeando 
la media a dos decimales*/
SELECT dir,ROUND (AVG(salario),2) AS media_desc
FROM empleados 
GROUP BY dir
ORDER BY media_desc DESC;

/*ejercicio 17.	Mostrar el salario medio de los 
empleados en función del año en que fueron contratados.*/
SELECT YEAR(fecha_alt) AS Año, round(AVG(SALARIO),2) "SALARIO MEDIO"
FROM empleados
GROUP BY Año;

/*ejercicio 18. Mostrar el salaio medio para cada oficio, 
y el oficio pero solo para aquellos oficios cuyos salario 
máximo redondeado a dos decimales sea mayor o igual que 
3000 euros.*/
SELECT oficio,AVG(salario)
FROM empleados
GROUP BY oficio
HAVING ROUND(MAX(salario),2) >= 3000;

/*ejercio 19. Mostrar el número departamento de aquellos 
departamentos cuyo salario medio de los que tengan como 
oficio "EMPLEADO" sea mayor de 1500*/
SELECT dir,oficio,AVG(SALARIO)
FROM empleados
GROUP BY dept_no
HAVING BY oficio LIKE "EMPLEADO";

/*EJEMPLOS DE HAVING*/


