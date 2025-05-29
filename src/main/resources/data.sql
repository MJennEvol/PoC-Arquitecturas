DROP TABLE IF EXISTS todo;


CREATE TABLE products (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);	

INSERT INTO products (name, price) VALUES ('Leche', 10.00);
INSERT INTO products (name, price) VALUES ('Pan', 20.00);
INSERT INTO products (name, price) VALUES ('Harina', 30.00);


CREATE TABLE students (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO students (name, email, last_name) VALUES ('Juan', 'juan@gmail.com', 'Perez');
INSERT INTO students (name, email, last_name) VALUES ('Maria', 'maria@gmail.com', 'Gomez');
