/*1*/
SELECT *
FROM empleados e
WHERE e.salario=(select MAX(salario) FROM empleados WHERE oficio=e.oficio);
/*2*/
SELECT empleados.apellido, departamentos.dnombre
FROM empleados INNER JOIN departamentos
ON empleados.dept_no=departamentos.dept_no AND dir= ANY(SELECT dir
FROM empleados
GROUP BY dir
having COUNT(*)>=2);
/*3*/
SELECT *
FROM empleados
WHERE dept_no = any(select dept_no
FROM empleados
GROUP BY dept_no
having SUM(salario)>1000);
/*4*/
SELECT *
FROM empleados
WHERE salario >= ALL(SELECT salario
FROM empleados) AND (SELECT COUNT(*) FROM empleados WHERE comision IS NULL)>2;
/*5*/
SELECT *
FROM empleados e
WHERE e.salario<(SELECT AVG(salario) FROM empleados WHERE e.dept_no=dept_no)
AND e.dir=(SELECT dir FROM empleados WHERE e.oficio=oficio);
/*6*/
SELECT e.apellido,e.oficio
FROM empleados e
WHERE e.dept_no=20 AND e.oficio= any(SELECT distinct oficio FROM empleados WHERE dept_no=(SELECT dept_no
FROM departamentos WHERE dnombre='Ventas'));
/*7*/
SELECT e.apellido
FROM empleados e
WHERE e.oficio=(SELECT oficio FROM empleados WHERE apellido='GIL')
AND e.salario=(SELECT salario FROM empleados WHERE apellido='GIL');
/*8*/
SELECT e.apellido,e.oficio,e.salario,e.fecha_alt
FROM empleados e
WHERE e.oficio=(SELECT oficio FROM empleados WHERE apellido='Jimenez')
OR e.salario>=(SELECT salario FROM empleados WHERE apellido='Fernandez');
/*9*/
SELECT d.*
FROM departamentos d, empleados e
WHERE (SELECT COUNT(*) FROM empleados WHERE dept_no=d.dept_no)=0;
AND e.salario=(SELECT max(salario) FROM empleados);

/*10*/
SELECT distinct d.dnombre
FROM departamentos d, empleados e
WHERE d.dept_no= any(SELECT  distinct e.dept_no FROM empleados e 
WHERE((SELECT COUNT(*) FROM empleados WHERE e.fecha_alt=fecha_alt)>1));
AND (SELECT  distinct e.apellido FROM empleados e 
WHERE((SELECT COUNT(*) FROM empleados WHERE e.fecha_alt=fecha_alt)>1)) LIKE(%'A'%);







