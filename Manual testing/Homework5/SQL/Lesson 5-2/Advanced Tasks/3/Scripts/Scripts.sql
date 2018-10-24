
/*1)	Select projects without employees*/

SELECT project.p_id, project.name
FROM project
JOIN assign ON project.p_id=assign.p_id
WHERE assign.e_id IS NULL;


/*2)	Select projects where average salary of all employees is less than 1000*/ 

SELECT project.name AS ProjectName, AVG(empl.salary) AS EmployeeAverageSalary
FROM lesson5_2.assign AS assign
LEFT JOIN lesson5_2.empl AS empl ON assign.e_id=empl.e_id
LEFT JOIN lesson5_2.project AS project ON assign.p_id=project.p_id
GROUP BY project.name
HAVING AVG(empl.salary)<1000 AND project.name IS NOT NULL;
