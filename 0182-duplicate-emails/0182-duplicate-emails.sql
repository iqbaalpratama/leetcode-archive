/* Write your PL/SQL query statement below */
select p.email from (
    select email, count(email) as countEmail
    from person
    group by email
) p
where p.countEmail > 1;