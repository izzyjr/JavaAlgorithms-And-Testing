package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAmendTheSentence {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"JhBkPBaozMnBqEWiIaOEje", "jh bk p baoz mn bq e wi ia o eje"},
                {"VizQEogigkRZJacVELulHjG", "viz q eogigk r z jac v e lul hj g"},
                {"ILikeBreakfast", "i like breakfast"},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testAmendTheSentence(String inputString, String expectedResult) {
        assertEquals(AmendTheSentence.amendTheSentence(inputString), expectedResult);
    }
}
