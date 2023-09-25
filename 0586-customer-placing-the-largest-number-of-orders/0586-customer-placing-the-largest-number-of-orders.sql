/* Write your PL/SQL query statement below */
select t.customer_number
from (
    select customer_number, count(*) as customer_count
    from orders
    group by customer_number
    order by customer_count desc
) t where rownum = 1;