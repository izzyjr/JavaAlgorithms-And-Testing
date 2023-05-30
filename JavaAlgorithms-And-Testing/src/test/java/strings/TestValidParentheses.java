package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestValidParentheses {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][] {
                {"()[]{}", true},
                {"(())", true},
                {"{]", false},
                {"(({[]}))", true},
                {"[(){}[]]", true}
        };
    }

    @Test(dataProvider="stringsAndResult")
    private void testValidParentheses(String s, Boolean expectedResult) {
        assertEquals(ValidParentheses.validParentheses(s), expectedResult);
    }
}
