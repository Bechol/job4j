package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = true;
        for (int row = 0; row < this.table.length; row++) {
            result = true;
            for (int cell = 0; cell < this.table.length - 1; cell++) {
                if (!(this.table[row][cell].hasMarkX() && this.table[row][cell + 1].hasMarkX())) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = true;
        for (int row = 0; row < this.table.length; row++) {
            result = true;
            for (int cell = 0; cell < this.table.length - 1; cell++) {
                if (!(this.table[row][cell].hasMarkO() && this.table[row][cell + 1].hasMarkO())) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
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
