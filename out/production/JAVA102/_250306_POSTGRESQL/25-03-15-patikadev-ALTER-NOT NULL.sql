/*CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	username VARCHAR(20),
	email VARCHAR(50),
	age INTEGER
);

SELECT * FROM users;
*/

/*INSERT INTO users(username,email,age)
VALUES
	('tester1','tester1@gmail.com',23);
*/
--SELECT* FROM users;

/*
INSERT INTO users(username, email, age)
VALUES
	(null, 'gamer@gmail.com', 35)
RETURNING *;
*/

/*INSERT INTO users(email, age)
VALUES
	('developer@gmail.com', 45)
RETURNING *;
*/

--SELECT * FROM users;

/*CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	username VARCHAR(20) NOT NULL,
	email VARCHAR(50),
	age INTEGER
);
ERROR:  "users" nesnesi zaten mevcut 

HATA:  "users" nesnesi zaten mevcut
SQL state: 42P07*/

/*ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

ERROR:  column "username" of relation "users" contains null values 

HATA:  column "username" of relation "users" contains null values
SQL state: 23502*/

/*
SELECT * FROM users;

UPDATE users
SET username = ''
WHERE id = 2
RETURNING *;
*/
/*
DELETE FROM users
-- XX WHERE username = null
WHERE username IS NULL
RETURNING *;
*/

--SELECT * FROM users;

/* ALTER TABLE users
ALTER COLUMN username
SET NOT NULL
-- XX RETURNING *;*/

--SELECT * FROM users;

/*INSERT INTO users(email, age)
VALUES
	('developer@gmail.com', 85)
RETURNING *;
ERROR:  null value in column "username" of relation "users" violates not-null constraint
Hata veren satır (4, null, developer@gmail.com, 85) içeriyor. 

HATA:  null value in column "username" of relation "users" violates not-null constraint
SQL state: 23502
Detail: Hata veren satır (4, null, developer@gmail.com, 85) içeriyor.*/

INSERT INTO users(username, email, age)
VALUES
	('', 'watcher@gmail.com', 95)	
RETURNING *;