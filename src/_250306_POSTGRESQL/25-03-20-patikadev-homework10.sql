--SELECT * FROM city;
--SELECT * FROM country;

/*
1. SELECT city.city, country.country FROM city
LEFT OUTER JOIN country ON city.country_id = country.country_id;
*/

/*
SELECT city.city, country.country FROM country
LEFT OUTER JOIN city ON city.country_id = country.country_id;
*/

--SELECT * FROM customer;
--SELECT * FROM payment;


/*
2. SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer
RIGHT OUTER JOIN payment ON payment.customer_id = customer.customer_id;
*/

/*
SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment
RIGHT OUTER JOIN customer ON payment.customer_id = customer.customer_id;
*/

/*
3.SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
FULL OUTER JOIN rental ON rental.customer_id = customer.customer_id;
--SELECT * FROM rental;
*/