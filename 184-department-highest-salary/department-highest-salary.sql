# Write your MySQL query statement below
SELECT d.name as Department, e.name as Employee, e.salary as Salary FROM Department d
RIGHT JOIN Employee e
ON e.departmentId = d.id 
WHERE (e.departmentId, e.salary) IN 
(SELECT departmentId, MAX(salary) FROM Employee GROUP BY departmentId); 