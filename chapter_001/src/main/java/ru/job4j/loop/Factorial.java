package ru.job4j.loop;
/**
 * Вычисление факториала числа.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 12.04.2018
 * @version 1.0
 */
public class Factorial {
    //поля класса.
    private int result;
    private int i;
    /**
     * Method run.
     * @param n число, для которого вычисляется факториал.
     */
    public int run(int n) {
        if (n == 0) {
            result = 1;
        } else {
            for (result = 1, i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
