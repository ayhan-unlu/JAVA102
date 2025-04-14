--SELECT * FROM film;

--SELECT MAX(length) FROM film;

/*SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;*/

/*SELECT rental_rate, MAX(length) FROM film
GROUP BY rental_rate*/

/*SELECT rental_rate, COUNT(*) FROM film
GROUP BY rental_rate;*/

/*SELECT rental_rate, title, COUNT(*) FROM film
GROUP BY rental_rate;

ERROR:  aggregate fonksiyonu kullanmak için "film.title" sütununu GROUP BY listesine eklemelisiniz
LINE 14: SELECT rental_rate, title, COUNT(*) FROM film*/

--SELECT rating, COUNT(*) FROM film
--GROUP BY rating;

--SELECT replacement_cost, MIN(length) FROM film
--GROUP BY replacement_cost;

--SELECT MIN(replacement_cost) FROM film
--GROUP BY replacement_cost;

--SELECT MIN(replacement_cost) FROM film
--GROUP BY replacement_cost, rental_rate;

SELECT replacement_cost, rental_rate, MIN(length) FROM film
GROUP BY replacement_cost, rental_rate;

SELECT COUNT(DISTINCT replacement_cost) FROM film;

SELECT replacement_cost, rental_rate, MIN(length) FROM film
GROUP BY replacement_cost, rental_rate
ORDER BY replacement_cost ASC, rental_rate DESC;

SELECT replacement_cost, rental_rate, MIN(length) FROM film
GROUP BY replacement_cost, rental_rate
ORDER BY MIN(length);

SELECT replacement_cost, rental_rate, MIN(length) FROM film
GROUP BY replacement_cost, rental_rate
ORDER BY MIN(length)
OFFSET 4
LIMIT 9;

