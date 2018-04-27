package ru.job4j.array;
/**
 * Сортировка массива методом пузырька.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 21.04.2018
 * @version 1.0
 */
public class BubbleSort {
    /**
     * Method sort.
     * @param sortarray массив.
     * @return отсортированный массив.
     * Принцип работы:
     * 1. Сравниваем соседние элементы массива.
     * 2. Чтобы не уровнять элементы массива после сравнения,
     * присваиваем значение i-го элемента массива переменной tmp.
     * 3. Присваиваем значение переменной tmp элементу массива i+1.
     */
    public int[] sort(int[] sortarray) {
        for (int i = sortarray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortarray[j] > sortarray[j + 1]) {
                    int tmp = sortarray[j];
                    sortarray[j] = sortarray[j + 1];
                    sortarray[j + 1] = tmp;
                }
            }
        }
        return sortarray;
    }
}
