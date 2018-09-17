package list2map;

/**
 * Класс User.
 * Шаблон для создания объекта - пользователь.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class User {
    private int id;
    private String name;
    private String city;

    /**
     * Конструктор класса.
     * @param id индетификатор.
     * @param name имя.
     * @param city город.
     */
    public User(int id, String name, String city) {

        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Геттер getId().
     * Возврат индетификатора.
     * @return индетификатор.
     */
    public int getId() {
        return id;
    }

    /**
     * Геттер getName().
     * Возврат имени.
     * @return имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер getCity().
     * Возврат города.
     * @return город.
     */
    public String getCity() {
        return city;
    }
}
