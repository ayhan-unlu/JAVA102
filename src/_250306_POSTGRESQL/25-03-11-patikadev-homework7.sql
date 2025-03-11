SELECT rating, COUNT(*) FROM film
GROUP BY rating;

SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY replacement_cost ASC;

SELECT * FROM customer;

SELECT store_id, COUNT(customer_id) FROM customer
GROUP BY store_id;

SELECT country_id, COUNT(city) FROM CITY
GROUP BY country_id
ORDER BY COUNT(city) DESC
LIMIT 1;