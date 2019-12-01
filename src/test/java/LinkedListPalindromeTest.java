import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListPalindromeTest {

    @Test
    public void palTestTrue() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(11);
        list.add(8);
        list.add(4);
        list.add(1);

        LinkedListPalindrome<Integer> ll = new LinkedListPalindrome<>();

        Assert.assertTrue(ll.isPalindrome(list));
    }

    @Test
    public void palTestFalse() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(11);
        list.add(8);
        list.add(1);

        LinkedListPalindrome<Integer> ll = new LinkedListPalindrome<>();

        Assert.assertFalse(ll.isPalindrome(list));
    }
}
