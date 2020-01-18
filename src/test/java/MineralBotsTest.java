import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MineralBotsTest {

    @Test
    public void test1() {
        int N = 1;
        int expected = 1;
        MineralBots sim = new MineralBots(N);
        int actual = sim.execute();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() {
        int N = 2;
        int expected = 2;
        MineralBots sim = new MineralBots(N);
        int actual = sim.execute();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3() {
        int N = 3;
        int expected = 3;
        MineralBots sim = new MineralBots(N);
        int actual = sim.execute();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test4() {
        int N = 4;
        int expected = 4;
        MineralBots sim = new MineralBots(N);
        int actual = sim.execute();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test5() {
        int N = 5;
        int expected = 4;
        MineralBots sim = new MineralBots(N);
        int actual = sim.execute();
        Assert.assertEquals(expected,actual);
    }
}