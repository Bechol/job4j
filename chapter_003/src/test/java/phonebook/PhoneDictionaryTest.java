package phonebook;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import java.util.List;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PhoneDictionaryTest {
    /**
     * Тест поиска по фрагменту.
     */
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Oleg", "Bech", "2224855", "Piter")
        );
        List<Person> persons = phones.find("55");
        assertThat(persons.iterator().next().getSurname(), is("Bech"));
    }
}
