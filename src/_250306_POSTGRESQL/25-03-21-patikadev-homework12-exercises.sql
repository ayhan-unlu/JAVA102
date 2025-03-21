/*
1. SELECT COUNT(length) FROM film
WHERE length > (
	SELECT AVG(length) FROM film 
);
*/

/*
2. SELECT COUNT(rental_rate) FROM film
WHERE rental_rate = (
	SELECT MAX(rental_rate) FROM film
);
*/

/*
SELECT rental_rate FROM film
ORDER BY rental_rate DESC
LIMIT 337;
*/

--SELECT * FROM film;

/*
SELECT film_id, title from film
WHERE rental_rate = (
	SELECT MIN(rental_rate) FROM film
) OR(
	SELECT MIN(replacement_cost) FROM film
);
ERROR:  OR'ın argümanı boolean değil, numeric tipinde olamalıdır
LINE 26: ) OR(
             ^ 

HATA:  OR'ın argümanı boolean değil, numeric tipinde olamalıdır
SQL state: 42804
Character: 388
*/

/*
SELECT film_id, title, rental_rate, replacement_cost FROM film
WHERE rental_rate = (
	SELECT MIN(rental_rate) FROM film
) OR replacement_cost = (
	SELECT MIN(replacement_cost) FROM film
);
*/

/*
3. SELECT film_id, title, rental_rate, replacement_cost FROM film
WHERE rental_rate = (
	SELECT MIN(rental_rate) FROM film
) AND replacement_cost = (
	SELECT MIN(replacement_cost) FROM film
);
*/

/*
SELECT film_id, title, rental_rate, replacement_cost FROM film
WHERE rental_rate = (
	SELECT MIN(rental_rate) FROM film
) OR replacement_cost = (
	SELECT MIN(replacement_cost) FROM film
)
ORDER BY rental_rate ASC, replacement_cost ASC
LIMIT 16;
*/


--SELECT customer_id, (SELECT SUM(amount) FROM payment GROUP BY customer_id) FROM payment

--SELECT * FROM payment;

/*
SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
ORDER BY SUM(amount) DESC;
*/

/*SELECT * FROM payment
ORDER BY customer_id;
*/

/*
4. SELECT customer_id, COUNT(payment_id) FROM payment
GROUP BY customer_id
ORDER BY COUNT(payment_id) DESC;
*/

/*
SELECT COUNT(payment_id) FROM payment
WHERE customer_id = 526;

SELECT COUNT(payment_id) FROM payment
WHERE customer_id = 148;
*/

/*
SELECT customer_id, MAX(COUNT(payment_id)) FROM payment
GROUP BY customer_id;

XXX ERROR:  aggregate fonksiyon çağırmaları içiçe olamaz
LINE 97: SELECT customer_id, MAX(COUNT(payment_id)) FROM payment
                                 ^ 

HATA:  aggregate fonksiyon çağırmaları içiçe olamaz
SQL state: 42803
Character: 1822
*/