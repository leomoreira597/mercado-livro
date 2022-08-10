CREATE TABLE purchase_book(
	purchase_id int,
	book_id int,
	FOREIGN KEY (purchase_id) REFERENCES purchase(id),
	FOREIGN KEY (book_id) REFERENCES book(id),
	PRIMARY KEY(purchase_id, book_id)
);