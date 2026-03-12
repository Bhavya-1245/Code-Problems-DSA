# Write your MySQL query statement below
(select u.name as results from Users u
join MovieRating mr on u.user_id = mr.user_id group by mr.user_id order by count(*) desc, u.name asc limit 1)

union all

(select m.title as results from Movies m
join MovieRating mr on m.movie_id = mr.movie_id where mr.created_at>'2020-01-31' and mr.created_at<'2020-03-01' group by mr.movie_id order by avg(mr.rating) desc, m.title asc limit 1)