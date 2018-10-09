package phonebook;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс PhoneDictionary.
 * Модель справочника.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    /**
     * Метод add.
     * Добавление пользователя в список.
     * @param person объект Person.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Метод find(String key).
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        return persons.stream().filter(
                person -> person.getAddress().contains(key) || person.getPhone().contains(key)
                || person.getSurname().contains(key) || person.getName()
                        .contains(key)).collect(Collectors.toList());
    }
}
