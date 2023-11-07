CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    SELECT distinct rank_salary.salary
    FROM (
        SELECT *, DENSE_RANK() OVER(ORDER BY salary DESC) as ranking
        FROM employee
    ) AS rank_salary
    WHERE rank_salary.ranking = N
  );
END