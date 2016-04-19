CREATE DATABASE dbpreguntados;

CREATE TABLE usuario(
    cod_usuario serial PRIMARY KEY,
    rol varchar(15),--administrador | moderador | usuario
    username varchar(20),
    pass varchar(20),
    email varchar(30),--holamundo@mundirijillo.com
    exp Integer,
    activo boolean
);
drop table usuario;

CREATE TABLE item(
    cod_item serial PRIMARY KEY,
    nombre varchar(30),
    descripcion varchar(75),
    rareza Integer,
    efectividad Integer,
    bonus_gana Integer,
    bonus_pierde Integer,
    tipo varchar(15)--equipo | un solo uso
);
drop table item;

CREATE TABLE inventario(
    cod_inventario serial PRIMARY KEY,
    cod_usuario int,
    cod_item int,
    estado varchar(15),--disponible | utilizado
    FOREIGN KEY (cod_usuario) REFERENCES usuario(cod_usuario),
    FOREIGN KEY (cod_item) REFERENCES item(cod_item)
);
drop table inventario;

CREATE TABLE avatar(
    cod_avatar serial PRIMARY KEY,
    cod_usuario int,
    nombre varchar(15),
    FOREIGN KEY (cod_usuario) REFERENCES usuario(cod_usuario)
);
drop table avatar;

CREATE TABLE miAvatar(
    cod_miAvatar serial PRIMARY KEY,
    cod_avatar Integer,
    cod_inventario Integer,
    FOREIGN KEY (cod_avatar) REFERENCES avatar(cod_avatar),
    FOREIGN KEY (cod_inventario) REFERENCES inventario(cod_inventario)
);
drop table miAvatar;

CREATE TABLE carrera(
    cod_carrera serial PRIMARY KEY,
    carrera varchar(40)--area comun | ingenieria en sistemas
);
drop table carrera;

CREATE TABLE curso(
    cod_curso serial PRIMARY KEY,
    cod_carrera Integer,
    nombre varchar(50),--matematica | introduccion a la programacion y computacion 2 | 
    activo boolean,--true | false
    FOREIGN KEY (cod_carrera) REFERENCES carrera(cod_carrera)
);
drop table curso;

CREATE TABLE nivel(
    cod_nivel serial PRIMARY KEY,
    nombre varchar(15),--facil | intermedio | dificil | muy dificil
    exp Integer
);
drop table nivel;

CREATE TABLE pregunta(
    cod_pregunta serial PRIMARY KEY,
    cod_curso Integer,
    cod_nivel Integer,
    pregunta varchar(75),
    estado boolean,
    FOREIGN KEY (cod_curso) REFERENCES curso(cod_curso),
    FOREIGN KEY (cod_nivel) REFERENCES nivel(cod_nivel)
);
drop table pregunta;

CREATE TABLE respuesta(
    cod_respuesta serial PRIMARY KEY,
    cod_pregunta Integer,
    opcion varchar(75),
    correcta boolean,
    FOREIGN KEY (cod_pregunta) REFERENCES pregunta(cod_pregunta)
);
drop table respuesta;

INSERT INTO usuario(rol, username, pass) VALUES('Administrador','admin','admin');
SELECT * FROM usuario;

CREATE TABLE partida(
    cod_partida serial PRIMARY KEY
);
drop table partida;

CREATE TABLE sesion(
	cod_sesion serial PRIMARY KEY,
	cod_partida int,
	cod_avatar int,
	FOREIGN KEY(cod_partida) REFERENCES partida(cod_partida),
	FOREIGN KEY(cod_avatar) REFERENCES avatar(cod_avatar)
);
drop table sesion;

CREATE TABLE log(
	cod_log serial PRIMARY KEY,
	cod_sesion int,
	cod_avatar int,
	cod_pregunta int,
	cod_curso int,
	cod_item int,
	posicion int,
	resultado int,
	certeza int,
	FOREIGN KEY(cod_sesion) REFERENCES sesion(cod_sesion),
	FOREIGN KEY(cod_avatar) REFERENCES avatar(cod_avatar),
	FOREIGN KEY(cod_pregunta) REFERENCES pregunta(cod_pregunta),
	FOREIGN KEY(cod_curso) REFERENCES curso(cod_curso),
	FOREIGN KEY(cod_item) REFERENCES item(cod_item)
);
drop table log;