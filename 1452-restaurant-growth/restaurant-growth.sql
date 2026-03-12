# Write your MySQL query statement below
select t.visited_on, t.amount, round(t.amount/7, 2) as average_amount
from (select d.visited_on,
sum(d.amount) over(order by d.visited_on rows between 6 preceding and current row) as amount,
count(*) over(order by d.visited_on rows between 6 preceding and current row) as cnt
from (select visited_on, sum(amount) as amount from Customer group by visited_on)d
)t
where cnt = 7 order by t.visited_on 