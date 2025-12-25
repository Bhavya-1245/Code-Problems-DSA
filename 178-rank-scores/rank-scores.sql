# Write your MySQL query statement below
WITH ranked AS (
  SELECT score, DENSE_RANK() OVER(ORDER BY score DESC) as 'rank' FROM SCORES
)
SELECT * FROM ranked;