package sort;

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
    @Test
    public void whenThreeUsersWithDifferenAge() {
        User middleUser = new User("Andrey", 31);
        User urgentUser = new User("Sergey", 24);
        User lowerUser = new User("Oleg", 65);
        list.add(middleUser);
        list.add(urgentUser);
        list.add(lowerUser);
        Set<User> result = sortUser.sort(list);
        Set<User> expect = new LinkedHashSet<>();
        expect.add(urgentUser);
        expect.add(middleUser);
        expect.add(lowerUser);
        assertThat(result, is(expect));
    }

}
