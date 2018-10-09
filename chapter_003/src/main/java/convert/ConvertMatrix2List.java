package convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс ConvertMatrix2List.
 * Реализация метода преобразования двумерного массива в ArrayList.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class ConvertMatrix2List {
    /**
     * Метод toList.
     * gпреобразует двумерный массив в ArrayList.
     * @param array двумерный массив
     * @return ArrayList.
     */
    public List<Integer> toList(int[][] array) {
        return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
