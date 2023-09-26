/* Write your PL/SQL query statement below */
select employee.name, bonus.bonus
from employee
left outer join bonus on employee.empId = bonus.empId
where bonus.bonus < 1000 or bonus.bonus is null;