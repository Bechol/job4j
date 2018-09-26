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
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(10);
        int[] expect = {10, 5};
        int[] result = cm.changes(50, 35, coins);
        assertThat(result, is(expect));
    }
    /**
     * Тест whenValueIs50AndPriceIs35ThenSizeOfChangesArrayis0().
     * Проверка работы при одинаковой цене и сумме внесенных денег.
     */
    @Test
    public void whenValueIs50AndPriceIs35ThenSizeOfChangesArrayis0() {
        Coffeemachine cm = new Coffeemachine();
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(10);
        int[] expect = new int[0];
        int[] result = cm.changes(50, 50, coins);
        assertThat(result, is(expect));
    }
}
