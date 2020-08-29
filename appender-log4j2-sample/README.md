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
at the top-level subdirectory.

## Running
Once module is built, run the sample program with:

```
cd appender-log4j2-sample
java -cp target\appender-log4j2-sample-1.0.1-shaded.jar com.van.example.Main
```

NOTE: You may need to use the correct name for the jar file if the version has changed. This example assumes we are on
version 1.0.1.
