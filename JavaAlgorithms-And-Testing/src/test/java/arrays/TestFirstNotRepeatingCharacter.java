package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFirstNotRepeatingCharacter {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"abacabad", 'c'},
                {"abacabaabacaba", '_'},
                {"bcb", 'c'},
                {"zzz", '_'},
                {"bcccccccb", '_'},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFirstNotRepeatingCharacter(String input, char expectedResult) {
        assertEquals(FirstNotRepeatingCharacter.firstNotRepeatingCharacter(input), expectedResult);
    }
}
