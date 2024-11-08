create database churreria;
use churreria;

create table producto(
	codigo integer,
	precio double,
	cantidad int,
	tipoDona varchar(20),
	precioRelleno int,
	tipoChurro varchar(20),
	precioBanio double,
	primary key(codigo)
);


create table empleado(
	codigo integer,
	telefono varchar(30),
	tipo varchar (15),
	puesto varchar(20),
	sueldo double,
	sueldoporh double,
	primary key(codigo)

);

