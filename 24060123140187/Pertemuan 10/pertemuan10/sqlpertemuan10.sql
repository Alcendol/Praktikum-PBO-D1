CREATE DATABASE pbo;
USE pbo;
CREATE TABLE person (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(100)
);

INSERT INTO person(name) VALUES ('Indra');
INSERT INTO person(name) VALUES ('Daffa');
INSERT INTO person(name) VALUES ('Naifah');

select * from person;



 