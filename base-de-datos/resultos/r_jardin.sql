# 1. Inserta una nueva oficina en Almería
insert into oficinas values('ALM-ES','Almeria','España','Almeria','439-NVN','+34651321500','+34 631747982','');

# 2. Inserta un empleado para la oficina de Almería 
# que sea representante de ventas.
insert into empleados values (32,'Diego','Velazquez','Montero',3123,'diego@gmail.com','ALM-ES',7,'Representante Ventas');

# 3. Inserta un cliente que tenga como representante 
# de ventas el empleado que hemos creado en el paso anterior.
insert into clientes values (39,'PLUMAS S.L', 'Juan', 'Medina', 470278947, 4729422074, '32 numero Calle Aventuras', null, 
'Almería', 'Fuenta Santa', 'España',6000,32,9000);

# 4.  Inserte un pedido para el cliente que acabamos de crear, 
# que contenga al menos dos productos diferentes.
insert into pedidos values(129,'2010-02-10','2010-03-10','2010-04-10','Pendiente','El pedido esta en camino',39);

# 5. Actualiza el código del cliente que hemos creado en el paso 
# anterior y averigua si hubo cambios en las tablas relacionadas.
update clientes 
set clientes.CodigoCliente=45
where clientes.CodigoCliente=39;
