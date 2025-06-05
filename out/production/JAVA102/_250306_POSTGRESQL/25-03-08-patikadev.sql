--SELECT * FROM film;

--SELECT * FROM film
--ORDER BY title;

--SELECT * FROM film
--ORDER BY title ASC;

--SELECT * FROM film
--ORDER BY title DESC;

--SELECT * FROM film
--ORDER BY length DESC;

--SELECT * FROM film
--ORDER BY length;

--SELECT title, length FROM film
--ORDER BY length DESC;

--SELECT title, rental_rate, length FROM film
--ORDER BY rental_rate ASC, length DESC;

--SELECT title, rental_rate, length FROM film
--WHERE title LIKE 'A%'
--ORDER BY rental_rate ASC, length DESC;

--SELECT * FROM film
--WHERE rating = 'G'
--ORDER BY length DESC;

--SELECT * FROM film
--WHERE rating = 'G'
--ORDER BY length ASC;

--SELECT * FROM film 
--WHERE rating = 'G'
--ORDER BY length;

--SELECT * FROM film
--LIMIT 20;

--SELECT * FROM film
--WHERE rental_rate = 4.99
--ORDER BY rental_duration
--LIMIT 5;

/*SELECT * FROM film
WHERE replacement_cost = 14.99 AND rental_rate = 0.99
ORDER BY length DESC
LIMIT 7;*/

--SELECT * FROM country;

/*SELECT * FROM country
LIMIT 7;*/

/*SELECT * FROM country
OFFSET 3
LIMIT 4;*/

/*SELECT * FROM actor
WHERE first_name = 'Penelope';*/

/*SELECT * FROM actor
WHERE first_name = 'Penelope'
ORDER BY last_name ASC;*/

SELECT * FROM actor
WHERE first_name = 'Penelope'
ORDER BY last_name ASC
OFFSET 2
LIMIT 1;