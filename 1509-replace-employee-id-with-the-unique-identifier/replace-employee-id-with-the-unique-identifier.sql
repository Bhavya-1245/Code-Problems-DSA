# Write your MySQL query statement below
SELECT u.unique_id, e.name
FROM EmployeeUNI u
RIGHT JOIN
Employees e
ON e.id = u.id WHERE
u.id is NULL OR u.id is NOT NULL;