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
public class ConverterTest {
    /**
     * Test Converter.rurToUsd
     */
    @Test
    public void when600RubToUsdThenTenUsd() {
        Converter convRurUsd = new Converter();
        int result = convRurUsd.rurToUsd(600);
        int expected = 10;
        assertThat(result, is(expected));
    }
    /**
     * Test Converter.usdToRur
     */
    @Test
    public void when1000UsdToRurThen60KRur() {
        Converter convUsdRur = new Converter();
        int result = convUsdRur.usdToRur(1000);
        int expected = 60000;
        assertThat(result, is(expected));
    }
    /**
     * Test Converter.rurToEur
     */
    @Test
    public void when7000RurToEurThen100Eur() {
        Converter convRurEur = new Converter();
        int result = convRurEur.rurToEur(7000);
        int expected = 100;
        assertThat(result, is(expected));
    }
    /**
     * Test Converter.eurToRur
     */
    @Test
    public void when5EurToRurThen350Rur() {
        Converter convEurRur = new Converter();
        int result = convEurRur.eurToRur(5);
        int expected = 350;
        assertThat(result, is(expected));
    }
}
