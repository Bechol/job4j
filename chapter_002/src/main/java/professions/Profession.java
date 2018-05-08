package professions;
/**
 * Класс Профессия.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Profession {
    public String name;
    public String profession;
    /**
     * Дефолтный конструктор.
     */
    public Profession() {
    }
    /**
     * Метод Profession.
     * Конструктор класса.
     */
    public Profession(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }
    /**
     * Метод getName.
     * Возвращает имя.
     */
    public String getName() {
        return name;
    }
    /**
     * Метод getProfession.
     * Возвращает профессию.
     */
    public String getProfession() {
        return profession;
    }
}
