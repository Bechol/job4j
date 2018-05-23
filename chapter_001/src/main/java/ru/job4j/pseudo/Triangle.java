package ru.job4j.pseudo;

/**
 * Класс Triangle.
 * Реализует интерфейс Shape.
 * Формирует строку треугольника.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version 1.0
 * @since 23.05.2018
 */
public class Triangle implements Shape {
    /**
     * Для формирования фигуры используется класс StringBuilder и его метод append().
     * Метод pic используется только для формирования строки.
     * @return pic.toString() сформированная строка, описывающая фигуру треугольник.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("    *    ");
        pic.append("   ***   ");
        pic.append("  *****  ");
        pic.append(" ******* ");
        pic.append("*********");
        return pic.toString();
    }
}
