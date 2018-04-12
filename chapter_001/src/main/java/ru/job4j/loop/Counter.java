package ru.job4j.loop;

public class Counter {
    //поле класса;
private int summ;
    /**
     * Method add.
     * @param start начало диапазона.
     * @param finish конец диапазона.
     * реализация с помощью цикла while.
     */
    public int add(int start, int finish) {
        while (start <= finish) {
            if (start % 2 == 0) {
                summ += start;
            }
            start++;
        }
        return summ;
    }
    /**
     * Method addFor.
     * @param start начало диапазона.
     * @param finish конец диапазона.
     * реализация с помощью цикла for.
     */
    public int addFor(int start, int finish) {
        int sum, i;
        for (sum = 0, i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
