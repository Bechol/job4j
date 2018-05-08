package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        for (int row = 0; row < this.table.length; row++) {
            for (int cell = 0; cell < this.table.length - 1; cell++) {
                if (this.table[row][cell].hasMarkX() && this.table[row][cell + 1].hasMarkX()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        for (int row = 0; row < this.table.length; row++) {
            for (int cell = 0; cell < this.table.length - 1; cell++) {
                if (this.table[row][cell].hasMarkO() && this.table[row][cell + 1].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int row = 0; row < this.table.length; row++) {
            for (int cell = 0; cell < this.table.length; cell++) {
                if (!(this.table[row][cell].hasMarkX()) || !(this.table[row][cell].hasMarkO())) {
                    result = true;
                }
            }
        }
        return result;
    }
}
