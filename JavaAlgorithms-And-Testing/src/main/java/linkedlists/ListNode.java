package linkedlists;

public class ListNode<T> {

    public T value;
    public ListNode<T> next;

    public ListNode(T x) {
     value = x;
   }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
