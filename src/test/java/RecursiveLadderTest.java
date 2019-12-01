import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RecursiveLadderTest {

    @Test
    public void ladderTest1() {
        RecursiveLadder rl = new RecursiveLadder(3);

        Assert.assertEquals(4, rl.getSteps());
    }

    @Test
    public void ladderTest2() {
        RecursiveLadder rl = new RecursiveLadder(2);

        Assert.assertEquals(2, rl.getSteps());
    }

    @Test
    public void ladderTest3() {
        RecursiveLadder rl = new RecursiveLadder(1);

        Assert.assertEquals(1, rl.getSteps());
    }

    @Test
    public void ladderTest4() {
        RecursiveLadder rl = new RecursiveLadder(5);

        Assert.assertEquals(13, rl.getSteps());

    }

    @Test
    public void ladderTest5() {
        RecursiveLadder rl = new RecursiveLadder(36);

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            rl = new RecursiveLadder(i);
            results.add(rl.getSteps());
        }

        for (int i = 2; i < 30; i++) {
            System.out.println(String.format("%d: %.9f",i,((double)results.get(i))/results.get(i-1)));
        }

    }
}