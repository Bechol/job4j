package ru.job4j.array;
/**
 * Заполнение массива ичслами, возведенными в квадрат.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 13.04.2018
 * @version 1.0
 */
public class Square {
    /**
     * Method calculate.
     * @param bound длина массива.
     * @return массив с числами, возведенными в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i < rst.length; i++) {
            //к каждому индексу элемента массива необходимо прибавить 1.
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }
}

