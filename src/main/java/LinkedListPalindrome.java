import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPalindrome<E> {

    public boolean isPalindrome(LinkedList<E> list) {

        int len = list.size();
        int mid = len >> 1;
        Iterator<E> reverse = list.descendingIterator();
        Iterator<E> iterator = list.iterator();
        int i = 0;
        while (i <= mid) {
            i++;
            if (!iterator.next().equals(reverse.next())) {
                return false;
            }
        }

        return true;
    }
}
