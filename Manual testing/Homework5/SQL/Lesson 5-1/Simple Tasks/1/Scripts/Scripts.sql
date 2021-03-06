
/*VAR-1 (Безработные)*/

SELECT Name, Surname AS Surname_Of_Nonworking_InCapitals_GB_Spain
FROM lesson5_1.peopleinfo
Where IsOccupied=0 AND (CityID IN ("29", "30"));


/*VAR-2 (Безработные)*/

SELECT Name, Surname AS Surname_Of_Nonworking_InCapitals_GB_Spain
FROM lesson5_1.peopleinfo
Where IsOccupied=0 AND (CityId IN (SELECT CityID From lesson5_1.countryinfo WHERE CityName IN ('London', 'Madrid')));



/*VAR-1 Работающие (Ukraine, Poland)*/

SELECT COUNT(ID) AS WorkingPeople_Ukraine_Poland_NonCapitals
FROM lesson5_1.peopleinfo
WHERE IsOccupied=1 AND (CityID IN (
SELECT CityID 
FROM lesson5_1.countryinfo 
WHERE IsCapital=0 AND (CountryName IN ('Ukraine', 'Poland')) AND (
Population BETWEEN 500000 AND 1000000) OR (Population BETWEEN 10000 AND 50000))
);


/*VAR-2 Работающие (Ukraine, Poland)*/

SELECT COUNT(ID) AS WorkingPeople_Ukraine_Poland_NonCapitals
FROM lesson5_1.countryinfo AS countryinfo INNER JOIN lesson5_1.peopleinfo AS peopleinfo
ON countryinfo.CityID = peopleinfo.CityID
WHERE CountryName IN ('Ukraine', 'Poland') AND IsCapital=0 AND IsOccupied=1
AND ((Population BETWEEN 500000 AND 1000000) OR (Population BETWEEN 10000 AND 50000));