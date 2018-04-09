package ru.job4j.calculator;
/**
 * Класс,определяет сколько автомобиль проедет километров с учетом заправки.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 09.04.2018
 * @version 1.0
 */
public class Car {
    private double volume;
    /**
     * Method drive.
     * @param kilometer kilometers.
     * вычисляет сколько осталось километров
     */
    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
    }
    /**
     * Method fill.
     * вычисляет количество километров с учетом заправки.
     */
    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }
    /**
     * Method canDrive.
     * Проверяет, что в баке есть горючее.
     */
    public boolean canDrive() {
        boolean result = this.volume > 0;
        return result;
    }
    /**
     * Method gasInfo.
     * Выводит сообщение в консоль о количестве километров,которое можно проехать.
     */
    public void gasInfo() {
        System.out.println("I can drive " + this.volume + " kilometers.");
    }
}
