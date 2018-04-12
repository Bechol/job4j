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
public class FactorialTest {
    /**
     * Test n=5;
     */
    @Test
    public void whenNisFiveThenFactorial120() {
        Factorial fact = new Factorial();
        int result = fact.run(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
    /**
     * Test n=0;
     */
    @Test
    public void whenZeroThenFactorialIsOne() {
        Factorial fact = new Factorial();
        int result = fact.run(0);
        int expected = 1;
        assertThat(result, is(expected));
    }

}
