package sort;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

 /**
 * Класс SortUser.
 * Методы сортировки.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class SortUser {
    /**
     * Метод sort.
     * Возвращает TreeSet пользователей, отсортированных по возастанию.
     * @param users
     * @return
     */
    public Set<User> sort (List<User> users) {
        return new TreeSet<User>(users);
    }

    /**
     * Метод sortByAge.
     * Сортирвка пользователей по возрастанию "возраста".
     * @param list
     * @return
     */
    public List<User> sortByAge(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return list;
    }
}
