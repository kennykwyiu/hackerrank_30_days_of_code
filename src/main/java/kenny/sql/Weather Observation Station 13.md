Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than 38.7880 and less than 137.2345. 
Truncate your answer to 4 decimal places.

![img_1.png](img_1.png)


```roomsql
select round(sum(lat_n), 4)
from station
where lat_n > 38.7880 and lat_n < 137.2345;
```