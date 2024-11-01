package org.example.models;

import java.util.*;

class Face {
    String color;
    String[][] grid;

    public Face(String color, int n) {
        this.color = color;
        this.grid = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = color;
            }
        }
    }

    public void rotateClockwise() {
        int n = grid.length;
        String[][] newGrid = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newGrid[j][n - 1 - i] = grid[i][j];
            }
        }
        grid = newGrid;
    }

    public void rotateCounterClockwise() {
        int n = grid.length;
        String[][] newGrid = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newGrid[n - 1 - j][i] = grid[i][j];
            }
        }
        grid = newGrid;
    }
}



