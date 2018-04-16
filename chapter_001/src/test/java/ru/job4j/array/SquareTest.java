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
public class SquareTest {
    /**
     * Test проверка создания массива.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }
    /**
     * Test проверка суммы элементов массива.
     */
    @Test
    public void whenBound3ThenSumArray14() {
        int bound = 3;
        int sumRst = 0;
        int sumExpect = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        for (int i = 0; i != rst.length; i++) {
            sumRst += rst[i];
        }
        int[] expect = new int[] {0, 1, 4};
        for (int i = 0; i != expect.length; i++) {
            sumExpect += expect[i];
        }
        assertThat(sumRst, is(sumExpect));
    }
    /**
     * Test значения определенного элемента массива.
     */
    @Test
    public void whenBound3ThenValueOfThirdElement9() {
        int rstThree = 0;
        int expectThree = 0;
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        rstThree = rst[2];
        int[] expect = new int[] {0, 1, 4};
        expectThree = expect[2];
        assertThat(rstThree, is(expectThree));
    }
}
