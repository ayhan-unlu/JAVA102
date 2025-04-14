--SELECT * FROM film;

--SELECT COUNT(*) FROM film;

--SELECT MAX(replacement_cost) FROM film;

--SELECT MIN(replacement_cost) FROM film;

--SELECT MIN(rental_rate) FROM film;

--SELECT MAX(rental_rate) FROM film;

--SELECT AVG(length) FROM film;

--SELECT ROUND(AVG(length), 3) FROM film;

--SELECT SUM(rental_rate) FROM film;

--COUNT, MAX, MIN, AVG, ROUND, SUM

--SELECT MAX(length), MIN(length), ROUND(SUM(replacement_cost),0) FROM film;

--SELECT MAX(length) FROM film;

/*SELECT MAX(length) FROM film
WHERE rental_rate = 0.99*/

/*SELECT MAX(length) FROM film
WHERE rental_rate = 2.99;*/

/*SELECT MAX(length) FROM film
WHERE rental_rate = 4.99;*/

/*SELECT MAX(length) FROM film
WHERE rental_rate IN (0.99,2.99);*/

/*SELECT MAX(length),rental_rate FROM film;
ERROR:  aggregate fonksiyonu kullanmak için "film.rental_rate" sütununu GROUP BY listesine eklemelisiniz
LINE 37: SELECT MAX(length),rental_rate FROM film;*/

/*SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;*/

SELECT MAX(length) FROM film
WHERE rental_rate= 4.99;

