package ru.job4j.condition;
/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    //поля класса
    private int x;
    private int y;
    /**
     * Конструктор класса. Инициализация точки в системе координат
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Method distanceTo.
     * @param that значение первого числа.
     * @return значение по формуле.
     * вычисляет расстояние между двумя точками.
     */
    public double distanceTo(Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        Point a = this;
        // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
        // или для удоства мы создали новую переменню b и к ней присвоили переменную this.
        Point b = that;
        // Объявим переменные для вычисления
        int x1 = a.x;
        int y1 = a.y;
        int x2 = b.x;
        int y2 = b.y;
        // сделаем вывод на консоль.
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        return Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }
    /**
     * Main
     * @param args - args.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }

}
