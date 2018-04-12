package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFisrtLessThanSecond() {
        Max maximum = new Max();
        int result = maximum.maxInt(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstLessThanOther() {
        Max maxThree = new Max();
        int result = maxThree.maxIntFromThree(1, 2, 3);
        assertThat(result, is(3));
    }
}
