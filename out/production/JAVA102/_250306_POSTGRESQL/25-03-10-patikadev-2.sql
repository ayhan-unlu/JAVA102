/*SELECT rental_rate, COUNT(*) FROM film
GROUP BY rental_rate
HAVING COUNT(*) > 325; 

SELECT rental_rate, COUNT(*) FROM film
WHERE rental_rate != 2.99
GROUP BY rental_rate; -- IS NOT EQUAL

SELECT * FROM payment;

SELECT COUNT(*) FROM payment;

SELECT * FROM payment;

SELECT staff_id, COUNT(*) FROM payment
GROUP BY staff_id

SELECT staff_id, COUNT(*) FROM payment
GROUP BY staff_id
HAVING COUNT(*) > 7300;

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100;

SELECT * FROM film;

SELECT rental_rate,COUNT(*) FROM film
GROUP BY rental_rate
--WHERE COUNT(*) > 325;
HAVING COUNT(*)>325;*/

/*SELECT rental_rate, COUNT(*) FROM film
WHERE rental_rate != 2.99
GROUP BY rental_rate;

SELECT * FROM payment;

SELECT COUNT(*) FROM payment;

SELECT staff_id, COUNT(*) FROM payment
GROUP BY staff_id;

SELECT customer_id, COUNT(*) FROM payment
GROUP BY customer_id;

SELECT staff_id, COUNT(*) FROM payment
GROUP BY staff_id
HAVING COUNT(*) > 7300;

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100*/

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
ORDER BY SUM(amount) ASC;

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
--ORDER BY customer_id;

--ORDER BY SUM(amount) DESC
--LIMIT 1;

ORDER BY SUM(amount) ASC
LIMIT 1;

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
ORDER BY SUM(amount) DESC
LIMIT 1;

