# Example with Log4j

NOTE that the sample programs set up a very small batch size (publish every 10 entries) for illustration purposes. 
In your programs you will most likely use a much higher number for the **stagingBufferSize** property (or a longer 
period  for the **stagingBufferAge** property).

### Log4j 1.x Notes
There is currently a security vulnerability with Log4j 1.x (https://github.com/advisories/GHSA-2qrg-x229-3v8q). 

In addition, Log4j hasn't been worked on since mid-2012. All activities have gone into Log4j 2. 

New development should probably go with Log4j2. The Log4j2 version of this library is available. The corresponding 
example module (appender-log4j2-sample) is also in this repository.

## Building
Be sure to modify the `log4j.properties` file to configure whatever appender you want to test.

### Use Docker
Because the code base and environment are both quite dated, use the configured Docker environment (OpenJDK 11) to build:
```
docker-compose build
docker-compose run --rm app /bin/bash
```
### Build
Build with (inside the Docker container):
```
mvn install
```

## Running
Once `mvn install` finishes, run the sample program with:

```
cd target
java -cp log4j-s3-search-log4j-sample.jar com.van.example.Main
```
