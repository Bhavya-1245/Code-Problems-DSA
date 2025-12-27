# Write your MySQL query statement below
SELECT e.name as 'Employee' FROM Employee e JOIN Employee M ON e.managerID = M.id AND e.salary>M.salary;