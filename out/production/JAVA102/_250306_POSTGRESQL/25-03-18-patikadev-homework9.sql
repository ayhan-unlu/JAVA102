--SELECT * FROM city;

--SELECT * FROM country;

/*
1. SELECT city.city, country.country FROM city
INNER JOIN country ON city.country_id = country.country_id;
*/

--SELECT * FROM customer;

--SELECT * FROM payment;

/*
2. SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment
INNER JOIN customer ON payment.customer_id = customer.customer_id;
*/

--SELECT * FROM customer;

--SELECT * FROM rental;

/*
3. SELECT rental.rental_id, customer.first_name, customer.last_name FROM rental
INNER JOIN customer ON customer.customer_id = rental.customer_id;
*/
