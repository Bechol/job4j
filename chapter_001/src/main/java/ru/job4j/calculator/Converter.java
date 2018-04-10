package ru.job4j.calculator;
/**
 * Класс конвертации валют.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 10.04.2018
 * @version 1.0
 */
public class Converter {
    private final int cursUsd = 60;
    private final int cursEur = 70;
    /**
     * Method rurToUsd.
     * @param rur количество рублей для конвертации.
     * конвертация рублей в доллары.
     */
    public int rurToUsd(int rur) {
        int usd;
        usd = rur / cursUsd;
        return usd;
    }
    /**
     * Method usdToRur.
     * @param usd количество долларов для конвертации.
     * конвертация долларов в рубли.
     */
    public int usdToRur(int usd) {
        int rur;
        rur = usd * cursUsd;
        return rur;
    }

    /**
     * Method rurToEur.
     * @param rur количество рублей для конвертации.
     * конвертация рублей в евро.
     */
    public int rurToEur(int rur) {
        int eur;
        eur = rur / cursEur;
        return eur;
    }
    /**
     * Method eurToRur.
     * @param eur количество евро для конвертации.
     * конвертация долларов в рубли.
     */
    public int eurToRur(int eur) {
        int rur;
        rur = eur * cursEur;
        return rur;
    }
}
