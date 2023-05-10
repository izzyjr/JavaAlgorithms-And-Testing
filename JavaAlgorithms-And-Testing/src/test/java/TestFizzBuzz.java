import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestFizzBuzz {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][] {
                {3, Arrays.asList("1", "2", "Fizz")},
                {5, Arrays.asList("1","2","Fizz","4","Buzz")},
                {15, Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz")}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFizzBuzz(int n, List<String> expectedResult) {
        assertEquals(FizzBuzz.fizzBuzz(n), expectedResult);
    }
}
