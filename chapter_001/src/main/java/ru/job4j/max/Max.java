package ru.job4j.max;
/**
 * Класс определяет  и возвращает максимальное из двух чисел.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 09.04.2018
 * @version 1.0
 */
public class Max {
    /**
     * Method maxInt.
     * @param first первое число.
     * @param second второе число.
     * @return максимальное число из двух.
     */
    public int maxInt(int first, int second) {
        return first > second ? first : second;
    }

    public int maxIntFromThree(int first, int second, int third) {
        int temp = this.maxInt(first, second);
        return this.maxInt(temp, third);
    }
}

