--SELECT * FROM users;

/*INSERT INTO users(username, email, age)
VALUES
	('divider', 'divider@gmail.com', -11);
*/
--SELECT * FROM users;

/*
INSERT INTO users (username, email, age)
VALUES
	('departer', 'departer@gmail.com', -22)
RETURNING *;
*/

--SELECT * FROM users;

/*
ALTER TABLE users
ADD CHECK(age > 0);

ERROR:  check constraint "users_age_check" of relation "users" is violated by some row 

HATA:  check constraint "users_age_check" of relation "users" is violated by some row
SQL state: 23514
*/

--SELECT * FROM users;

/*
DELETE FROM users
WHERE id = 10;
*/

--SELECT * FROM users;

/*
UPDATE users
SET age = 11
WHERE age < 0
RETURNING *;
*/
--SELECT * FROM users;

/*
ALTER TABLE users
ADD CHECK (age > 0);
*/

/*
INSERT INTO users(username, email, age)
VALUES
	('multiplier', 'multiplier@gmail.com', -7)
RETURNING *;

ERROR:  "users" tablosuna girilen yeni satır "users_age_check" check kısıtlamasını ihlal ediyor
Hata veren satır (11, multiplier, multiplier@gmail.com, -7) içeriyor. 

HATA:  "users" tablosuna girilen yeni satır "users_age_check" check kısıtlamasını ihlal ediyor
SQL state: 23514
Detail: Hata veren satır (11, multiplier, multiplier@gmail.com, -7) içeriyor.
*/

/*
INSERT INTO users(username, email, age)
VALUES
	('subscriber', 'subscriber@gmail.com', 19)
RETURNING *;
*/

--SELECT * FROM users;

/*
CREATE TABLE products(
	product_no integer,
	name text,
	price numeric CHECK (price > 0),
	discounted_price numeric CHECK (discounted_price > 0),
	CHECK (price > discounted_price)
);

SELECT * FROM products; 
*/

--DROP TABLE products;
/*
INSERT INTO products
VALUES
	(1, 'Test Product1', -5, -4)
RETURNING *;

ERROR:  "products" tablosuna girilen yeni satır "products_check" check kısıtlamasını ihlal ediyor
Hata veren satır (1, Test Product1, -5, -4) içeriyor. 

HATA:  "products" tablosuna girilen yeni satır "products_check" check kısıtlamasını ihlal ediyor
SQL state: 23514
Detail: Hata veren satır (1, Test Product1, -5, -4) içeriyor.
*/

/*
INSERT INTO products
VALUES 
	(2, 'Test Product2', -4, -5)
RETURNING *;

ERROR:  "products" tablosuna girilen yeni satır "products_discounted_price_check" check kısıtlamasını ihlal ediyor
Hata veren satır (2, Test Product2, -4, -5) içeriyor. 

HATA:  "products" tablosuna girilen yeni satır "products_discounted_price_check" check kısıtlamasını ihlal ediyor
SQL state: 23514
Detail: Hata veren satır (2, Test Product2, -4, -5) içeriyor.
*/

/*
INSERT INTO products
VALUES
	(3, 'Test Product3', -4, 5)
RETURNING *;
*/

/*
INSERT INTO products
VALUES 
	(4, 'Test Product4', 4, 5)
RETURNING *;
*/

/*INSERT INTO products (product_no, name, price, discounted_price)
VALUES
	(5, 'Test Product5', 12, 10)
RETURNING *; 
*/
SELECT * FROM products;