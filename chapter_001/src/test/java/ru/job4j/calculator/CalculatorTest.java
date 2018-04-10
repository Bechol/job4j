package ru.job4j.calculator;

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
public class CalculatorTest {
    /**
     * Test Calculator.add
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calcAdd = new Calculator();
        calcAdd.add(1D, 1D);
        double result = calcAdd.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test Calculator.subtract
     */
    @Test
    public void whenSubtractFiveMinusThreeThenTwo() {
        Calculator calcSubtract = new Calculator();
        calcSubtract.subtract(5D, 3D);
        double result = calcSubtract.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test Calculator.div
     */
    @Test
    public void whenDivTenDelitFiveThenTwo() {
        Calculator calcDiv = new Calculator();
        calcDiv.div(10D, 5D);
        double result = calcDiv.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test Calculator.multiple
     */
    @Test
    public void whenMultipleFiveMultipleTwoThenTen() {
        Calculator calcMultiple = new Calculator();
        calcMultiple.multiple(5D, 2D);
        double result = calcMultiple.getResult();
        double expected = 10D;
        assertThat(result, is(expected));
    }
}

