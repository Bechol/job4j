package ru.job4j.array;
/**
 * Поиск в массиве перебором значений элементов.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.04.2018
 * @version 1.0
 */
public class FindLoop {
    /**
     * Method indexOf.
     * @param data массив.
     * @param el искомое значение.
     * @return индекс искомого значения.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++)  {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
