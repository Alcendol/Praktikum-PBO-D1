CREATE DATABASE pbo;
USE pbo;

CREATE TABLE person (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(100)
);
INSERT INTO person(name) VALUES ('Panji');
INSERT INTO person(name) VALUES ('Wisnu');

select * from person;
