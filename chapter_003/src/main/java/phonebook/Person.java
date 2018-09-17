package phonebook;

/**
 * Класс Person.
 * Шаблон для создания объекта - пользователь.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 17.09.2018
 * @version 1.0
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;
    /**
     * Конструктор класса.
     * @param name имя.
     * @param surname фамилия.
     * @param phone телефон.
     * @param address адрес.
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Геттер getName().
     * Возврат имени пользователя.
     * @return имя пользователя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер getSurname().
     * Возврат  фамилии пользователя.
     * @return фамилия пользователя.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Геттер getPhone().
     * Возврат телефона пользователя.
     * @return телефон пользователя.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Геттер getAddress().
     * Возврат адреса пользователя.
     * @return адрес пользователя.
     */
    public String getAddress() {
        return address;
    }
}
