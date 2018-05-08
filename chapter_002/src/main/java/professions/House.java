package professions;
/**
 * Класс дом.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class House {
    public String houseType;
    /**
     * Дефолтный конструктор.
     */
    public House() {
    }
    /**
     * Метод House.
     * Конструктор класса.
     */
    public House(String houseType) {
        this.houseType = houseType;
    }
    /**
     * Метод getHouseType.
     * Возвращает тип дома.
     */
    public String getHouseType() {
        return this.houseType;
    }
}
