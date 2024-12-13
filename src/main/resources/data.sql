INSERT INTO motores (id, tipo, fabricante) VALUES
    (1, 'V6', 'Ford'),
    (2, 'V12', 'Ferrari'),
    (3, 'ELECTRICO', 'Tesla'),
    (4, 'HIDROGENO', 'Toyota'),
    (5, 'W6', 'Volkswagen');

-- Insertar datos en la tabla Coche
INSERT INTO coches (id, modelo, tipo, matricula) VALUES
    (1, 'Mustang', 'DEPORTIVO', '1234 ABC'),
    (2, 'F40', 'DEPORTIVO', '5678 DEF'),
    (3, 'Model S', 'UTILITARIO', '9012 GHI'),
    (4, 'Mirai', 'SUV', '3456 JKL'),
    (5, 'Golf', 'UTILITARIO', '7890 MNO');

-- Insertar datos en la tabla Taller
INSERT INTO talleres (id, nombre) VALUES
    (1, 'Taller Mecánico Pérez'),
    (2, 'Auto Servicio Rodríguez'),
    (3, 'Taller Eléctrico Sánchez'),
    (4, 'Servicio Oficial Ferrari'),
    (5, 'Taller de chapa y pintura Martínez');

-- Inserts tabla arreglos
INSERT INTO arreglos (id, coche_id, taller_id, fecha_arreglo) VALUES
    (1, 1, 3, '1995-04-14'),
    (2, 2, 1, '2005-03-15'),
    (3, 4, 2, '2014-01-04');
