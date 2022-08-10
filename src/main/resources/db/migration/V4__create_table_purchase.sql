CREATE TABLE purchase(
	id int auto_increment primary key,
    customer_id int,
    nfe varchar(255),
    created_at DATETIME NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);