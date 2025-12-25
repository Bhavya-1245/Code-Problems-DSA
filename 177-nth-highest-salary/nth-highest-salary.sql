CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
    --  SELECT DISTINCT salary 
    --  FROM (SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) as ranking from Employee) as RANKED_SALARIES where ranking = N

    SELECT DISTINCT e1.salary FROM Employee e1
    WHERE N = (SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2 WHERE e2.salary>=e1.salary)
  );
END