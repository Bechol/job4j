package ru.job4j.calculator;
/**
 * Класс реализует простейшие арифметические операции над двумя числами, типа double.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 10.04.2018
 * @version 1.0
 */
public class Calculator {
    //внутреннее поле.
    private double result;
    /**
     * Method add.
     * @param first значение первого числа.
     * @param second значение второго числа.
     * вычисляет сумму first и second и записывает в this.result.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract.
     * @param first значение первого числа.
     * @param second значение второго числа.
     * вычисляет разницу first и second и записывает в this.result.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method div.
     * @param first значение первого числа.
     * @param second значение второго числа.
     * вычисляет результат деления first на second и записывает в this.result.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method multiple.
     * @param first значение первого числа.
     * @param second значение второго числа.
     * вычисляет произведение first и second и записывает в this.result.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Method getResult.
     * возвращает значение this.result.
     */
    public double getResult() {
        return this.result;
    }

}
