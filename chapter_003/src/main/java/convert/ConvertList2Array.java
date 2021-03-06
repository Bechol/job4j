package convert;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс ConvertList2Array.
 * Реализация метода преобразования ArrayList в двумерный массив.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class ConvertList2Array {
    /**
     * Метод toArray.
     * Преобразование ArrayList в двумерный массив.
     * @param list ArrayList.
     * @param rows количество строк.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % rows != 0 ? list.size() / rows + 1 : list.size() / rows;
        int[][] array = new int[rows][cells];
        int rowIndex = 0;
        int cellIndex = 0;
            for (Integer arrItem : list) {
                array[rowIndex][cellIndex] = arrItem;
                cellIndex++;
                    if (cellIndex == cells) {
                        rowIndex++;
                        cellIndex = 0;
                    }
            }
        return array;
    }

    /**
     * Метод convert.
     * Конвертация листа массивов в один лист Integer
     * @param list
     * @return лист.
     */
    public List<Integer> convert(List<int[]> list) {
        return list.stream()
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
