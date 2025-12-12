# Write your MySQL query statement below
SELECT e.name, b.bonus 
FROM EMPLOYEE e 
LEFT JOIN 
Bonus b 
ON b.empId = e.empId 
WHERE  b.bonus<1000 OR b.bonus IS NULL;