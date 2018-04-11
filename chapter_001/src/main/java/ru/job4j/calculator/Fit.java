package ru.job4j.calculator;
/**
 * Расчет идеального веса для мужчин и женщин.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 10.04.2018
 * @version 1.0
 */
public class Fit {
    /**
     * Method manWeight. Расчет идеального веса для мужщины.
     * Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100.0) * 1.15;
        //double iManWeight = (height - 100.0) * 1.15;
        //return iManWeight;
    }
    /**
     * Method womanWeight. Расчет идеального веса для женщины.
     * Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110.0) * 1.15;
        //double iWomanWeight = (height - 110.0) * 1.15;
        //return iWomanWeight;
    }
}
