package ru.job4j.loop;
/**
 * Рисование шахматной доски.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 12.04.2018
 * @version 1.0
 */
public class Board {
    /**
     * Method paint.
     * @param width ширина доски.
     * @param height высота доски.
     * @return строка с шахматной доской.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }


}
