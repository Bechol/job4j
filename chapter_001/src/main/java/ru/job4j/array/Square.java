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
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}

