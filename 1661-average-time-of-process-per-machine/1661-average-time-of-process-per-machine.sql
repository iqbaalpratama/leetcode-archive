# Write your MySQL query statement below
select a.machine_id, round(sum(case when a.activity_type = 'start' then a.timestamp*-1 else a.timestamp end)/(count(*)/2),3) as processing_time
from activity a
group by a.machine_id;