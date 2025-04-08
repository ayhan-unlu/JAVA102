--this is for the rejected push req 0059
-- SELECT column1 FROM table1;
--

-- SELECT * FROM film;

--SELECT first_name,last_name FROM actor;
--SELECT title,length FROM film 
--WHERE rental_rate = 0.99;

--SELECT * FROM actor
--WHERE first_name = 'Penelope';

--SELECT * FROM film
--WHERE length = 90;

--SELECT * FROM film
--WHERE rental_rate <=1 ;

--SELECT * FROM film
--WHERE rental_rate != 0.99;

--SELECT * FROM film
--WHERE rental_rate <> 2.99; 

--SELECT * FROM film
--WHERE rental_rate = 4.99 AND length > 90;

--SELECT * FROM film 
--WHERE rental_rate = 2.99 AND rental_rate = 4.99;

--SELECT * FROM film
--WHERE rental_rate = 4.99 OR rental_rate = 2.99;

--SELECT * FROM film
--WHERE rental_rate = 4.99 AND rental_duration = 3 AND replacement_cost > 20;

--SELECT * FROM film
--WHERE replacement_cost < 12 OR replacement_cost > 25;

--SELECT * FROM film
--WHERE NOT (NOT(rental_rate = 4.99 AND replacement_cost = 20.99));

SELECT * FROM film
WHERE NOT NOT length > 110;
