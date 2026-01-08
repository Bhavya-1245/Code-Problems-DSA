# Write your MySQL query statement below
Select teacher_id, count(distinct subject_id) as cnt
From teacher group by teacher_id