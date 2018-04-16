package ru.job4j.loop;
/**
 * Вычисление факториала числа.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 12.04.2018
 * @version 1.0
 */
public class Factorial {
    //поля класса.
    private int result = 1;
    private int i;
    /**
     * Method run.
     * @param n число, для которого вычисляется факториал.
     */
    public int run(int n) {
            for (int i = result; i <= n; i++) {
                result *= i;
            }
        return result;
    }
}
