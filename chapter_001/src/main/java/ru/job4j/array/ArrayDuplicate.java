package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 21.04.2018
 * @version 1.0
 */
public class ArrayDuplicate {
    /**
     * Конструктор класса. Создает массив символов из строки.
     * @param array массив с дубликатами.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = null;
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
