-- Comentario

-- Criando um database
CREATE DATABASE agenda;

-- Conecta a uma database
USE agenda;

-- Criando a tabela contato
CREATE TABLE contato(
    codigo  INT PRIMARY KEY AUTO_INCREMENT,
    nome    VARCHAR(100) NOT NULL,
    email   VARCHAR(100) UNIQUE NOT NULL,
    tel     CHAR(11) UNIQUE NOT NULL,
    dt_nasc DATE
);

-- Apagando uma tabela
DROP TABLE contato;

-- CRUD

--Inserindo dados (DATE --> YYYY/MM/DD)
INSERT INTO contato (nome, email, tel , dt_nasc)
VALUES ("Jose", "ze@gmail.com", "21123456789", "1990/10/05");

--Consultando dados
SELECT * FROM contato;
SELECT nome, email, dt_nasc FROM contato;

--Alterando dados
UPDATE contato
SET tel="21987654321", email="zeca@gmail.com"
WHERE codigo = 1;

-- Apagando dados
DELETE FROM contato
WHERE email="zeca@gmail.com";