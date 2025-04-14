--SELECT * FROM book;

/*
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5;
*/

/*
SELECT * FROM book
ORDER BY title ASC
LIMIT 5;
*/

/*
(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5;)
UNION
(SELECT * FROM book
ORDER BY title ASC
LIMIT 5;)
;

ERROR:  ";"  yerinde söz dizim hatası 
LINE 17: LIMIT 5;)
                ^ 

HATA:  ";"  yerinde söz dizim hatası 
SQL state: 42601
Character: 192
*/

/*
(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5)
UNION
(SELECT * FROM book
ORDER BY title ASC
LIMIT 5)
;
*/

/*
(
SELECT * FROM book
ORDER BY page_number DESC
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
);
*/

/*
(
SELECT id, email FROM author
ORDER BY id ASC
LIMIT 5
)
UNION
(
SELECT id, title FROM book
ORDER BY id DESC
LIMIT 5
);
*/

/*
(
SELECT id, email, first_name FROM author
)
UNION
(
SELECT id, title FROM book
);

ERROR:  her UNION sorgusu ayını sütun sayısına sahip olmalıdır
LINE 92: SELECT id, title FROM book
                ^ 

HATA:  her UNION sorgusu ayını sütun sayısına sahip olmalıdır
SQL state: 42601
Character: 959
*/

/* 
(
SELECT id, email FROM author
)
UNION
(
SELECT id, page_number FROM book
);
ERROR:  UNION tipleri character varying ve integer bir araya gelemez
LINE 110: SELECT id, page_number FROM book
                     ^ 

HATA:  UNION tipleri character varying ve integer bir araya gelemez
SQL state: 42804
Character: 1255
*/
