# Write your MySQL query statement below
SELECT DISTINCT a.num as ConsecutiveNums from logs a
JOIN logs b 
on b.id = a.id + 1 and b.num = a.num
JOIN logs c
on c.id = a.id + 2 and c.num = a.num