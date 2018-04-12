package ru.job4j.calculator;
/**
 * Класс конвертации валют.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 10.04.2018
 * @version 1.0
 */
public class Converter {
    private int cursUsd = 60;
    private int cursEur = 70;
    /**
     * Method rurToUsd.
     * @param rur количество рублей для конвертации.
     * конвертация рублей в доллары.
     */
    public int rurToUsd(int rur) {
        return rur / cursUsd;
    }
    /**
     * Method usdToRur.
     * @param usd количество долларов для конвертации.
     * конвертация долларов в рубли.
     */
    public int usdToRur(int usd) {
        return usd * cursUsd;
    }

    /**
     * Method rurToEur.
     * @param rur количество рублей для конвертации.
     * конвертация рублей в евро.
     */
    public int rurToEur(int rur) {
        return rur / cursEur;
    }
    /**
     * Method eurToRur.
     * @param eur количество евро для конвертации.
     * конвертация долларов в рубли.
     */
    public int eurToRur(int eur) {
        return eur * cursEur;
    }
}
