
-- DROP DATABASE tienda;
CREATE DATABASE if not exists tienda;

USE tienda;

CREATE TABLE if not exists clientes (
    codigo_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre_cliente VARCHAR(50),
    apellidos_cliente VARCHAR(50),
    dni_cliente  VARCHAR(10) unique,
    direccion_cliente VARCHAR(100)
);

INSERT INTO clientes (nombre_cliente, apellidos_cliente, dni_cliente, direccion_cliente) 
VALUES 
('Ivananeitor', 'Tendeitor', '12345678A', 'Calle 123'),
('JuanCar', 'Cambia y Repara', '87654321B', 'Avenida Siempre Viva 742'),
('Adrielote', 'Campechano', '11223344C', 'Plaza Mayor 1'),
('Soniador', 'suspenser', '22334455D', 'Calle Luna 5');

select * from clientes;

use tienda;

drop FUNCTION if EXISTS validar_dni;
delimiter //
create FUNCTION validar_dni (pvalor int(8)) 
returns VARCHAR(1)
deterministic 
BEGIN
 return substring('TRWAGMYFPDXBNJZSQVHLCKE',pvalor%23 +1,1);
end;
//
delimiter ;
set @valor = 12345278;
SELECT validar_dni(@valor) as letra_dni;