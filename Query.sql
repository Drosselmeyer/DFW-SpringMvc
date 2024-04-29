create database spring;

use spring;

-- Crear la tabla Usuario
CREATE TABLE Usuario (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Crear la tabla Rol
CREATE TABLE Rol (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Crear la tabla Usuario_Rol para la relación muchos a muchos
CREATE TABLE Usuario_Rol (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    rol_id BIGINT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id),
    FOREIGN KEY (rol_id) REFERENCES Rol(id),
    UNIQUE KEY unique_usuario_rol (usuario_id, rol_id)
);
