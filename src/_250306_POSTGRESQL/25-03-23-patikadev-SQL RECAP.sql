--SELECT * FROM film;

--SELECT title, (SELECT COUNT(* /*film_id*/ ) FROM film WHERE title ILIKE '%e%E%e%E%') FROM film;

--SELECT * FROM category;

/*SELECT film.film_id, film.title, category.category_id FROM category
INNER JOIN film ON film.film_id = category.film_id
INNER JOIN film_category ON category.category_id = film_category.category_id;
--GROUP BY category.category_id;
*/


/*
SELECT category.name, COUNT(*) FROM category
INNER JOIN film_category ON film_category.category_id = category.category_id
INNER JOIN film ON film.film_id = film_category.film_id
GROUP BY category.name
ORDER BY category.name ASC;
*/

/*
SELECT rating, COUNT(*) FROM film
GROUP BY rating
ORDER BY COUNT(*) DESC
LIMIT 1;
*/

/*
SELECT title, length, replacement_cost FROM film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost ASC
LIMIT 3;
*/

SELECT customer.first_name, customer.last_name, SUM(payment.amount) FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY SUM(payment.amount) DESC
LIMIT 1;