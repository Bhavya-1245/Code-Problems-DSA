# Write your MySQL query statement below
select p.product_id, p.product_name from product p
join sales s on s.product_id = p.product_id
group by p.product_name, p.product_id
having min(s.sale_date)>'2018-12-31'
and max(s.sale_date)<'2019-04-01'