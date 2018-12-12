use mydb;

CREATE TABLE product (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(20) NOT NULL,
    description varchar(20),
    price int
);

SELECT * FROM product;

DROP TABLE product;
