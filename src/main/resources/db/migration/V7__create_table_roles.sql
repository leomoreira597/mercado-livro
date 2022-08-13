CREATE TABLE customer_roles(
    customer_id int,
    role VARCHAR(60) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);