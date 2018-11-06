package collectionspro.generic.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Класс DynamicList.
 * 5.3.1. Создать динамический список на базе массива. [#158]
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 06.11.2018.
 * @version 1.0.
 */
public class DynamicList<T> implements Iterable<T> {

    private int index = 0;
    private int modCount = 0;
    private int expectedModCount = modCount;
    private Object[] objects;

    /**
     * Конструктор.
     */
    public DynamicList() {
        this.objects = new Object[2];
    }

    /**
     * Метод add.
     * Добавление элемента массива.
     * @param value параметр типа.
     */
    public boolean add(T value) {
        sizeIncrease(objects.length + 1);
        this.objects[index++] = value;
        return true;
    }

    /**
     * Метод get().
     * Вывод элемента по индексу.
     * @param index индекс.
     * @return элемент.
     */
    public T get(int index) {
        return (T) this.objects[index];
    }

    /**
     * Метод getSize().
     * Вывод размера массива.
     * @return размер массива.
     */
    public int getSize() {
        return objects.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int itIndex = 0;

            @Override
            public boolean hasNext() {
                return itIndex > index;
            }

            @Override
            public T next() {
                checkForComodification();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) objects[itIndex++];
            }
        };
    }

    /**
     * Метод sizeIncrease().
     * Увеличение размера массива.
     * @param minCapacity максимальный размер обрабатываемого массива
     */
    private void sizeIncrease(int minCapacity) {
        modCount++;
        if (minCapacity - objects.length > 0) {
            objects = Arrays.copyOf(objects, objects.length * 2);
        }
    }

    /**
     * Метод checkForComodification().
     * Проверяет подверглась ли изменению коллекция с момента создания итератора.
     */
    private void checkForComodification() {
        if (modCount != expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }
}
