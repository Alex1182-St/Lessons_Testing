/*Could you please write a SQL statement to select all clients (ClientId), who received services only within one region?*/

CREATE TEMPORARY TABLE tempt AS (SELECT serv.ClientId, serv.RegionId, COUNT(serv.ClientID), COUNT(serv.RegionId)
FROM lesson5_2.services AS serv
GROUP BY serv.ClientId, serv.RegionId);

SELECT lesson5_2.tempt.ClientId
FROM lesson5_2.tempt
GROUP BY lesson5_2.tempt.ClientId
HAVING COUNT(lesson5_2.tempt.ClientId)<=1;
