--SELECT * FROM book;

/*
SELECT first_name, last_name FROM author
WHERE id = (
	SELECT id FROM book
	WHERE title = 'Inside Job'
);
*/

/*
SELECT first_name, last_name FROM author
WHERE id = (
	SELECT id FROM book
	WHERE title = 'Inside Job' OR title = 'New Era'
);

ERROR:  ifade içinde kullanılan alt sorgusu birden fazla satır döndürüldü 

HATA:  ifade içinde kullanılan alt sorgusu birden fazla satır döndürüldü
SQL state: 21000
*/

/*
SELECT first_name, last_name, id FROM author
WHERE id = ANY (
	SELECT id FROM book
	WHERE title = 'Inside Job' OR title = 'New Era'
);
*/

/*
SELECT first_name, last_name, id FROM author
WHERE id = ALL (
	SELECT id FROM book
	WHERE title = 'Inside Job' OR title = 'New Era'
);
*/

/*
SELECT first_name, last_name, id FROM author
WHERE id > ANY (
	SELECT id FROM book
	WHERE title = 'Inside Job' OR title = 'New Era'
);
*/

/*
SELECT first_name, last_name, id FROM author
WHERE id > ALL (
	SELECT id FROM book
	WHERE title = 'Inside Job' OR title ='New Era'
);
*/