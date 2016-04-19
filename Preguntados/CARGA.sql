insert into carrera(carrera) values
	('Area Comun'),('Ingenieria en Sistemas');
select * from carrera;

insert into curso(cod_carrera, nombre, activo) values
	--(1, 'Mate 1',true),(1,'Mate Intermedia 15',false),
	--(2,'IPC2',true),(2,'compi 3',false),
	(2,'IPC1',true);
select * from curso;

insert into item(nombre, descripcion, rareza, efectividad, bonus_gana, bonus_pierde, tipo) values
	('Ocarina de los Vientos','Controla los vientos de todos los tiempos',10,50,3,0,'Un uso'),
	('Pocion polijugos','Una pocion rara, realmente rara',75,30,2,-2,'Un uso'),
	('Escencia de nada','Simplemente un estorbo',96,100,1,-1,'Equipo');
select * from item;

insert into usuario(rol, username, pass, email, exp, activo) values
	('Jugador','HolaMundo','passwordfacil','HolaMundo@mundirijillo.com',1000,true),
	('Moderador','KillEmAll','12345678','elpanditoso@hotmail.com',200,true),
	('Administrador','Usuario1','noposmipasword','elmejorde.todos@gmail.com',null,true),
	('Jugador','EsteUsuario','testingtesting','whoami@correo.com',null,true);
select * from usuario;

insert into avatar(cod_usuario, nombre) values
	(1,'Pedrito'),(1,'Rudolph'),
	(2,'Newton'),(2,'Einstein'),
	(4,'Edmundo');
select * from avatar;

insert into miavatar(cod_avatar, cod_inventario) values
	();
select * from miavatar;

insert into nivel(nombre, exp) values
	('Facil',70),('Intermedio',150),('Dificil',500),('Muy Dificil',800);
select * from nivel;

insert into pregunta(cod_curso, cod_nivel, pregunta, estado) values
	(5,1,'Es un pilar de la Programacion Orientada a Objetos',false),
	(3,2,'SENTENCIA SQL QUE INDICA CONDICION PARA CONSULTAS
			AGREGADAS',false);
select * from pregunta;

insert into respuesta(cod_pregunta, opcion, correcta) values
	(1,'Polimorfismo',true),(1,'Consistencia',false),(1,'Solidez',false),(1,'Concurrencia',false),
	(2,'WHERE',false),(2,'VALUES',false),(2,'HAVING',true),(2,'ORDER BY',false);
select * from respuesta;