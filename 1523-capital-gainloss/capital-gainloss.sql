# Write your MySQL query statement below
select t.stock_name, (t.sell-t.buy) as capital_gain_loss
from (select stock_name, 
sum(case when operation = 'Buy' then price else 0 end) as buy,
sum(case when operation = 'Sell' then price else 0 end) as sell
from Stocks group by stock_name)t
order by t.stock_name 