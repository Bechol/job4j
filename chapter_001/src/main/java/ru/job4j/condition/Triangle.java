package ru.job4j.condition;

public class Triangle {
    //поля класса.
    private Point a;
    private Point b;
    private Point c;

    //конструктор класса.
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }
    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        //начальное значение площади.
        double rsl = -1;
        //длина стороны ab.
        double ab = this.a.distanceTo(b);
        //длина стороны ac.
        double ac = this.a.distanceTo(c);
        //длина стороны bc.
        double bc = this.b.distanceTo(c);
        //вычисление полупериметра.
        double p = this.period(ab, ac, bc);
        //проверка возможности построения треугольника.
        if (this.exist(ab, ac, bc)) {
            //формула Герона для вычисления площади треугольника.
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
            System.out.println("Площадь треугольника: " + rsl);
        } else {
            System.out.println("Невозможно построить треугольник!");
        }
        return rsl;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Каждая сторона треугольника меньше суммы двух других сторон.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab < ac + bc) & (ac < ab + bc) & (bc < ab + ac);
    }
}