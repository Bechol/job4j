package collectionspro.generic.list;

import collectionspro.generic.SimpleArray;
import org.junit.Before;
import org.junit.Test;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Test
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 06.11.2018.
 * @version 1.0.
 */
public class DynamicListTest {

    private DynamicList<Integer> dynamicList;

    @Before
    public void initialize() {
        dynamicList = new DynamicList<>();
    }
    /**
     * Тестируем метод add() с динамическим увеличением размера массива.
     */
    @Test
    public void whenCreateContainerShouldReturnTheSameType() {
        for (int i = 0;  i < 10; i++) {
            dynamicList.add(i);
        }
        assertThat(dynamicList.get(9), is(9));
    }

    /**
     * Тестирование увеличения размера массива.
     */
    @Test
    public void whenAddElementThenSizeOfContainerIncreaseInTwo() {
        dynamicList.add(1);
        dynamicList.add(2);
        dynamicList.add(3);
        assertThat(dynamicList.getSize(), is(16));
    }

    /**
     * Тестирование реализации fail-fast поведение итератора.
     */
    @Test(expected = ConcurrentModificationException.class)
    public void whenChangeListThenExeption() {
        for (int i = 0;  i < 8; i++) {
            dynamicList.add(i);
        }
        Iterator itr = dynamicList.iterator();
        itr.next();
        itr.next();
        itr.next();
        itr.next();
        itr.next();
        itr.next();
        assertThat(itr.next(), is(7));
        dynamicList.add(8);
        itr.next();
    }

}