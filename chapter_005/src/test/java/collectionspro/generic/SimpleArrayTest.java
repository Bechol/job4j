package collectionspro.generic;

import org.junit.Test;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleArrayTest {

    @Test
    public void whenCreateContainerShouldReturnTheSameType() {
        SimpleArray<Integer> simple = new SimpleArray<>(4);
        simple.add(11);
        assertThat(simple.get(0), is(11));
    }

    @Test
    public void whenCreateContainerShouldEditTheSameType() {
        SimpleArray<Integer> simple = new SimpleArray<>(4);
        simple.add(11);
        simple.set(0, 99);
        assertThat(simple.get(0), is(99));
    }

    @Test
    public void whenCreateContainerShouldDeleteTheSameType() {
        SimpleArray<Integer> simple = new SimpleArray<>(10);
        simple.add(11);
        simple.add(12);
        simple.add(13);
        simple.add(14);
        simple.delete(2);
        assertThat(simple.get(2), is(14));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldReturnEvenNumbersSequentially() {
        SimpleArray<Integer> simple = new SimpleArray<>(10);
        Iterator<Integer> iterator = simple.iterator();
        simple.add(11);
        simple.add(12);
        simple.add(13);
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(11));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(12));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(13));
        assertThat(iterator.hasNext(), is(false));
        iterator.next();
    }

    @Test
    public void sequentialHasNextInvocationDoesntAffectRetrievalOrder() {
        SimpleArray<Integer> simple = new SimpleArray<>(10);
        Iterator<Integer> iterator = simple.iterator();
        simple.add(11);
        simple.add(12);
        simple.add(13);
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(11));
        assertThat(iterator.next(), is(12));
        assertThat(iterator.next(), is(13));
    }

    @Test
    public void shouldReturnFalseIfNoAnyEvenNumbers() {
        SimpleArray<Integer> simple = new SimpleArray<>(10);
        Iterator<Integer> iterator = simple.iterator();
        assertThat(iterator.hasNext(), is(false));
    }

    @Test
    public void allNumbersAreEven() {
        SimpleArray<Integer> simple = new SimpleArray<>(10);
        Iterator<Integer> iterator = simple.iterator();
        simple.add(11);
        simple.add(12);
        simple.add(13);
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(11));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(12));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(13));
    }

}