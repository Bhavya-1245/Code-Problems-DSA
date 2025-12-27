# Write your MySQL query statement below
DELETE p1 FROM Person p1
JOIN Person p2
ON p2.email = p1.email
AND p1.id>p2.id;


-- DELETE p1 from person p1, person p2
-- where p1.email = p2.email and p1.id>p2.id;
-- Select id, email from person