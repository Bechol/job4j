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
public class BubbleSortTest {
    /**
     * Test сортируем заданный массив и сравниваем с контрольным значением.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] testArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = bs.sort(testArray);
        int[] checkArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(checkArray, is(resultArray));
    }
}
