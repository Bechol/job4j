package ru.job4j.array;
/**
 * 5.5. Слова начинается с ....
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 12.04.2018
 * @version 1.0
 */
public class ArrayChar {
    private char[] data;
    /**
     * Конструктор класса. Создает массив символов из строки.
     * @param line строка.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;
            }
        }
        return result;
    }
}
