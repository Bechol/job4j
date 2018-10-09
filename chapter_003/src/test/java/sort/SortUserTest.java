package sort;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Oleg Bech
 */
public class SortUserTest {
    private SortUser sortUser = new SortUser();
    private List<User> list = new ArrayList<>();

    /**
     * Тест whenNaturalSortingUsersThenListIsSorted().
     * Натуральная сортировка.
     */
    @Test
    public void whenNaturalSortingUsersThenListIsSorted() {
        User user1 = new User("Andrey", 31);
        User user2 = new User("Sergey", 24);
        User user3 = new User("Oleg", 65);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Set<User> result = sortUser.sort(list);
        Set<User> expect = new LinkedHashSet<>();
        expect.add(user2);
        expect.add(user1);
        expect.add(user3);
        assertThat(result, is(expect));
    }

    /**
     * Тест whenSortByAllFieldsThenListIsSorted().
     * Сортировка по всем полям класса.
     */
    @Test
    public void whenSortByAllFieldsThenListIsSorted() {
        User user1 = new User("Andrey", 31);
        User user2 = new User("Bob", 31);
        User user3 = new User("Andrey", 65);
        list.add(user2);
        list.add(user1);
        list.add(user3);
        List<User> result = sortUser.sortByAllFields(list);
        List<User> expect = new ArrayList<>();
        expect.add(user1);
        expect.add(user3);
        expect.add(user2);
        assertThat(result, is(expect));
    }

    /**
     * Тест whenSortByNameLengthThenResultIsSortedByNameLength().
     * Сортировка по длине имени.
     */
    @Test
    public void whenSortByNameLengthThenResultIsSortedByNameLength() {
        User user1 = new User("Andrey", 31);
        User user2 = new User("Bob", 31);
        User user3 = new User("Halk", 65);
        list.add(user3);
        list.add(user1);
        list.add(user2);
        List<User> result = sortUser.sortNameLength(list);
        List<User> expect = new ArrayList<>();
        expect.add(user1);
        expect.add(user2);
        expect.add(user3);
        assertThat(result, is(expect));
    }

    /**
     * Тест whenSortByUserAgeThenResultIsSortedByAge().
     * Сортировка по возрасту.
     */
    @Test
    public void whenSortByUserAgeThenResultIsSortedByAge() {
        User user1 = new User("Andrey", 31);
        User user2 = new User("Bob", 31);
        User user3 = new User("Halk", 65);
        list.add(user3);
        list.add(user2);
        list.add(user1);
        List<User> result = sortUser.sortByAge(list);
        List<User> expect = new ArrayList<>();
        expect.add(user2);
        expect.add(user1);
        expect.add(user3);
        assertThat(result, is(expect));
    }

}
