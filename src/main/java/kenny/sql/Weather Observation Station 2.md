Query the following two values from the STATION table:

The sum of all values in LAT_N rounded to a scale of 2 decimal places.
The sum of all values in LONG_W rounded to a scale of 2 decimal places.

![img_1.png](img_1.png)


```roomsql
select 
round(sum(lat_n), 2) as lat, 
round(sum(long_w), 2) as lon
from station
```