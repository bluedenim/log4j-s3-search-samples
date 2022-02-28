# Example with Log4j

NOTE that the sample programs set up a very small batch size (publish every 10 entries) for illustration purposes.
In your programs you will most likely use a much higher number for the **stagingBufferSize** property (or a longer
period  for the **stagingBufferAge** property).

## Log4j 1.x's Obsolescence
Log4j 1.x is obsolete. It is unsafe, and it is no longer maintained.

This example project also is no longer maintained.

## Building
Be sure to modify the `log4j.properties` file to configure whatever appender you want to test.

Build with:
```
mvn install
```
in THIS subdirectory.

## Running
Once `mvn install` finishes, run the sample program with:

```
cd target
java -cp log4j-s3-search-log4j-sample.jar com.van.example.Main
```
