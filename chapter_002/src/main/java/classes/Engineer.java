package classes;
/**
 * Класс инженер наследник от профессии.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Engineer extends Profession {
    public static void main(String[] args) {
        House house = new House();
        Engineer engineer = new Engineer();
        engineer.buildHouse(house);
    }
    /**
     * Инженер умеет строить дом.
     * @param house дом.
     */
    public void buildHouse(House house) {
    }
}
