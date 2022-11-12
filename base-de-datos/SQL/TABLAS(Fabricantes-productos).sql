
CREATE TABLE fabricantes (
 Cod_Fab   SMALLINT(4) PRIMARY KEY,
 Nom_Fab   VARCHAR(20) NOT NULL
);

INSERT INTO fabricantes VALUES (1,'INVES');
INSERT INTO fabricantes VALUES (2,'IBM');
INSERT INTO fabricantes VALUES (3,'TOSHIBA');
INSERT INTO fabricantes VALUES (4,'HP');
INSERT INTO fabricantes VALUES (5,'COMPAQ');


CREATE TABLE productos (
 Cod_Prod  SMALLINT(4) PRIMARY KEY,
 Nom_Prod  VARCHAR(30) NOT NULL,
 Precio    FLOAT,
 Cod_Fab   SMALLINT(4),
 FOREIGN KEY (Cod_Fab) REFERENCES fabricantes(Cod_Fab) ON DELETE CASCADE
);

INSERT INTO productos VALUES (1, 'Portátil', 1000, 1);
INSERT INTO productos VALUES (2, 'Ratón', 25, 4);
INSERT INTO productos VALUES (3, 'Teclado', 60, 4);
INSERT INTO productos VALUES (4, 'Monitor', 150, 1);
INSERT INTO productos VALUES (5, 'Disquetera', 65, 3);
INSERT INTO productos VALUES (6, 'Lector DVD', 30, 3);
INSERT INTO productos VALUES (7, 'Grabadora DVD', 65, 3);
INSERT INTO productos VALUES (8, 'Combo', 120, 1);
INSERT INTO productos VALUES (9, 'Impresora', 280, 4);
INSERT INTO productos VALUES (10, 'Escáner', 170, 4);