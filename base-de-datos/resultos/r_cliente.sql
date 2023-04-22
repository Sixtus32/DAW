# 1.	Inserta un nuevo fabricante indicando su código y su nombre.
# AQUÍ.	insert sin espeficar la lista de columnas
insert into tienda.fabricante values(10, 'Lg');

# 2.	Inserta un nuevo fabricante indicando solamente su nombre.
# AQUÍ. insert especificando la lista de columnas 
insert into tienda.fabricante (fabricante.nombre) values('Nokia');

# 3.	Inserta un nuevo producto asociado a uno de los nuevos fabricantes. 
# La sentencia de inserción debe incluir: código, nombre, precio y código_fabricante.
insert into tienda.producto values(12, 'Impresora Generec', 55, 5);

# 4. 	Inserta un nuevo producto asociado a uno de los nuevos fabricantes.
# La sentencia de inserción debe incluir : nombre, precio y código_fabricante.
insert into tienda.producto (producto.nombre, producto.precio, producto.id_fabricante) 
values ('Monitor 4K vg',80,4);

# 5. 	Crea una nueva tabla con el nombre fabricante_productos 
# que tenga las siguientes columnas: nombre_fabricante, nombre_producto y precio. 
# Una vez creada la tabla inserta todos los registros de la base de datos tienda 
# en esta tabla haciendo uso de única operación de inserción.
create table fabricantes_productos ( nombre_fabricante varchar(100), 
nombre_producto varchar(100), precio double);

insert into fabricantes_productos
select tienda.fabricante.nombre, tienda.producto.nombre, tienda.producto.precio
from fabricante inner join producto
on fabricante.id = producto.id_fabricante;

# 6.	Elimina el fabricante Asus. ¿Es posible eliminarlo? 
# Si no fuese posible, ¿qué cambios debería realizar para que fuese posible borrarlo?
delete from tienda.fabricante
where fabricante.nombre='Asus';

# 7.	Elimina el fabricante Xiaomi. ¿Es posible eliminarlo? Si no fuese posible, 
# ¿qué cambios debería realizar para que fuese posible borrarlo?
delete from tienda.fabricante
where fabricante.nombre='Xiaomi';

# 8.	Actualiza el código del fabricante Lenovo y asígnale el valor 20. 
# ¿Es posible actualizarlo? Si no fuese posible, ¿qué cambios debería realizar 
# para que fuese actualizarlo?
update tienda.fabricante set fabricante.id=20 where tienda.fabricante.nombre='Lenovo';

# 9.	Actualiza el código del fabricante Huawei y asígnale el valor 30. 
# ¿Es posible actualizarlo? Si no fuese posible, ¿qué cambios debería realizar 
# para que fuese actualizarlo?
update tienda.fabricante set fabricante.id=30 where tienda.fabricante.nombre='Huawei';

# 10.	Actualiza el precio de todos los productos sumándole 5 € al precio actual.
update tienda.producto set producto.precio=precio+5;

# 11.	Elimina todas las impresoras que tienen un precio menor de 200 €.
delete from tienda.producto 
where producto.nombre like 'Impresora%' and producto.precio < 200;




