package collectionspro.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс SimpleArray<T>.
 * Создание универсальной обертки над массивом при помощи дженериков.
 * @param <T> тип.
 */
public class SimpleArray<T> implements Iterable<T> {

   private Object[] objects;
   private int index = 0;

    /**
     * Конструктор.
     * @param size размер массива.
     */
    public SimpleArray(int size) {
        this.objects =  new Object[size];
    }

    /**
     * Метод add.
     * Добавление элемента массива.
     * @param model параметр типа.
     */
    public void add(T model) {
        try {
            this.objects[index++] = model;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Переполенение: ");
            e.printStackTrace();
        }
    }

    /**
     * Метод set.
     * Изменение элемента массива.
     * @param index индекс элемента.
     * @param model параметр типа.
     */
    public void set(int index, T model) {
        this.objects[index] = model;
    }

    /**
     * Метод delete.
     * Удаление элемента из массива по индексу.
     * @param index индекс элемента.
     */
    public void delete(int index) {
        System.arraycopy(
                this.objects, index + 1, this.objects,
                index, this.index + 1 - index);
        this.objects[this.index--] = null;
    }

    /**
     * Метод get.
     * Вывод элемента массива по индексу.
     * @param index индекс элемента массива.
     * @return элемент массива.
     */
    public T get(int index) {
        return (T) this.objects[index];
    }

    /**
     * Итератор для массива.
     * @return итератор.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int itIndex = 0;

            /**
             * Метод hasnext().
             * Проверка наличия следующего элемента в маасиве.
             * @return true/false.
             */
            @Override
            public boolean hasNext() {
                return itIndex < index;
            }

            /**
             * Метод next.
             * Вывод теккущего элемента массива и перевод каретки на следующую позицию еckb hasNext = true..
             * @return элемент массива.
             */
            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) objects[itIndex++];
            }
        };
    }
}
