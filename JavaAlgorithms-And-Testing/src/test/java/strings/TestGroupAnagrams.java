package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestGroupAnagrams {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        List<List<String>> data = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        return new Object[][]{
                new String[] {"eat","tea","tan","ate","nat","bat"}, data.toArray()
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testGroupAnagrams(String[] strs, List<List<String>> expectedResult) {
        assertEquals(GroupAnagrams.groupAnagrams(strs), expectedResult);
    }
}
