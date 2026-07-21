DROP DATABASE IF EXISTS examen_final_in4am;
CREATE DATABASE examen_final_in4am
CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;
USE examen_final_in4am;

CREATE TABLE usuarios (
	id_usuarios int auto_increment,
    username_usuarios varchar(50) NOT NULL,
    email_usuarios varchar(50) NOT NULL,
    password_hash varchar(60) NOT NULL,
    nombre_completo varchar(80),
    fecha_registro TIMESTAMP DEFAULT current_timestamp,
	
    CONSTRAINT PK_usuarios
		PRIMARY KEY (id_usuarios),
        
	CONSTRAINT UQ_usuarios_email
		UNIQUE (email_usuarios),
        
	CONSTRAINT UQ_usuarios_username
		UNIQUE (username_usuarios),
        
	INDEX idx_nombre (nombre_completo)
        
);
   
