package ru.job4j.pseudo;
/**
 * Класс Paint.
 * Печать псевдокартины (квадрата или треугольника) в консоли.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version 1.0
 * @since 23.05.2018
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
