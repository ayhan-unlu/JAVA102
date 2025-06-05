--1.SELECT DISTINCT replacement_cost FROM film;

--2.SELECT DISTINCT replacement_cost FROM film;

--SELECT COUNT(DISTINCT replacement_cost) FROM film;

--3.SELECT * FROM film
--WHERE (title LIKE 't%') AND (rating = 'G');

--SELECT COUNT(*) FROM film
--WHERE (title LIKE 'T%') AND(rating = 'G');

--4.SELECT * FROM country
--WHERE country LIKE '_____';

--SELECT COUNT(*) FROM country
--WHERE country LIKE '_____';

--5.SELECT * FROM city
--WHERE city ILIKE '%R';

SELECT COUNT(*)FROM city
WHERE city ILIKE '%r';