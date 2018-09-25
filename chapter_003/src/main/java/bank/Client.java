package bank;

import java.util.Objects;

/**
 * Класс User.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 19.09.2018
 * @version 1.0
 */
class Client implements Comparable<Client> {
    private String name;
    private String passport;

    /**
     * Конструктор класса.
     * @param name имя.
     * @param passport пасспорт.
     */
    public Client(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client user = (Client) o;
        return Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", passport='" + passport + '\'' + '}';
    }

    @Override
    public int compareTo(Client o) {
        return this.passport.compareTo(o.passport);
    }
}
