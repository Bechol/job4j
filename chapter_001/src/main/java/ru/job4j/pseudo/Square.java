package ru.job4j.pseudo;
/**
 * Класс Square.
 * Реализует интерфейс Shape.
 * Формирует строку квадрата.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version 1.0
 * @since 23.05.2018
 */
public class Square implements Shape {
    /**
     * Для формирования фигуры используется класс StringBuilder и его метод append().
     * Метод pic используется только для формирования строки.
     * @return pic.toString() сформированная строка, описывающая фигуру квадрат.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("#####");
        pic.append("#   #");
        pic.append("#   #");
        pic.append("#   #");
        pic.append("#####");
        return pic.toString();
    }
}
