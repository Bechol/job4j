package sort;

import java.util.Comparator;

/**
 * Класс ListCompare.
 * Методы сортировки.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int compareLength = Integer.compare(left.length(), right.length());
        for (int index = 0; index < (compareLength > 0 ? right.length() : left.length()); index++) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            if (result != 0) {
                break;
            }
        }
        if (result == 0 && compareLength != 0) {
            result = compareLength;
        }
        return result;
    }
}
