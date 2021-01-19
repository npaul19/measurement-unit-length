# OOPS Exercise on Metric Units of Length
We are provided with ```Centimeter.java``` and 2 passing tests in ```CentimeterTest.java``` <br>
**Requirement - Equate 100cm to 1m, 100cm to 0.001km, 100m to 0.1km**

**Solution1**
- Created Meter.java
- should not have used convertedToMeter method because the requirement is to equate, not convert (show that conversion is happening)
- equalTo hamcrest matcher uses equals method to compare objects, ```assertThat(hundredCentimeter, is(equalTo(oneMeter)))``` would be treated as ```hundredCentimeter.equals(oneMeter)```
- So, updated Centimeter.equals(), if the object is an instance of Meter, check the converted magnitudes.
- **Problems**
  - equals() should work reflexive, symmetric and transitive. ```assertThat(oneMeter, is(equalTo(hundredCentimeter)))``` will fail.
  - Meter.java doesn't have any Test class.
  
**Solution2**
 - modified equals() in Meter.java and now equals is reflexive, symmetric and transitive.
 - Created Kilometer.java and tested on it.
 - **Problems**
  - equals logic shows dupliction of code
  - should use Fewest elements
  - Now, try to use only one class

**Solution3**
- Length - factory methods - String unit, mag, factor
