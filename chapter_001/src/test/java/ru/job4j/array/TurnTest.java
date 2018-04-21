package ru.job4j.array;
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
public class TurnTest {
    /**
     * Test проверка переворота массива с четным числом элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = turner.back(input);
        int[] expect = new int[] {6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
    /**
     * Test проверка переворота массива с нечетным числом элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
