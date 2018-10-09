package sort;

import java.util.*;
import java.util.stream.Collectors;

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
     * Натуральная сортировка списка.
     * @param users список пользователей.
     * @return отсортированный сет.
     */
    public Set<User> sort(List<User> users) {
        return users.stream().sorted().collect(Collectors.toSet());
    }

    /**
     * Метод sortByAge.
     * Сортирвка пользователей по возрасту по возрастанию.
     * @param list список пользвателей.
     * @return отсортированный список.
     */
    public List<User> sortByAge(List<User> list) {
        return list.stream().sorted(
                Comparator.comparingInt(User::getAge)
        ).collect(Collectors.toList());
    }

     /**
      * Метод sortByAllFields.
      * Cортировка по обоим полям, сначала сортировка по имени в лексикографическом порядке, потом по возрасту.
      * @param list  список пользвателей.
      * @return отсортированный список.
      */
     public List<User> sortByAllFields(List<User> list) {
         return list.stream().sorted(
                 Comparator.comparing(User::getName).thenComparing(User::getAge)
         ).collect(Collectors.toList());
     }

    /**
     * Метод sortNameLength.
     * Cортировка по длине имени.
     * @param list  список пользвателей.
     * @return отсортированный список.
     */
    public List<User> sortNameLength(List<User> list) {
        return list.stream().sorted(
                Comparator.comparing(User::getAge)
        ).collect(Collectors.toList());
    }
}
