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
public class NewArraySortTest {
    /**
     * Test сравнение двух массивов.
     */
    @Test
    public void whenFirstArrayIs5ElementsAndSecondArrayIs5ElementMakeThirdArray10ElementsAndSort() {
        int[] firstArray = {34, 56, 38, 378, 89};
        int[] secondArray = {45, 238, 12, 87, 44};
        int[] expected = {12, 34, 38, 44, 45, 56, 87, 89, 238, 378};
        NewArraySort newArray = new NewArraySort();
        int[] resultArray = newArray.thirdArrSort(firstArray, secondArray);
        assertThat(resultArray, is(expected));

    }
    /**
     * Test сравнение двух cумм элементов массивов.
     */
    @Test
    public void whenSumOfTwoElementsOfArrayIs79ThenSumOfElementOfResultArrayIs79() {
        int[] firstArray = {34, 56, 38, 378, 89};
        int[] secondArray = {45, 238, 12, 87, 44};
        int expextedSum = 79;
        NewArraySort newArray = new NewArraySort();
        int[] resultArray = newArray.thirdArrSort(firstArray, secondArray);
        int resultSum = resultArray[1] + resultArray[4];
        assertThat(resultSum, is(expextedSum));

    }
    /**
     * Test сравнение двух массивов.
     */
    @Test
    public void whenFirstArrayIs153AndSecondArrayIs624ThenResultArrayIs123456() {
        int[] arrFirst = {3, 1, 89, 115, 26, 174, 25};
        int[] arrSecond = {44, 29, 51};
        int[] expectedArray = {1, 3, 25, 26, 29, 44, 51, 89, 115, 174};
        NewArraySort arraySortTest = new NewArraySort();
        int[] resultArray = arraySortTest.resultArraySort(arrFirst, arrSecond);
        assertThat(resultArray, is(expectedArray));
    }
}
