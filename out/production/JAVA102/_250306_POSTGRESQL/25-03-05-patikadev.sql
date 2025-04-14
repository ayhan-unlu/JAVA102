--SELECT * FROM public.actor
--ORDER BY actor_id ASC 

--SELECT first_name, last_name FROM actor
--WHERE first_name = 'Penelope' AND last_name = 'Monroex';

--SELECT first_name, last_name FROM actor
--WHERE first_name = 'Penelope' OR first_name = 'Bob';

--SELECT * FROM actor
--WHERE first_name = 'Penelope' AND last_name = 'Monroe' OR first_name = 'Joe' AND last_name = 'Swank';

SELECT * FROM actor
WHERE first_name = 'Penelope' AND last_name = 'Monroe' AND last_name = 'Swank' OR first_name = 'Joe';