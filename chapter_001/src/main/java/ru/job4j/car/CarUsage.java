package ru.job4j.car;
/**
 * Класс выводит в консоль информацию о воможности поездки к бабушке.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 03.04.2018
 * @version 1.0
 */
public class CarUsage {
    /**
     * Main
     * @param args - args.
     */
    public static void main(String[] args) {
        Car audi = new Car();
        boolean driving = audi.canDrive();
            System.out.println("Can you drive? : " + driving);
            System.out.println("I am going to gas station.");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
            System.out.println("Can you drive now? : " + driving);
            System.out.println("Now I am going to my granny.");
            System.out.println("It's 10 kilometers from here");
        int distance = 10;
        audi.drive(distance);
        audi.gasInfo();
    }
}
