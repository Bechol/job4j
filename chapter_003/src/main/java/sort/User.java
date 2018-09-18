package sort;

/**
 * Класс User.
 * Шаблон для создания объекта - пользователя.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class User implements Comparable<User> {
    private String name;



    private int age;

    /**
     * Метод toString().
     * Вывод информации в консоль.
     * @return
     */
    @Override
    public String toString() {
        return "User{"
                + "name='"
                + name + '\''
                + ", age=" + age + '}';
    }

    /**
     * Конструктор класса.
     * @param name имя.
     * @param age возраст.
     */
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод compareTo().
     * Используется для сортировки.
     * @param o
     * @return
     */
    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }

    /**
     * Геттер getAge().
     * Вывовод возраста пользователя.
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Геттер getName().
     * Вывовод имени пользователя.
     * @return имя пользователя.
     */
    public String getName() {
        return name;
    }
}
