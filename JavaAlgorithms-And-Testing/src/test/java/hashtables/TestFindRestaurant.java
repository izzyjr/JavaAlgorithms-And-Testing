package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestFindRestaurant {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
                        new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"},
                        List.of("Shogun")},
                {new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
                        new String[] {"KFC","Shogun","Burger King"},
                        List.of("Shogun")},
                {new String[] {"happy","sad","good"},
                        new String[] {"sad","happy","good"},
                        List.of("sad", "happy")},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindRestaurant(String[] list1, String[] list2, List<String> expectedResult) {
        assertEquals(FindRestaurant.findRestaurant(list1, list2), expectedResult);
    }
}
