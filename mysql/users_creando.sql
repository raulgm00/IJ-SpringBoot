-- Borrar Schema
-- DROP DATABASE `curso_java_db`;
-- Crear un Schema
CREATE SCHEMA `curso_java_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
-- Borrar un usuario
-- DROP USER 'user_curso_java'@'localhost';
-- Crear usuario sin permisos
CREATE USER 'user_curso_java'@'localhost' IDENTIFIED BY 'welcome1';
-- Asignar permisos de super usuario
GRANT ALL PRIVILEGES ON *.* to 'user_curso_java'@'localhost';
-- Refrescar Permisos
FLUSH PRIVILEGES;

-- Comprobacion de generacion de usaurio correcto y asignacion de permisos adecuados
-- root / welcome1 / admin1
SELECT CURRENT_USER();
USE mysql;
SHOW TABLES;
SHOW FULL TABLES;
SELECT * FROM user;
SHOW GRANTS FOR 'rgarcia';
SHOW GRANTS FOR 'user_curso_java'@'localhost';

