/*CREATE TABLE book(
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author(id)
);
*/

--SELECT * FROM book;
/*
insert into book (title, page_number, author_id) values ('Battlestar Galactica: Razor', 1, 1);
--ERROR:  "book" tablosu üzerindeki ekleme veya güncelleme işlemi "book_author_id_fkey" foreign key kısıtlamasını ihlal ediyor
--"author" tablosunda (author_id)=(999) anahtarı mevcut değildir. 
--
--HATA:  "book" tablosu üzerindeki ekleme veya güncelleme işlemi "book_author_id_fkey" foreign key kısıtlamasını ihlal ediyor
--SQL state: 23503
--Detail: "author" tablosunda (author_id)=(999) anahtarı mevcut değildir.
insert into book (title, page_number, author_id) values ('On the Town', 2, 2);
insert into book (title, page_number, author_id) values ('Cartoonist: Jeff Smith, BONE and the Changing Face of Comics, The', 3, 3);
insert into book (title, page_number, author_id) values ('Shameless (Maskeblomstfamilien )', 4, 4);
insert into book (title, page_number, author_id) values ('And God Created Woman (Et Dieu... créa la femme)', 5, 5);
insert into book (title, page_number, author_id) values ('Battle for Brooklyn', 6, 5);
insert into book (title, page_number, author_id) values ('Wayne''s World', 7, 7);
insert into book (title, page_number, author_id) values ('So Evil, So Young', 8, 8);
insert into book (title, page_number, author_id) values ('Everything Must Go', 9, 9);
insert into book (title, page_number, author_id) values ('Tape', 10, 10);
insert into book (title, page_number, author_id) values ('Varsity Blues', 11, 11);
insert into book (title, page_number, author_id) values ('Remonstrance', 12, 12);
insert into book (title, page_number, author_id) values ('Genevieve', 13, 13);
insert into book (title, page_number, author_id) values ('Ski Party', 14, 14);
insert into book (title, page_number, author_id) values ('Inside Job', 15, 15);
*/

--SELECT * FROM book;

/*
UPDATE book
SET id = 16
WHERE id = 15

ERROR:  tekrar eden kayıt, "book_pkey" tekil kısıtlamasını ihlal etmektedir
"(id)=(16)" anahtarı zaten mevcut 

HATA:  tekrar eden kayıt, "book_pkey" tekil kısıtlamasını ihlal etmektedir
SQL state: 23505
Detail: "(id)=(16)" anahtarı zaten mevcut

RETURNING *;
*/

/*
UPDATE book
SET id = 52
WHERE id = 15
RETURNING *;
*/

--SELECT * FROM book;

--SELECT * FROM book
--WHERE id = 1;

/*
SELECT * FROM book
WHERE author_id = 1;
*/

/*SELECT * FROM book
JOIN author ON  author.id = book.author_id;
*/

SELECT * FROM book
--JOIN author ON book.author_id = author.id;
JOIN author ON author_id = author.id;
/*
JOIN author ON id = author.id;

ERROR:  "id" sütun referansı belirsiz (ambiguous)
LINE 75: JOIN author ON id = author.id;
                        ^ 

HATA:  "id" sütun referansı belirsiz (ambiguous)
SQL state: 42702
Character: 2623
*/
