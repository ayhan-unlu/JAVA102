/*SELECT * FROM actor;

SELECT first_name, last_name FROM actor;

SELECT first_name AS name_, last_name AS familyname FROM actor;

SELECT first_name name_, last_name familyname FROM actor;

SELECT first_name AS name_ namen, last_name familyname familynamen FROM actor;

ERROR:  "namen"  yerinde söz dizim hatası 
LINE 9: SELECT first_name AS name_ namen, last_name familyname famil...
                                 ^ 


SELECT first_name AS 'name namen', last_name AS 'familyname familynamen' FROM actor;

ERROR:  "namen"  yerinde söz dizim hatası 
LINE 9: SELECT first_name AS name_ namen, last_name familyname famil...
                                   ^ 
								   */
SELECT first_name AS "name namen", last_name AS "familyname, familynamen" FROM actor;

SELECT COUNT(*) AS "Number of Actors" FROM actor;

SELECT CONCAT(first_name, last_name) AS "Name and Surname of the Actor " FROM actor;

SELECT CONCAT(first_name, ' ', last_name) AS "Name and Surname of the Actor" FROM actor;