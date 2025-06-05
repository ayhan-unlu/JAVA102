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
3. SELECT film_id, title, rental_rate, replacement_cost FROM film
WHERE rental_rate = (
	SELECT MIN(rental_rate) FROM film
) AND replacement_cost = (
	SELECT MIN(replacement_cost) FROM film
);
*/


/*
4. SELECT customer_id, COUNT(payment_id) FROM payment
GROUP BY customer_id
ORDER BY COUNT(payment_id) DESC;
*/

SELECT customer.customer_id, customer.first_name, customer.last_name, COUNT(payment.payment_id) FROM payment
INNER JOIN customer ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id, payment.customer_id
ORDER BY COUNT(payment.payment_id) DESC;