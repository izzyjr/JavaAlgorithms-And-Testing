package linkedlists;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode<?> listNode = (ListNode<?>) o;
        return Objects.equals(value, listNode.value) && Objects.equals(next, listNode.next);
    }
}
