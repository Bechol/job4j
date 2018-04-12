package ru.job4j.loop;

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
public class CounterTest {
    /**
     * Test While
     */
    @Test
    public void whenCounterFromOneToTenThenSummThirtyWhile() {
        Counter cn = new Counter();
        int result = cn.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
    /**
     * Test For
     */
    @Test
    public void whenCounterFromOneToTenThenSummThirtyFor() {
        Counter cn = new Counter();
        int result = cn.addFor(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}
