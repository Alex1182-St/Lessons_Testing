/* 1) Question # 1: Select TOP 3rd EMPLOYEE */

WITH top3rdEmpl AS
(
SELECT 
 ROW_NUMBER() OVER (
 ORDER BY empl.EMPID
 ) row_num, empl.EMPID, empl.EMPNAME
FROM test.`emp a` AS empl
LIMIT 3
)
SELECT EMPID, EMPNAME
FROM top3rdEmpl
WHERE row_num = 3


/* 2) Question # 2: Get 2nd maximum salary */

WITH secondMaxSalary AS
(
SELECT 
 ROW_NUMBER() OVER (
 ORDER BY empl.SALARY DESC
 ) row_num, empl.SALARY, empl.EMPID, empl.EMPNAME
FROM test.`emp a` AS empl
)
SELECT SALARY
FROM secondMaxSalary
WHERE row_num = 2


/* 3) Question # 3: List "EMPLOYEE NAME", DOB, "DEPARTMENT NAME" of "QA" DEPARTMENT, Sorting by "EMPLOYEE NAME" ASC */

SELECT empl.EMPNAME, empl.DOB, dept.DEPTNAME
FROM test.`emp a` AS empl
JOIN test.`dept b` AS dept
ON empl.DEPTID = dept.DEPTID
ORDER BY empl.EMPNAME ASC


/* 4) Question # 4: List "EMPLOYEE NAME", "AGE", "DEPARTMENT NAME" Sort by "AGE" DESC */

SELECT empl.EMPNAME, empl.DOB, dept.DEPTNAME
FROM test.`emp a` AS empl
JOIN test.`dept b` AS dept
ON empl.DEPTID = dept.DEPTID
ORDER BY empl.DOB DESC


/* 5) Question # 5: List "DEPARTMENT NAME", Number of Employees Sort by Number of Employees */

SELECT COUNT(empl.EMPID) AS EmplQty, dept.DEPTNAME
FROM test.`emp a` AS empl
RIGHT JOIN test.`dept b` AS dept
ON empl.DEPTID = dept.DEPTID
GROUP BY dept.DEPTID


/*
6) Question # 6: List EMPLOYEE NAME, MANAGER NAME, DEPARTMENT NAME
   (Display all employees including the ones who do not have a manager)
*/


SELECT empl.EMPNAME, empl.MGRID, dept.DEPTNAME
FROM test.`emp a` AS empl
JOIN test.`dept b` AS dept
ON empl.DEPTID = dept.DEPTID


/*
7) Question # 7: List EMPLOYEE NAME, MANAGER NAME, DEPARTMENT NAME
	(From all department which have more than one employee)
*/


SELECT empl.EMPNAME, empl.MGRID, dept.DEPTNAME
FROM test.`emp a` AS empl
JOIN test.`dept b` AS dept
ON empl.DEPTID=dept.DEPTID
WHERE empl.DEPTID IN (
SELECT DEPTID
FROM test.`emp a`
GROUP BY DEPTID
HAVING COUNT(*)>1)
