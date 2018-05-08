package professions;
/**
 * Класс инженер наследник от профессии.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 08.05.2018
 * @version 1.0
 */
public class Engineer extends Profession {
/**
 * Метод build. Инженер строит дом.
 * @param house объект дом.
 */
public String build(House house) {
    Profession engineer = new Profession("Сидоров А.В.", "Строитель");
    return engineer.getProfession() + " " + engineer.getName() + " строит " + house.getHouseType();
}
}
