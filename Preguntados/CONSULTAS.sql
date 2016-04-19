--TABLA USUARIO
--	AGREGAR USUARIO
INSERT INTO usuario(rol,username,pass,email);
VALUES('Moderador','rias','gremory','presidenta@hsdxd.com');
--	EDITAR ROL USUARIO
UPDATE usuario SET rol = 'Moderador' WHERE username = 'rias';
--	EDITAR EMAIL USUARIO
UPDATE usuario SET pass = 'presidenta' WHERE username = 'rias';
--	OBTENER CODIGO USUARIO
SELECT cod_usuario FROM usuario WHERE username = 'rias' AND pass = 'gremory' AND email = 'presidenta@hsdxd.com';
--	OBTENER ROL USUARIO
SELECT rol FROM usuario WHERE username = 'issei' AND pass = 'oppais';
--	SELECCIONAR TODOS LOS USUARIOS
SELECT * FROM usuario;

--TABLA CARRERA
--	AGREGAR CARRERA
INSERT INTO carrera(cod_carrera,carrera) VALUES(1,'Ingenieria en sistemas');
--	OBTENER CODIGO CARRERA
SELECT cod_carrera FROM carrera WHERE carrera = 'Ingenieria en sistemas';

SELECT * FROM carrera;

--TABLA CURSO
--	AGREGAR CURSO
INSERT INTO curso(cod_carrera,nombre,activo) VALUES(1,'matematica intermedia 1',true);
--	OBTENER CODIGO CURSO
SELECT cod_curso FROM curso WHERE nombre = 'matematica intermedia 1';

SELECT * FROM CURSO;

--TABLA NIVEL
--	AGREGAR NIVEL
INSERT INTO nivel(nombre, exp) VALUES('intermedio',15);
--	EDITAR EXP NIVEL
UPDATE nivel SET exp = 10 WHERE nombre = 'facil';
--      OBTENER CODIGO DE NIVEL
SELECT cod_nivel FROM nivel WHERE nombre = '';
SELECT * FROM nivel;

--TABLA PREGUNTA
--	AGREGAR PREGUNTA
INSERT INTO pregunta(cod_curso, cod_nivel, pregunta) VALUES(1,1,'integral');
--	EDITAR NIVEL PREGUNTA
UPDATE pregunta SET cod_nivel = 2 WHERE cod_pregunta = 1;
--	EDITAR ESTADO PREGUNTA
UPDATE pregunta SET estado = true WHERE cod_pregunta = 1;
--	OBTENER CODIGO PREGUNTA
SELECT cod_pregunta FROM pregunta WHERE pregunta = 'integral';
--	SELECCIONAR TODAS LAS PREGUNTAS
SELECT * FROM pregunta;

--TABLA RESPUESTA
--	AGREGAR RESPUESTA
INSERT INTO respuesta(cod_pregunta, opcion, correcta) VALUES
(1,'area bajo la curva',true),
(1,'pendiente de recta',false),
(1,'tangente de recta',false),
(1,'un resistor',false);
--	OBTENER CORRECTA RESPUESTA
SELECT correcta FROM respuesta WHERE opcion = 'area bajo la curva';
--	SELECCIONAR TODAS LAS RESPUESTAS POR PREGUNTA
SELECT * FROM respuesta;
--TABLA ITEM
--	AGREGAR ITEM
INSERT INTO item(nombre, descripcion, rareza, efectividad, bonus_gana, bonus_pierde, tipo)
VALUES('saltarin','salta',50,2,5,1,'un uso');
--	OBTENER CODIGO ITEM
SELECT cod_item FROM item WHERE nombre = 'saltarin';
--	OBTENER TIPO ITEM
SELECT tipo FROM item WHERE nombre = 'saltarin';
--	SELECCIONAR TODOS LOS ITEM
SELECT * FROM item;

--VER CUESTIONARIO
SELECT 
  crr.carrera AS "Carrera", 
  cur.nombre AS "Curso", 
  prg.pregunta AS "Pregunta", 
  rsp.opcion AS "Respuesta", 
  nv.nombre AS "Nivel"
FROM 
  pregunta prg, 
  respuesta rsp, 
  curso cur, 
  nivel nv, 
  carrera crr
WHERE 
  rsp.correcta = true AND 
  crr.cod_carrera = cur.cod_carrera AND 
  cur.cod_curso = prg.cod_curso AND 
  prg.cod_pregunta = rsp.cod_pregunta AND 
  nv.cod_nivel = prg.cod_nivel;