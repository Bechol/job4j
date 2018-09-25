package CoffeeMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Класс CoffeeMachine.
 * Реализация метода выдачи сдачи из кофейного автомата.
 * Тестовое задание job4j #34741.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 25.09.2018
 * @version 1.0
 */
public class CoffeeMachine {
    /**
     * Переменная NULL_CASH_ARRAY.
     * Массив нулевой длины возвращается методом в случае если сдача 0.
     */
    private final static int[] NULL_CASH_ARRAY = new int[0];
    /**
     * Список resultCash.
     * Список содержащий монеты, выданные автоматом на сдачу.
     */
    private final ArrayList<Integer> resultCash = new ArrayList<>();
    /**
     * Метод int[] changes(int value, int price, ArrayList<Integer> coins).
     * Возвращает массив монет сдачи.
     * @param value сумма, отправленная в кофейную машину.
     * @param price цена кофе.
     * @param coins список имеющихся в автомате монет.
     * @return массив монет в сдаче.
     */
    public int[] changes(int value, int price, ArrayList<Integer> coins) {
        Collections.reverse(coins);
        int change = value - price;
        if (change > 0) {
            for (Integer coin : coins) {
                while (change >= coin) {
                    change -= coin;
                    resultCash.add(coin);
                }
            }
        } else {
            return NULL_CASH_ARRAY;
        }
        return buildIntArray(resultCash);
    }

    /**
     * Метод int[] buildIntArray(List<Integer> resultCash).
     * @param resultCash расчетный список монет.
     * @return результирующий массив типа int[].
     */
    private static int[] buildIntArray(List<Integer> resultCash) {
        int i = 0;
        int[] resultChanges = new int[resultCash.size()];
        for (int coin : resultCash){
            resultChanges[i++] = coin;
        }
        return resultChanges;
    }


}