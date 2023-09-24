/* Write your PL/SQL query statement below */
select t.Department, t.Employee, t.Salary from (
select d.id as id_department, e.id as id_employee, d.name as Department, e.name as Employee, salary as Salary, dense_rank() over (partition by e.departmentId order by salary desc) as salary_rank
from employee e
left join department d
on e.departmentId = d.id) t
where t.salary_rank IN (1,2,3)
order by t.id_department;