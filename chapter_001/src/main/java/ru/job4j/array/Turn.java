package ru.job4j.array;
/**
 * Зеркальный переворот массива.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 21.04.2018
 * @version 1.0
 */
public class Turn {
    /**
     * Method back.
     * @param array массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
        return array;
    }
}
