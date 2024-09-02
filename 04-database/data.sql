CREATE DATABASE IF NOT EXISTS mydb;

USE mydb;

CREATE TABLE employees
( 
    empid int primary key auto_increment,
    firstname nvarchar(20),
    lastname nvarchar(30)
);

INSERT into employees (firstname, lastname) VALUES ('Sachin','Tendulkar');
INSERT into employees (firstname, lastname) VALUES ('Kristiyano','Ronaldo');
INSERT into employees (firstname, lastname) VALUES ('Lionel','Messi');
INSERT into employees (firstname, lastname) VALUES ('Roger','Federer');
INSERT into employees (firstname, lastname) VALUES ('Usain','Bolt');
