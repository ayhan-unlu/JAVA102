
/*
SELECT book.title, author.first_name, author.last_name FROM book
LEFT JOIN author ON book.author_id = author.id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM book
LEFT JOIN author ON author.id = book.author_id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM book
RIGHT JOIN author ON author.id = book.author_id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM book
RIGHT OUTER JOIN author on author.id = book.author_id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM author
LEFT OUTER JOIN book ON author.id = book.author_id;
*/

/*
SELECT author.first_name, author.last_name, book.title FROM book
RIGHT OUTER JOIN author ON author.id = book.author_id;
*/

SELECT author.first_name, author.last_name, book.title FROM author
RIGHT OUTER JOIN book ON author.id = book.author_id;
