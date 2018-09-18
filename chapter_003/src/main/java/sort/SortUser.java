package sort;

import java.util.*;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

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
     * @param users список пользователей.
     * @return
     */
    public Set<User> sort (List<User> users) {
        return new TreeSet<User>(users);
    }

    /**
     * Метод sortByAge.
     * Сортирвка пользователей по возрастанию "возраста".
     * @param list список пользвателей.
     * @return отсортированный список.
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

     /**
      * Метод sortByAllFields.
      * Cортировка по обоим полям, сначала сортировка по имени в лексикографическом порядке, потом по возрасту.
      * @param list  список пользвателей.
      * @return отсортированный список.
      */
     public List<User> sortByAllFields(List<User> list) {
         list.sort(new Comparator<User>() {
             @Override
             public int compare(User o1, User o2) {
                 int rst = o1.getName().compareTo(o2.getName());
                 return rst != 0 ? rst : Integer.compare(o1.getAge(), o2.getAge());
             }
         });
         return list;
     }

    /**
     * Метод sortNameLength.
     * Cортировка по длине имени.
     * @param list  список пользвателей.
     * @return отсортированный список.
     */
    public List<User> sortNameLength(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getName().length(),
                        o2.getName().length());
            }
        });
        return list;
    }

}
