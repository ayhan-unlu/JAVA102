--DROP TABLE IF EXISTS products ;

--DROP TABLE IF EXISTS test2;
/*
SELECT title, first_name, lasty_name FROM book
ERROR:  "first_name" sütunu mevcut değil
LINE 5: SELECT title, first_name, lasty_name FROM book;
                      ^ 

HATA:  "first_name" sütunu mevcut değil
SQL state: 42703
Character: 81
*/
/*
SELECT title, first_name, last_name FROM book
INNER JOIN author ON book.author_id = author.id;
*/

/*
SELECT * FROM book
INNER JOIN author ON book.author_id = author.id;
*/

/*
SELECT * from book
JOIN author ON book.author_id = author.id;
*/
/*
SELECT book.title, author.first_name, author.last_name FROM book
INNER JOIN author ON book.author_id = author.id;
*/
/*
SELECT book.title, author.first_name, author.last_name FROM author
--INNER JOIN book ON author.id = book.author_id;
INNER JOIN book ON book.author_id = author.id;
*/

SELECT book.title, author.first_name, author.last_name FROM book, author
WHERE book.author_id = author.id;