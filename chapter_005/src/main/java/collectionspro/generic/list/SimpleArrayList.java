package collectionspro.generic.list;

/**
 * Класс SimpleArrayList<E>.
 * Реализация метода delete для односвязного списка.
 * @param <E> параметр типа.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 05.11.2018.
 * @version 1.0.
 */
public class SimpleArrayList<E> {

    private int size;
    private Node<E> first;

    /**
     * Метод add.
     * Добавление элемента в начало списка.
     * @param date элемент.
     */
    public void add(E date) {
        Node<E> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    /**
     * Внутренний класс Node<E>.
     * Для хранения данных.
     * @param <E> параметр типа.
     */
    private static class Node<E> {
        E date;
        Node<E> next;
        public Node(E date) {
            this.date = date;
        }
    }

    /**
     * Метод deleteFirst().
     * Удаление первого элемента списка.
     * @return удаленный элемент.
     */
    public E deleteFirst() {
        Node<E> n = this.first;
        final E element = n.date;
        final Node<E> next = n.next;
        n.date = null;
        n.next = null;
        this.first = next;
        this.size--;
        return element;
    }

    /**
     * Метод get.
     * Вывод элемента списка по индексу.
     * @param index индекс.
     * @return элемент.
     */
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    /**
     * Метод getSize().
     * Вывод размера списка.
     * @return размер списка.
     */
    public int getSize() {
        return this.size;
    }
}
