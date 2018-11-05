package collectionspro.generic.list;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 05.11.2018.
 * @version 1.0.
 */

public class SimpleArrayListTest {

    private SimpleArrayList<Integer> list;

    @Before
    public void initialize() {
        list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void whenAddThreeElementsThenUseGetOneResultTwo() {
        assertThat(list.get(1), is(2));
    }

    @Test
    public void whenAddThreeElementsThenUseGetSizeResultThree() {
        assertThat(list.getSize(), is(3));
    }

    @Test
    public void whenDeleteFirstElementThenNewValueIsNext() {
        list.deleteFirst();
        assertThat(list.get(0), is(2));
    }
}