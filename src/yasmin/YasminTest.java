package yasmin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YasminTest {
    public static int rand(int a, int b) {
        int x = (int) (Math.random() * ((b - a) + 1)) + a;
        return x;
    }

    @Test
    public void fixedTests() {
        assertEquals(7, Kata.oddCount(15));
        assertEquals(7511, Kata.oddCount(15023));
    }

    @Test
    public void randomTest() {
        for (int i = 10; i < 1000; i++) {
            int x = rand((int) (2e9), 2147483647);
            assertEquals(x / 2, Kata.oddCount(x));
        }
    }
}