
/*"Bruce"*/

SELECT *
FROM lesson5_2.customers AS customers INNER JOIN lesson5_2.orders AS orders
ON customers.CustomerID = orders.CustomerID
WHERE customers.Name Like '%Bruce%';


/*"Order's sum with the same status"*/

SELECT Status, SUM(Price)
FROM lesson5_2.orders
WHERE Status IN ('Complete')
UNION
SELECT Status, SUM(Price)
FROM lesson5_2.orders
WHERE Status IN ('In progress')
UNION
SELECT Status, SUM(Price)
FROM lesson5_2.orders
WHERE Status IN ('Open');


/*"Customer name and status"*/

SELECT customers.Name, orders.Status
FROM lesson5_2.customers AS customers LEFT JOIN lesson5_2.orders AS orders
ON customers.CustomerID=orders.CustomerID
ORDER BY Status;


/*"Customer + OrderID + Country"*/

SELECT customers.Name, orders.OrderID, country.Name
FROM lesson5_2.customers AS customers 
JOIN lesson5_2.orders AS orders ON customers.CustomerID=orders.CustomerID
JOIN lesson5_2.country AS country ON customers.CountryID=country.ID;






