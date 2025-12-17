# Write your MySQL query statement below

WITH ranked_table AS(SELECT d.name AS Department,
e.name AS Employee, 
e.salary as SALARY, 
DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC) as rnk 
FROM department d join
employee e on e.departmentId = d.id)
SELECT Department, EMployee, Salary FROM ranked_table WHERE rnk<=3;