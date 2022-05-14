package linkedlist;

import linkedlists.IsListPalindrome;
import linkedlists.ListNode;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsListPalindrome {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {loadValues(new Integer[] {0, 1, 0}), true},
                {loadValues(new Integer[] {3, 5, 3, 5}), false},
                {loadValues(new Integer[] {1, 2, 3, 1, 2, 3}), false},
                {loadValues(new Integer[] {1, 2, 3, 3, 2, 1}), true},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIsListPalindrome(ListNode<Integer> list, boolean expectedResult) {
        assertEquals(IsListPalindrome.isListPalindrome(list), expectedResult);
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
