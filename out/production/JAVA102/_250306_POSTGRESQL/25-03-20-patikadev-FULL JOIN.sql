
/*SELECT author.first_name, author.last_name, book.title FROM book
FULL OUTER JOIN author ON author.id = book.author_id;
*/

/*
SELECT * FROM book
FULL OUTER JOIN author ON book.author_id = author.id;
*/

/*
SELECT * FROM author
FULL OUTER JOIN book ON author.id = book.author_id;
*/


/*
SELECT author.first_name, author.last_name, book.title FROM author
FULL OUTER JOIN book ON  book.author_id = author.id;
*/

/*
SELECT * FROM book
FULL OUTER JOIN author ON author.id = book.author_id
WHERE (author.id IS NOT NULL) AND (book.id IS NOT NULL);

SAME RESULT 
AS INNER JOIN
*/

/*
SELECT * FROM book
INNER JOIN author ON author.id = book.author_id;
*/

/*
SELECT * FROM book
FULL OUTER JOIN author ON book.author_id = author.id
WHERE (book.id IS NULL) OR (author.id IS NULL);
*/

/*
SELECT * FROM author
FULL OUTER JOIN book ON author.id = book.author_id
WHERE (book.id IS NULL) OR (author.id IS NULL);
*/

SELECT * FROM author
FULL OUTER JOIN book ON author.id = book.author_id
WHERE (author.id IS NULL) OR (book.id IS NULL);