package linkedlist;

import linkedlists.AddTwoHugeNumbers;
import linkedlists.ListNode;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAddTwoHugeNumbers {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {loadValues(new Integer[] {9876, 5432, 1999}), loadValues(new Integer[] {1, 8001}), loadValues(new Integer[] {9876, 5434, 0})},
                {loadValues(new Integer[] {123, 4, 5}), loadValues(new Integer[] {100, 100, 100}), loadValues(new Integer[] {223, 104, 105})}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAddTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b, ListNode<Integer> expectedResult) {
        assertEquals(AddTwoHugeNumbers.addTwoHugeNumbers(a, b), expectedResult);
    }

    private static ListNode<Integer> loadValues(Integer[] array) {
        int i = 0;
        ListNode<Integer> head = new ListNode<>(array[i]);
        ListNode<Integer> pointer = head;
        while (++i < array.length) {
            pointer.next = new ListNode<>(array[i]);
            pointer = pointer.next;
        }
        return head;
    }
}
