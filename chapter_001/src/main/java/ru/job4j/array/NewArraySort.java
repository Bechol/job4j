package ru.job4j.array;

import java.util.Arrays;

/**
 * Объединение двух массивов в один с последующей сортировкой элементов.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 02.05.2018
 * @version 1.0
 */

public class NewArraySort {
    /**
     * Объединяет два массива в один и потом делает сортировку. Медленная реализация задачи.
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
    /**
     * 1. Сортировка входящих массивов по возрастанию.
     * 2. Объединение отсортированных массивов.
     * 3. Сортировка результирующего массива.
     * @param arrFirst первый массив.
     * @param arrSecond второй массив.
     * @return resultArray результирующий массив.
     */

    public int[] resultArraySort(int[] arrFirst, int[] arrSecond) {
        int[] resultArray = new int[arrFirst.length + arrSecond.length];
        Arrays.sort(arrFirst);
        Arrays.sort(arrSecond);
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (firstIndex >= arrFirst.length) {
                resultArray[i] = arrSecond[secondIndex];
                secondIndex += 1;
            } else if (secondIndex >= arrSecond.length) {
                resultArray[i] = arrFirst[firstIndex];
                firstIndex += 1;
            } else if (arrFirst[firstIndex] < arrSecond[secondIndex]) {
                resultArray[i] = arrFirst[firstIndex];
                firstIndex += 1;
            } else {
                resultArray[i] = arrSecond[secondIndex];
                secondIndex += 1;
            }
        }
        return resultArray;
    }
}
