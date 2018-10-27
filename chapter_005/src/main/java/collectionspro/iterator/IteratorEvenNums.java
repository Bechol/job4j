package collectionspro.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс IteratorEvenNums.
 * Реализация итератора четных чисел массива.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 22.10.2018.
 * @version 1.0.
 */
public class IteratorEvenNums implements Iterator<Integer> {

    private final int[] values;
    private int index = 0;

    public IteratorEvenNums(int[] values) {
        this.values = values;
    }

    /**
     * Метод hasNext();
     * Проверяет два условия:
     * 1. Следующий элемент массива есть
     * 2. Следующий элемент массива четный
     * @return результат проверки
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                result = true;
                break;
            }
        }
        return values.length > index && result;
    }

    /**
     * Метод next().
     * Анализирует текущий элемент и если он не четный переводит каретку к следующему элементу.
     * @return элемент массива.
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int result = values[index++];
        if (!(result % 2 == 0)) {
            result = this.next();
        }
        return result;
    }
}
