--SELECT * FROM book;

/*
SELECT * FROM BOOK
WHERE page_number > 15;
*/

/*
SELECT page_number FROM book
WHERE title = 'Inside Job';
*/

/*
SELECT * FROM book
WHERE page_number > (
	SELECT page_number FROM book
	WHERE title = 'Inside Job'
);
*/


--SELECT * FROM book;

--SELECT title, page_number, (SELECT MAX(page_number) FROM book) AS Maximum_Page_Number FROM book;
/*
SELECT title, page_number, (SELECT MAX(page_number) FROM book) AS Maximum Page Number FROM book;
ERROR:  "Page"  yerinde söz dizim hatası 
LINE 26: ...r, (SELECT MAX(page_number) FROM book) AS Maximum Page Numbe...
                                                              ^ 

HATA:  "Page"  yerinde söz dizim hatası 
SQL state: 42601
Character: 445
*/

/*
SELECT title AS Book_Title, page_number AS Page_Number, (SELECT MAX(page_number) FROM book) AS Maximum_Page_Number FROM book
WHERE page_number > (
	SELECT page_number FROM book
	WHERE title = 'Inside Job'
);
*/

SELECT title, page_number, (SELECT MAX(page_number) FROM book) AS Max_Page_Number, ((SELECT MAX(page_number)FROM book)-page_number) AS Difference FROM book
WHERE page_number > (
	SELECT page_number FROM book
	WHERE title = 'Inside Job'
);
