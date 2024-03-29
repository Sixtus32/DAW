--
-- TABLA NOTAS_ALUMNOS
--

CREATE TABLE NOTAS_ALUMNOS
 (
   nombre_alumno VARCHAR(25) NOT NULL ,
   nota1 TINYINT(2),
   nota2 TINYINT(2),
   nota3 TINYINT(2),
   asignatura VARCHAR(25),
   curso VARCHAR(4)
 ) ;
 
INSERT INTO NOTAS_ALUMNOS VALUES ('Alcalde Garc�a, M. Luisa',5,5,5,'MATEM�TICAS','4ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Benito Mart�n, Luis',7,6,8, 'MATEM�TICAS','3ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Casas Mart�nez, Manuel',7,5,5,'LENGUA','4ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Corregidor S�nchez, Ana',6,9,8,'LENGUA','3ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('D�az S�nchez, Mar�a',NULL,NULL,7, 'LENGUA','4ESO');

--
-- TABLA ALUM2006
--


CREATE TABLE ALUM2006
(
  dni	        VARCHAR(10),
  nombre	VARCHAR(15),
  apellidos	VARCHAR(20),
  fecha_nac	DATE,
  direccion	VARCHAR(20),
  poblacion	VARCHAR(20),
  provincia	VARCHAR(20),
  curso	        INT(2),
  nivel	        VARCHAR(3),
  clase	        CHAR(1),
  faltas1	INT(2),
  faltas2	INT(2),
  faltas3	INT(2)
 ) ;

INSERT INTO ALUM2006 VALUES('123456789','Juan', 'Cabello Panzano', '1990-08-16', 
 'C/F�lix Fern�ndez 12','BERROCALEJO', 'CACERES', 3, 'ESO', 'A', 0,0,0 );

INSERT INTO ALUM2006 VALUES('123456788','Julia', 'Cabello Panzano', '1990-08-16', 
 'C/F�lix Fern�ndez 12','BERROCALEJO', 'CACERES', 3, 'ESO', 'A', 4,0,2 );

INSERT INTO ALUM2006 VALUES('123456787','Mar�a', 'Mart�n P�rez', '1989-12-16', 
 'C/Doctor Vazquez 33','GUADALAJARA', 'GUADALAJARA', 4, 'ESO', 'B', 1,0,0 );

INSERT INTO ALUM2006 VALUES('123456786','Manuel', 'G�mez P�rez', '1988-07-06', 
 'C/Segovia 23','MARCHAMALO', 'GUADALAJARA', 1, 'ESI', 'A', NULL,0,0 );

INSERT INTO ALUM2006 VALUES('123456780','Miguel', 'Fern�ndez Gil', '1988-03-11', 
 'C/Las Ca�as 7B','YUNQUERA', 'GUADALAJARA', 1, 'ESI', 'A', 3,0,0 );

INSERT INTO ALUM2006 VALUES('123456700','Esther', 'Al�a Ramos', NULL, 
 'C/Pil�n 10','YUNQUERA', 'GUADALAJARA', 2, 'ESI', 'A', 3,7,2 );


COMMIT;

