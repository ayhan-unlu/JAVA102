/*
(
SELECT * FROM book
ORDER BY page_number
LIMIT 5
)
UNION
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 5
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
UNION ALL
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 5
)
*/

/*
(
SELECT * FROM book
ORDER BY page_number
LIMIT 5
)
INTERSECT
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 5
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
INTERSECT ALL
(
SELECT * FROM book
ORDER BY title
LIMIT 5
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 10
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10
)
UNION
(
SELECT * FROM book
ORDER BY title
LIMIT 10
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10
)
UNION ALL
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 10
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
EXCEPT
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 5
);
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10
)
EXCEPT
(
SELECT * FROM book
ORDER BY title
LIMIT 10
);
*/


/*
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10
)
INTERSECT
(
SELECT * FROM book
ORDER BY title ASC
LIMIT 10
);
*/

/*
(
SELECT title FROM book
ORDER BY page_number DESC
LIMIT 10
)
EXCEPT
(
SELECT title FROM book
ORDER BY title
LIMIT 10
);
*/

/*
(
SELECT title FROM book
ORDER BY title ASC
LIMIT 10
)
EXCEPT
(
SELECT id FROM book
ORDER by title
LIMIT 10
);

ERROR:  EXCEPT tipleri character varying ve integer bir araya gelemez
LINE 163: SELECT id FROM book
                 ^ 

HATA:  EXCEPT tipleri character varying ve integer bir araya gelemez
SQL state: 42804
Character: 1428
*/

/*
(
SELECT title FROM book 
ORDER BY title ASC
LIMIT 10
)
EXCEPT
(
SELECT title, id FROM book
ORDER BY title ASC
LIMIT 10
);

ERROR:  her EXCEPT sorgusu ayını sütun sayısına sahip olmalıdır
LINE 185: SELECT title, id FROM book
                 ^ 

HATA:  her EXCEPT sorgusu ayını sütun sayısına sahip olmalıdır
SQL state: 42601
Character: 1771
*/

(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10
)
EXCEPT
(
SELECT * FROM book
ORDER BY title ASc
LIMIT 10
);