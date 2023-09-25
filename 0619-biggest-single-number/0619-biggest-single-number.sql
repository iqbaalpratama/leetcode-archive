# Write your MySQL query statement below
select max(t.num) as num from(
    select num
    from mynumbers
    group by num
    having count(*) = 1
    order by count(*) asc, num desc
) t;