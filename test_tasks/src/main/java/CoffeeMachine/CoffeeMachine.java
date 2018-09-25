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
     * Метод int[] changes(int value, int price, ArrayList<Integer> monets).
     * Возвращает массив монет сдачи.
     * @param value сумма, отправленная в кофейную машину.
     * @param price цена кофе.
     * @param monets список имеющихся в автомате монет.
     * @return массив монет в сдаче.
     */
    public int[] changes(int value, int price, ArrayList<Integer> monets) {
        Collections.reverse(monets);
        int change = value - price;
        if (change > 0) {
            for (Integer monet : monets) {
                while (change >= monet) {
                    change -= monet;
                    resultCash.add(monet);
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
        for (int monet : resultCash){
            resultChanges[i++] = monet;
        }
        return resultChanges;
    }


}