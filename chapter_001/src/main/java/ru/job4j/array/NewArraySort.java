package ru.job4j.array;
/**
 * Объединение двух массивов в один с последующей сортировкой элементов.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 02.05.2018
 * @version 1.0
 */

public class NewArraySort {
    /**
     * Объединяет два массива в один и потом делает сортировку.
     * @param firstArray первый массив.
     * @param secondArray второй массив.
     */
    public int[] thirdArrSort(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        BubbleSort sortArray = new BubbleSort();
        sortArray.sort(newArray);
        return newArray;
    }
}
