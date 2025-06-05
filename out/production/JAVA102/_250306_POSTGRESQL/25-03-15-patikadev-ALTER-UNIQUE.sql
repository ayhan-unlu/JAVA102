--SELECT * FROM users;

/*
INSERT INTO users(username, email, age)
VALUES 
	('tester2', 'tester1@gmail.com', 44)
RETURNING *;
*/

/*CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	username VARCHAR(20) NOT NULL,
	email VARCHAR(50) UNIQUE,
	age INTEGER
);
*/

/*
ALTER TABLE users
XX ALTER COLUMN email
 XX SET NOT UNIQUE;
*/
/*
ALTER TABLE users
ADD UNIQUE(email);

ERROR:  "users_email_key" tekil (unique) indeksi yaratılamadı
(email)=(tester1@gmail.com) anahtarı (key) çoğaltılmış (duplicated). 

HATA:  "users_email_key" tekil (unique) indeksi yaratılamadı
SQL state: 23505
Detail: (email)=(tester1@gmail.com) anahtarı (key) çoğaltılmış (duplicated).
*/

--SELECT * FROM users;

/*
ALTER TABLE users
ADD UNIQUE(email);
*/
/*
INSERT INTO users(username, email, age)
VALUES
	('diver', 'tester1@gmail.com', 55)
RETURNING *;
ERROR:  tekrar eden kayıt, "users_email_key" tekil kısıtlamasını ihlal etmektedir
"(email)=(tester1@gmail.com)" anahtarı zaten mevcut 

HATA:  tekrar eden kayıt, "users_email_key" tekil kısıtlamasını ihlal etmektedir
SQL state: 23505
Detail: "(email)=(tester1@gmail.com)" anahtarı zaten mevcut
*/


/*
INSERT INTO users(username, email, age)
VALUES 
	('diver', 'tester3@gmail.com', 55)
RETURNING *;
*/

SELECT * FROM users;
