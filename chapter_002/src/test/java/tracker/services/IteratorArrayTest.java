package tracker.services;

import org.junit.Test;
import java.util.Iterator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IteratorArrayTest {
    /**
     * Внутренний статиеский класс ForEachArray.
     * Реализует интерфейс Itearable.
     * Возвращает итератор входящего массива.
     */
    public static final class ForEachArray implements Iterable {

        private final int[] values;

        public ForEachArray(int[] values) {
            this.values = values;
        }

        @Override
        public Iterator iterator() {
            return new IteratorArray(this.values);
        }
    }

    /**
     * Тестирование метода next().
     */
    @Test
    public void whenGetNextCallShouldPointerForward() {
        IteratorArray it = new IteratorArray(new int[] {1, 4});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(4));
    }

    /**
     * Тестирование метода hasNext().
     */
    @Test
    public void whenCheckNextPositionShouldReturnConstantValue() {
        IteratorArray it = new IteratorArray(new int[] {1});

        it.next();
        it.hasNext();
        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

    /**
     * Демонтрация работы метода forEach().
     * Это не тест.
     * Реализация конструкции forEach для любого множества.
     */
    @Test
    public void foreach() {
        ForEachArray forEachArray = new ForEachArray(new int[] {1, 5, 3});
        for (Object value : forEachArray) {
            System.out.println(value);
        }
    }
}