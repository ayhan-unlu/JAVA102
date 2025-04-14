/*
SELECT book.title, author.first_name, author.last_name FROM book
INNER JOIN author ON book.author_id = author.id;
*/

/*
SELECT book.title, author.first_name, author.last_name FROM author
INNER JOIN book ON author.id = book.author_id;
*/

/*
SELECT book.title, author.first_name, author.last_name FROM author
LEFT JOIN book ON book.author_id = author.id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM author
LEFT JOIN book ON author.id = book.author_id;
*/

/*
SELECT book.title, author.first_name, author.last_name FROM book
LEFT JOIN author ON book.author_id = author.id;
*/

/*
INSERT INTO book(title, page_number, author_id)
VALUES
	('New Era', 184, 44);
*/	

/*
SELECT * FROM book;
SELECT * FROM author;
*/

/*
INSERT INTO book (title, page_number, author_id)
VALUES
	('Shape of my Heart', 154, 99)
RETURNING *;

ERROR:  "book" tablosu üzerindeki ekleme veya güncelleme işlemi "book_author_id_fkey" foreign key kısıtlamasını ihlal ediyor
"author" tablosunda (author_id)=(99) anahtarı mevcut değildir. 

HATA:  "book" tablosu üzerindeki ekleme veya güncelleme işlemi "book_author_id_fkey" foreign key kısıtlamasını ihlal ediyor
SQL state: 23503
Detail: "author" tablosunda (author_id)=(99) anahtarı mevcut değildir.
*/

/*
ALTER TABLE book
DROP CONSTRAINT book.book_author_id_fkey;
ERROR:  "."  yerinde söz dizim hatası 
LINE 52: DROP CONSTRAINT book.book_author_id_fkey;
                             ^ 

HATA:  "."  yerinde söz dizim hatası 
SQL state: 42601
Character: 1286
*/

/*
ALTER TABLE book
DROP CONSTRAINT book_author_id_fkey;
*/

/*
INSERT INTO book(title, page_number, author_id)
VALUES
	('Africa', 125, 99);
*/

/*
INSERT INTO book(title, page_number, author_id)
VALUES 
	('Artificial Intelligence', 105, 105);
*/

--SELECT * FROM book;

/*
SELECT book.title, author.first_name, author.last_name FROM book
LEFT JOIN author ON book.author_id = author.id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM author
LEFT JOIN book ON author.id = book.author_id;
*/

/*
SELECT author.first_name, author.last_name FROM author
LEFT JOIN book ON author.id = book.author_id
WHERE title ISNOT NULL;

ERROR:  "ISNOT"  yerinde söz dizim hatası 
LINE 94: WHERE title ISNOT NULL;
                     ^ 

HATA:  "ISNOT"  yerinde söz dizim hatası 
SQL state: 42601
Character: 2132
*/

/*
SELECT author.first_name, author.last_name, book.title FROM author
LEFT JOIN book ON author.id = book.author_id
WHERE title IS NOT NULL;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM author
LEFT JOIN book ON author.id = book.author_id
WHERE book.id IS NOT NULL;
?????????????? 
*/

--SELECT * FROM book;

SELECT author.first_name, author.last_name, book.title FROM author
LEFT JOIN book ON author.id = book.author_id
--WHERE book.id IS NOT NULL;
WHERE book.title IS NOT NULL
ORDER BY title ASC; 


