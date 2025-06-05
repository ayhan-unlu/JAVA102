--SELECT * FROM customer;

--SELECT * FROM customer
--WHERE first_name = 'Mary';

--SELECT * FROM customer
--WHERE first_name LIKE 'M%';

--SELECT * FROM customer
--WHERE first_name LIKE 'Ma%';

--SELECT * FROM customer
--WHERE first_name LIKE 'Mary%';

--SELECT * FROM customer
--WHERE first_name LIKE '%y';

--SELECT * FROM customer
--WHERE first_name LIKE 'A%y';

--SELECT * FROM customer
--WHERE first_name LIKE 'A%' AND last_name LIKE 'A%';


--SELECT * FROM customer
--WHERE first_name LIKE 'A%';

--SELECT * FROM customer
--WHERE first_name LIKE 'a%';

--SELECT * FROM customer
--WHERE first_name ILIKE 'a%';

--SELECT * FROM customer
--WHERE first_name LIKE 'D%n';

--SELECT * FROM customer
--WHERE first_name NOT LIKE 'D%n';

--SELECT * FROM customer
--WHERE first_name NOT LIKE 'A%';

--SELECT * FROM customer
--WHERE first_name LIKE 'J_an'; -- Jo, Ja, JA, JX, J?

--SELECT * FROM customer
-- WHERE first_name LIKE 'J%an';

--SELECT * FROM customer
--WHERE first_name LIKE 'J%n';

--SELECT * FROM actor
--WHERE first_name = 'Penelope';

--SELECT * FROM actor
--WHERE first_name LIKE 'P%';

--SELECT * FROM actor
--WHERE first_name LIKE 'T%';

--SELECT * FROM actor
--WHERE first_name LIKE 'T__';-- ONLY THREE LETTERS IN NAME

--SELECT * FROM actor
--WHERE first_name LIKE 'A%';

--SELECT * FROM actor
--WHERE first_name ~~ 'A%';-- Equals to LIKE

--SELECT * FROM actor
--WHERE first_name ~~ 'B%';

--SELECT * FROM actor
--WHERE first_name ~~* 'b%'; --ILIKE with asterix

SELECT * FROM actor
WHERE first_name !~~* 'b%'; -- NOT ILIKE 


