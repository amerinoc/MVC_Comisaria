/*INSERCION DE DATOS*/

-- TABLA VEHICULOS
INSERT INTO `VEHICULOS` (`MATRICULA`, `MARCA`, `MODELO`, `KMS`) VALUES
('5348-CV', 'DACIA', 'SANDERO', 131432),
('7134-TO', 'DACIA', 'SANDERO', 25659),
('1932-ME', 'DACIA', 'SANDERO', 999999),
('9603-FG', 'DACIA', 'SANDERO', 250000),
('6824-SA', 'DACIA', 'SANDERO', 457912),

('7789-FS', 'CITROEN', 'C4', 65000),
('9547-IO', 'CITROEN', 'C4', 314500),
('8494-BV', 'CITROEN', 'C4', 94040),
('3545-MJ', 'CITROEN', 'C4', 52600),
('6445-SP', 'CITROEN', 'C4', 420312),

('1920-LW', 'HYUNDAI', 'TUCSON', 824867),
('8710-LI', 'HYUNDAI', 'TUCSON', 75809),
('6000-QW', 'HYUNDAI', 'TUCSON', 895750),
('4878-DA', 'HYUNDAI', 'TUCSON', 261523),
('7710-OP', 'HYUNDAI', 'TUCSON', 348625),

('1647-RV', 'TOYOTA', 'PRIUS', 283055),
('7687-KK', 'TOYOTA', 'PRIUS', 459134),
('2153-CD', 'TOYOTA', 'PRIUS', 61782),
('3844-DV', 'TOYOTA', 'PRIUS', 310705),
('1417-ZX', 'TOYOTA', 'PRIUS', 787354);

-- TABLA ZONAS
INSERT INTO `ZONAS` (`ID_ZONA`, `NOMBRE`) VALUES
(1, 'CENTRO'),
(2, 'NORTE'),
(3, 'ESTE'),
(4, 'SUR'),
(5, 'OESTE'),
(6, 'PERIFERIA');

-- TABLA PATRULLAS
INSERT INTO `PATRULLAS` (`ID_PATRULLA`, `NOMBRE_PATRULLA`) VALUES
(1,'OSCAR-ZULU 30'),
(2,'CHARLIE-ROMEO 7'),
(3,'BRAVO-GOLF 13'),
(4,'VICTOR-SIERRA 8'),
(5,'LIMA-ALFA 16'),
(6,'NOVEMBER-TANGO 5'),
(7,'MIKE-WHISKEY 15'),
(8,'DELTA-ECHO 21'),
(9,'HOTEL-XRAY 4'),
(10,'FOXTROT-QUEBEC 11'),
(11,'JULIET-KILO 7'),
(12,'BRAVO-PAPA 18');

-- TABLA VIGILANCIA
INSERT INTO `VIGILANCIA` (`ID_PATRULLA`, `ID_ZONA`, `FECHA_PATRULLA`) VALUES
(1,3,'2020-01-23'),
(2,2,'2020-01-01'),
(7,1,'2020-01-06'),
(7,2,'2020-01-15'),
(5,5,'2020-01-12'),
(12,3,'2020-01-04'),
(3,6,'2020-02-14'),
(8,4,'2020-02-05'),
(9,1,'2020-02-09'),
(10,2,'2020-02-11'),
(11,2,'2020-02-03'),
(10,4,'2020-02-13'),
(4,5,'2020-02-01'),
(6,3,'2020-02-22'),
(1,1,'2020-02-29'),
(10,5,'2020-03-01'),
(6,6,'2020-03-10'),
(5,4,'2020-03-05'),
(7,3,'2020-03-14'),
(8,6,'2020-03-12'),
(9,3,'2020-03-07'),
(2,5,'2020-03-03'),
(3,2,'2020-03-08');

-- TABLA DEPARTAMENTOS
INSERT INTO `DEPARTAMENTOS` (`ID_DPTO`, `NOMBRE`) VALUES
(1,'DIRECCION'),
(2, 'HOMICIDIOS'),
(3, 'DROGAS'),
(4, 'CIENTIFICA'),
(5,'TRAFICO'),
(6,'CALABOZOS'),
(7,'PRUEBAS'),
(8,'FORENSE');

-- TABLA POLICIAS
INSERT INTO `POLICIAS` (`PLACA`, `NOMBRE`, `APELLIDOS`, `RANGO`, `ID_DPTO`) VALUES
('PO-2960', 'ALBERTO', 'MERINO CHICO', 'DIRECTOR', 1),
('PO-9023', 'ALEJANDRO', 'GARRIDO RAMOS', 'DIRECTOR', 1),
('PO-1714', 'IZAN', 'MARTINEZ BALBAS', 'DIRECTOR', 1),
('PO-4951', 'JORGE', 'SANCHEZ RODRIGUEZ', 'COMISARIO', 1),
('PO-6192', 'SERGIO', 'RAMIREZ COSTA', 'COMISARIO', 1),

('PO-5362', 'RAUL', 'VAZQUEZ MONTERO', 'INSPECTOR', 2),
('PO-8811', 'HUGO', 'LARA GOMEZ', 'SUBINSPECTOR', 2),
('PO-1646', 'SAMUEL', 'VIDAL HERNANDEZ', 'OFICIAL DE POLICIA', 2),
('PO-1320', 'ROBERTO', 'SANGUINO SANCHEZ', 'OFICIAL DE POLICIA', 2),
('PO-9887', 'MANUEL', 'FERNANDEZ MARQUEZ', 'POLICIA', 2),

('PO-9785', 'MARIA', 'GARCIA GONZALEZ', 'INSPECTOR', 3),
('PO-9443', 'FRANCISCO', 'RODRIGIEZ FERNANDEZ', 'OFICIAL DE POLICIA', 3),
('PO-9639', 'PEDRO', 'LOPEZ MARTINEZ', 'OFICIAL DE POLICIA', 3),
('PO-1259', 'ANGEL', 'PEREZ GOMEZ', 'OFICIAL DE POLICIA', 3),

('PO-5833', 'LUCIA', 'MARTIN JIMENEZ', 'OFICIAL DE POLICIA', 4),
('PO-1134', 'ELENA', 'RUIZ HERNANDEZ', 'OFICIAL DE POLICIA', 4),
('PO-2730', 'FERNANDO', 'DIAZ MORENO', 'OFICIAL DE POLICIA', 4),
('PO-2536', 'ADRIAN', 'MUÑOZ MORENO', 'OFICIAL DE POLICIA', 4),

('PO-1745', 'OSCAR', 'ALVAREZ ROMERO', 'POLICIA', 5),
('PO-6020', 'ENRIQUE', 'ALONSO GUTIERREZ', 'POLICIA', 5),
('PO-7212', 'IVAN', 'NAVARRO TORRES', 'POLICIA', 5),
('PO-7837', 'MERCEDES', 'DOMINGUEZ VAZQUEZ', 'POLICIA', 5),

('PO-6780', 'JOAQUIN', 'RAMOS SUAREZ', 'POLICIA', 6),
('PO-6435', 'TERESA', 'ORTEGA DELGADO', 'POLICIA', 6),
('PO-7125', 'PABLO', 'CASTRO ORTIZ', 'POLICIA', 6),
('PO-8569', 'LUIS', 'RUBIO MARIN', 'POLICIA', 6),

('PO-9798', 'JAIME', 'SANZ NUÑEZ', 'OFICIAL DE POLICIA', 7),
('PO-5600', 'IGNACIO', 'IGLESIAS MEDINA', 'POLICIA', 7),
('PO-5297', 'SILVIA', 'CORTES CASTILLO', 'POLICIA', 7),
('PO-9644', 'PAULA', 'SANTOS LOZANO', 'POLICIA', 7),

('PO-3479', 'AITOR', 'GUERRERO CANO', 'INSPECTOR', 8),
('PO-3883', 'SEBASTIAN', 'PRIETO MENDEZ', 'INSPECTOR', 8),
('PO-5446', 'LIDIA', 'CRUZ CALVO', 'SUBINSPECTOR', 8),
('PO-5008', 'INES', 'GALLEGO LEON', 'SUBINSPECTOR', 8);

-- TABLA RONDAS

INSERT INTO `RONDAS` (`PLACA`, `ID_PATRULLA`, `MATRICULA`, `FECHA_RONDA`, `TURNO`) VALUES
('PO-1745', 5, '5348-CV', '2020-01-19', 'MAÑANA'),
('PO-7212', 5, '5348-CV', '2020-01-19', 'MAÑANA'),
('PO-9639', 3, '6445-SP', '2020-01-10', 'MAÑANA'),
('PO-1259', 3, '6445-SP', '2020-01-10', 'MAÑANA'),
('PO-1320', 2, '1647-RV', '2020-02-05', 'MAÑANA'),
('PO-9887', 2, '1647-RV', '2020-02-05', 'MAÑANA'),
('PO-6020', 5, '6000-QW', '2020-02-12', 'MAÑANA'),
('PO-8569', 5, '6000-QW', '2020-02-12', 'MAÑANA'),
('PO-8811', 2, '2153-CD', '2020-01-23', 'MAÑANA'),
('PO-1646', 2, '2153-CD', '2020-01-23', 'MAÑANA'),
('PO-9443', 3, '6000-QW', '2020-01-02', 'TARDE'),
('PO-1259', 3, '6000-QW', '2020-01-02', 'TARDE'),
('PO-5833', 4, '8494-BV', '2020-01-15', 'TARDE'),
('PO-1134', 4, '8494-BV', '2020-01-15', 'TARDE'),
('PO-7837', 5, '1932-ME', '2020-01-26', 'TARDE'),
('PO-7212', 5, '1932-ME', '2020-01-26', 'TARDE'),
('PO-5362', 2, '7687-KK', '2020-02-01', 'TARDE'),
('PO-8811', 2, '7687-KK', '2020-02-01', 'TARDE'),
('PO-9639', 3, '3844-DV', '2020-01-03', 'NOCHE'),
('PO-9785', 3, '3844-DV', '2020-01-19', 'NOCHE'),
('PO-1646', 2, '9547-IO', '2020-01-22', 'NOCHE'),
('PO-9887', 2, '9547-IO', '2020-01-07', 'NOCHE');

-- TABLA CELDAS

INSERT INTO `CELDAS` (`ALA`, `NUMERO`) VALUES
('A', 1),
('A', 2),
('A', 3),
('A', 4),
('A', 5),
('A', 6),
('A', 7),
('A', 8),
('A', 9),
('A', 10),
('B', 11),
('B', 12),
('B', 13),
('B', 14),
('B', 15),
('B', 16),
('B', 17),
('B', 18),
('B', 19),
('B', 20),
('C', 21),
('C', 22),
('C', 23),
('C', 24),
('C', 25),
('C', 26),
('C', 27),
('C', 28),
('C', 29),
('C', 30),
('D', 31),
('D', 32),
('D', 33),
('D', 34),
('D', 35),
('D', 36),
('D', 37),
('D', 38),
('D', 39),
('D', 40);

-- TABLA CRIMINALES
INSERT INTO `CRIMINALES` (`DNI`, `NOMBRE`, `APELLIDOS`, `EDAD`, `MOTE`, `PLACA`) VALUES
('48641231P', 'JACINTO', 'MORALES OCAÑA', '45', 'EL VIKINGO', 'PO-1320'),
('23364026T', 'JOSE MIGUEL', 'ANGEL ARMAS', '20', 'FIRULAIS', 'PO-5362'),
('46824605D', 'GONZALO', 'SIMON SANGUINO', '50', '', 'PO-1646'),
('63335617B', 'ALFREDO', 'INIESTA ANTEQUERA', '33', 'EL RATON', 'PO-1259'),
('78406560C', 'JULIAN', 'HOLGUIN MOSQUERA', '37', 'MARCIANO', 'PO-9443'),
('60345931A', 'JOAQUIN', 'MARZO GRACIA', '41', 'TORO BRAVO', 'PO-8811'),

('47913096W', 'JOSE', 'PORTILLO BONILLA', '63', '', 'PO-1134'),
('62646551A', 'FRANCISCO JOSE', 'URIARTE ESPINOSA', '25', 'CHUCKY', 'PO-2536'),
('64457551M', 'RAUL', 'RABADAN ARNAIZ', '52', '', 'PO-1134'),
('57006513R', 'EDUARDO', 'FIGUEROA CERON', '30', 'EL MEXICANO', 'PO-9887'),
('48931715C', 'JOSE', 'MUÑIZ LABORDA', '57', '', 'PO-8811'),

('53114280N', 'ADRIAN', 'GOMES TABARES', '33', 'EL LEON DE MURCIA', 'PO-5833'),
('56150174K', 'RUBEN', 'GINES VILAS', '28', 'BOTONES', 'PO-1646'),
('17901051J', 'MANUEL', 'PABLOS BAYONA', '30', '', 'PO-5362'),
('69039357G', 'VICTOR', 'AVALOS SOSA', '42', 'MORTADELO', 'PO-6020'),
('31925881H', 'MARCOS', 'GALIANA DURO', '48', 'EL PICADO', 'PO-5833');

-- TABLA RECLUIDOS
INSERT INTO `RECLUIDOS` (`DNI`, `ALA`, `NUMERO`, `MOTIVO`, `FECHA_ENTRADA`, `FECHA_SALIDA`) VALUES
('48641231P', 'B', 14, 'ASALTO DOMESTICO CON VIOLENCIA', '2015-01-19', '2030-01-11'),
('60345931A', 'A', 4, 'ATRACO A MANO ARMADA', '2015-05-25', '2022-10-03'),
('78406560C', 'C', 21, 'TRAFICO DE DROGAS', '2015-12-14', '2029-10-20'),
('64457551M', 'B', 12, 'ASALTO DOMESTICO CON VIOLENCIA', '2016-01-23', '2031-08-06'),
('31925881H', 'D', 34, 'HOMICIDIO', '2016-03-15', '2027-06-02'),
('23364026T', 'D', 33, 'EXTORSION', '2017-10-16', '2038-12-11'),
('56150174K', 'C', 22, 'ROBO CON FUERZA', '2017-10-31', '2035-02-12'),
('69039357G', 'B', 19, 'EVASION DE IMPUESTOS', '2015-08-17', '2028-09-25'),
('53114280N', 'B', 13, 'FALSIFICACION DE DOCUMENTOS', '2018-06-22', '2036-03-06'),
('17901051J', 'D', 40, 'ALLANAMIENTO DE MORADA', '2019-05-14', '2042-08-28'),
('47913096W', 'C', 28, 'FRAUDE', '2020-02-07', '2047-11-07'),
('57006513R', 'B', 15, 'VIOLENCIA DE GENERO', '2020-03-14', '2050-01-24');








