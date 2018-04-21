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
     */
    public int[] sort(int[] sortarray) {
        for (int i = sortarray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //если данный элемент массива больше чем следующий за ним, то...
                if (sortarray[j] > sortarray[j + 1]) {
                    /*
                    ..чтобы не уровнять элементы после сравнения,
                    присваиваем значение данного элемента массива переменной tmp.
                    */
                    int tmp = sortarray[j];
                    //уравниваем значения элементов.
                    sortarray[j] = sortarray[j + 1];
                    //значение следующего элемента массива равно значению переменной tmp.
                    sortarray[j + 1] = tmp;
                }
            }
        }
        return sortarray;
    }
}
