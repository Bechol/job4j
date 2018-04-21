package ru.job4j.array;
/**
 * Двухмерный массив. Таблица умножения.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 21.04.2018
 * @version 1.0
 */
public class Matrix {
    /**
     * Method multiple.
     * @param size размер таблицы умножения.
     * @return таблица умножения.
     */
    public int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Matrix a = new Matrix();
        int size = 9;
        int[][] test = a.multiple(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(test[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
