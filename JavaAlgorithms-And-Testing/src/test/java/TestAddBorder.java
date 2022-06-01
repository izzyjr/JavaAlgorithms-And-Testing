import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAddBorder {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"abc", "ded"}, new String[] {"*****", "*abc*", "*ded*", "*****"}},
                {new String[] {"a"}, new String[] {"***", "*a*", "***"}},
                {new String[] {"wzy**"}, new String[] {"*******", "*wzy***", "*******"}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAddBorder(String[] picture, String[] expectedResult) {
        assertEquals(AddBorder.addBorder(picture), expectedResult);
    }
}
