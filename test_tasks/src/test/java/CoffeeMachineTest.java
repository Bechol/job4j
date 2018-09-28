import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CoffeeMachineTest {
    /**
     * Тест whenValueIs50AndPriceIs35ThenChangesIs10And5().
     * Проверка работы при заданных условиях.
     */
    @Test
    public void whenValueIs50AndPriceIs35ThenChangesIs10And5() {
        Coffeemachine cm = new Coffeemachine();
        int[] expect = {10, 5};
        int[] result = cm.changes(50, 35);
        assertThat(result, is(expect));
    }
    /**
     * Тест whenValueIs100AndPriceIs27ThenChangesIs10And2And1().
     * Проверка работы при заданных условиях.
     */
    @Test
    public void whenValueIs100AndPriceIs27ThenChangesIs10And2And1() {
        Coffeemachine cm = new Coffeemachine();
        int[] expect = {10, 10, 10, 10, 10, 10, 10, 2, 1};
        int[] result = cm.changes(100, 27);
        assertThat(result, is(expect));
    }
    /**
     * Тест whenValueIs50AndPriceIs49ThenChangesIs1().
     * Проверка работы при заданных условиях.
     */
    @Test
    public void whenValueIs50AndPriceIs49ThenChangesIs1() {
        Coffeemachine cm = new Coffeemachine();
        int[] expect = {1};
        int[] result = cm.changes(50, 49);
        assertThat(result, is(expect));
    }
    /**
     * Тест whenValueIs50AndPriceIs35ThenSizeOfChangesArrayis0().
     * Проверка работы при одинаковой цене и сумме внесенных денег.
     */
    @Test
    public void whenValueIs50AndPriceIs35ThenSizeOfChangesArrayis0() {
        Coffeemachine cm = new Coffeemachine();
        int[] expect = new int[0];
        int[] result = cm.changes(50, 50);
        assertThat(result, is(expect));
    }

    /**
     * Тест whenValueIs20AndPriceIs35ThenSizeOfChangesArrayis0(
     * Проверка работы при одинаковой цене и сумме внесенных денег.
     */
    @Test
    public void whenValueIs20AndPriceIs35ThenSizeOfChangesArrayis0() {
        Coffeemachine cm = new Coffeemachine();
        int[] expect = new int[0];
        int[] result = cm.changes(20, 35);
        assertThat(result, is(expect));
    }
}
