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
public class MatrixTest {
    /**
     * Test проверка элементов таблицы.
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
    /**
     * Test суммы элементов строки таблицы.
     */
    @Test
    public void wheni5ThenSum270() {
        Matrix matrix = new Matrix();
        int size = 9; //размер таблицы.
        int resultSum = 0; //результат сложения элементов 5-ой строки.
        int testSum = 270; //проверочное число.
        int[][] table = matrix.multiple(size);
        for (int j = 0; j < size; j++) {
            resultSum += table[5][j];
        }
        assertThat(testSum, is(resultSum));
    }
    /**
     * Test создание проверочного массива из элементов j-того столбца.
     */
    @Test
    public void whenj5ThenArrayOk() {
        Matrix matrix = new Matrix();
        int size = 9; //размер таблицы.
        int[] resultArray = {6, 12, 18, 24, 30, 36, 42, 48, 54}; //проверочный массив.
        int[] testArray = new int[size];
        int[][] table = matrix.multiple(size);
        for (int i = 0; i < size; i++) {
            testArray[i] = table[i][5]; //заполнение массива элементами столбца с идексом 5.
        }
        assertThat(resultArray, is(testArray));

    }

}
