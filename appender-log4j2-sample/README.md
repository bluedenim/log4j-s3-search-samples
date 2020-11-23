# Example with Log4j 2

NOTE that the sample programs set up a very small batch size (publish every 10 entries) for illustration purposes. 
In your programs you will most likely use a much higher number for the **stagingBufferSize** property (or a longer 
period  for the **stagingBufferAge** property).

_There is currently some complication w/ Log4j 2 such that the packaging is done differently than 
that for the Log4j 1.x example. The method used is documented [here.](https://stackoverflow.com/questions/34945438/log4j2-configuration-not-found-when-running-standalone-application-builded-by-sh/34946780)_


## Building
Be sure to modify the `log4j2.xml` file to configure whatever appender you want to test.

Build with:
```
mvn install
```
in THIS subdirectory.

## Running
Once `mvn install` finishes, run the sample program with:

```
cd target
java -cp log4j-s3-search-log4j2-sample.jar com.van.example.Main
```
