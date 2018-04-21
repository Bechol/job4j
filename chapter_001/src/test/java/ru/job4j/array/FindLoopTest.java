package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {
    /**
     * Test находит значение.
     */
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    /**
     * Test не находит значение.
     */
    @Test
    public void whenDoNotFindElementThenFalse() {
        boolean x = false;
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 31;
        int result = find.indexOf(input, value);
        if (result == -1) {
            x = true;
        }
        boolean expect = true;
        assertThat(x, is(expect));
    }
}
