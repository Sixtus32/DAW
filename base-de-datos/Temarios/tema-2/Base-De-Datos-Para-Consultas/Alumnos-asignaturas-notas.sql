
-- ------------------------------------------------
--  TABLAS ALUMNOS, ASIGNATURAS, NOTAS  -----------
-- ------------------------------------------------


CREATE TABLE alumnos
(
  nif    VARCHAR(10) NOT NULL,
  apenom VARCHAR(30),
  direc  VARCHAR(30),
  pobla  VARCHAR(15),
  telef  VARCHAR(10)  
) ;

CREATE TABLE asignaturas
(
  cod    TINYINT UNSIGNED NOT NULL,
  nombre VARCHAR(25)
) ;


CREATE TABLE notas
(
  nif  VARCHAR(10) NOT NULL,
  cod  TINYINT UNSIGNED NOT NULL,
  nota FLOAT(3,1)
);

INSERT INTO asignaturas VALUES (1,'Prog. Leng. Estr.');
INSERT INTO asignaturas VALUES (2,'Sist. Informáticos');
INSERT INTO asignaturas VALUES (3,'Análisis');
INSERT INTO asignaturas VALUES (4,'FOL');
INSERT INTO asignaturas VALUES (5,'RET');
INSERT INTO asignaturas VALUES (6,'Entornos Gráficos');
INSERT INTO asignaturas VALUES (7,'Aplic. Entornos 4ªGen');
INSERT INTO asignaturas VALUES (8,'Idioma');


INSERT INTO alumnos VALUES
('12344345','Alcalde García, Elena', 'C/Las Matas, 24','Madrid','917766545');

INSERT INTO alumnos VALUES
('4448242','Cerrato Vela, Luis', 'C/Mina 28 - 3A', 'Madrid','916566545');

INSERT INTO alumnos VALUES
('56882942','Díaz Fernández, María', 'C/Luis Vives 25', 'Móstoles','915577545');

INSERT INTO notas VALUES('12344345', 1,6);
INSERT INTO notas VALUES('12344345', 2,5);
INSERT INTO notas VALUES('12344345', 3,6);

INSERT INTO notas VALUES('4448242', 4,6);
INSERT INTO notas VALUES('4448242', 5,8);
INSERT INTO notas VALUES('4448242', 6,4);
INSERT INTO notas VALUES('4448242', 7,5);

INSERT INTO notas VALUES('56882942', 4,8);
INSERT INTO notas VALUES('56882942', 5,7);
INSERT INTO notas VALUES('56882942', 6,8);
INSERT INTO notas VALUES('56882942', 7,9);

COMMIT;


-- ******** FIN ***********************

