package listtomap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class UserConvertTest {
    @Test
    public void whenUsersFromListToMap() {
        UserConvert map = new UserConvert();
        User firstUser = new User(1, "Oleg", "Piter");
        User secondUser = new User(2, "Petr", "Bryansk");
        List<User> users = Arrays.asList(firstUser, secondUser);
        Map<Integer, User> result = map.process(users);
        Map<Integer, User> expect = new HashMap<>();
        expect.put(firstUser.getId(), firstUser);
        expect.put(secondUser.getId(), secondUser);
        assertThat(result, is(expect));
    }
}
