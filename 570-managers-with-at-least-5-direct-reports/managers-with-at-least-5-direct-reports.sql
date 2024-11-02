-- SELECT e.name
-- FROM Employee AS e 
-- INNER JOIN Employee AS m ON e.id=m.managerId 
-- GROUP BY m.managerId 
-- HAVING COUNT(m.managerId) >= 5

select e1.name
from Employee e1 
join
(
    select managerId, count(*) as total
    from Employee
    group by managerId
    having count(*) >=5
) e2 
on e1.id = e2.managerId;