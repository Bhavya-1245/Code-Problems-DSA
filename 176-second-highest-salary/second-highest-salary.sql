# Write your MySQL query statement below
SELECT MAX(e.salary) as SecondHighestSalary
FROM (
  SELECT DISTINCT salary, DENSE_RANK() OVER(ORDER BY salary DESC) as rnk
  FROM Employee
)e
WHERE rnk = 2;