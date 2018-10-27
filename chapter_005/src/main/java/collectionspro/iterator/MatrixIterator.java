package collectionspro.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс MatrixIterator.
 * Реализация итератора 2D матрицы.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 27.10.2018.
 * @version 1.0.
 */
public class MatrixIterator implements Iterator<Integer> {

    private int[][] matrix;
    private int rowIndex = 0;
    private int columnIndex = 0;

    /**
     * Конструктор класса.
     * @param matrix матрица.
     */
    public MatrixIterator(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Метод hasNext().
     * Проверяет наличие следующего элемента матрицы.
     * Проверки:
     * Строка 35. Если индекс строки больше общего кол-ва строк, то false.
     * Строка 39. Если индекс строки меньше кол-ва строк, уменьшенного на 1 (нумерация с 0)
     * или индекс колонки меньше общего кол-ва колонок, то true.
     * @return true/false.
     */
    public boolean hasNext() {
        if (rowIndex > matrix.length) {
            return false;
        }
        return rowIndex < matrix.length - 1 || columnIndex < matrix[rowIndex].length;
    }

    /**
     * Метод next().
     * Проход по матрице и вывод ее элементов.
     * @return элементы матрицы.
     */
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (columnIndex >= matrix[rowIndex].length) {
            rowIndex++;
            columnIndex = 0;
        }
        return matrix[rowIndex][columnIndex++];
    }

    public void remove() {
        throw new UnsupportedOperationException("Операция удаления не предусмотрена.");
    }
}
