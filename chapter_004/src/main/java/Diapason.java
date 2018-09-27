/**
 * @author Oleg Bech
 * @version 1.0
 * @e-mail oleg071984@gmail.com
 * @timestamp 27.09.2018, 19:23
 */
public class Diapason {
    /**
     * Внутренний функциональный интерфейс LinearFunction.
     */
    public interface LinearFunction {
        /**
         * Метод getLinear(int x, int b).
         * Возвращает значение линейной функции вида y = 2x + b.
         * @param x множитель.
         * @param b числовой коэффициент.
         * @return у значение линейной функции.
         */
        int getLinear(int x, int b);
    }

    /**
     * Внутренний функциональный интерфейс SquareFunction.
     */
    public interface SquareFunction {
        /**
         * Метод getSquare(int x, int a).
         * Возвращает значение квадратичной функции вида y = ax2 + bx + c.
         * Задается парметр а. Параметры b и c - вычисляются внутри метода.
         * @param x множитель.
         * @param a параметр.
         * @return у значение линейной функции.
         */
        int getSquare(int x, int a);
    }

    /**
     * Внутренний функциональный интерфейс LogFunction.
     */
    public interface LogFunction {
        /**
         * getLog(int x, int y).
         * Возвращает логарифм из y по основанию x.
         * @param x основание.
         * @param y число.
         * @return логарифм.
         */
        double getLog(int x, int y);
    }
}
