package tracker.services;

import java.util.Iterator;
/**
 * Класс IteratorArray.
 * Демонтрация работы методов next() и hasNext().
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 22.10.2018.
 * @version 1.0.
 */
public class IteratorArray implements Iterator {

    private final int[] values;
    private int index = 0;

    /**
     * Конструктор.
     * @param values входящий массив.
     */
    public IteratorArray(final int[] values) {
        this.values = values;
    }

    /**
     * Метод hasNext().
     * Проверяет возможность перехода к следующему элементу массива.
     * @return true/false.
     */
    @Override
    public boolean hasNext() {
        return values.length > index;
    }

    /**
     * Метод next().
     * Возращает значение текущего элемента и переводит каретку на одну позицию вперед.
     * @return значение текущего элемента массива.
     */
    @Override
    public Object next() {
        return values[index++];
    }
}
