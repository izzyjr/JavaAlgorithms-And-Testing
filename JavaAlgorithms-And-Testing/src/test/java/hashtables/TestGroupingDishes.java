package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGroupingDishes {

    @DataProvider(name="dishes")
    private Object[][] getData() {
        return new Object[][]{new String[][] {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                                              {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                                              {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                                              {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}},
        };
    }

    @Test(dataProvider = "dishes")
    private void testMatrixElementsSum(String[][] matrix) {
        assertEquals(GroupingDishes.groupingDishes(matrix), new String[][] {{"Cheese", "Quesadilla", "Sandwich"},
                                                                            {"Salad", "Salad", "Sandwich"},
                                                                            {"Sauce", "Pizza", "Quesadilla", "Salad"},
                                                                            {"Tomato", "Pizza", "Salad", "Sandwich"}});
    }
}
