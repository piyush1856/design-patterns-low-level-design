package org.example.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RubiksCube {
    int n;
    Map<String, Face> faces;

    public RubiksCube(int n) {
        this.n = n;
        this.faces = new HashMap<>();
        String[] colors = {"white", "yellow", "red", "orange", "blue", "green"};
        for (String color : colors) {
            faces.put(color, new Face(color, n));
        }
        randomizeCube();
    }

    public void rotateFace(String face, String direction) {
        if (direction.equals("clockwise")) {
            faces.get(face).rotateClockwise();
        } else if (direction.equals("counterclockwise")) {
            faces.get(face).rotateCounterClockwise();
        }
        updateAdjacentFaces(face, direction);
    }

    private void updateAdjacentFaces(String face, String direction) {
        int n = this.n;
        String[] temp = new String[n];

        String[][] adjacent = new String[4][2];
        switch (face) {
            case "white":
                adjacent = new String[][]{{"blue", "top"}, {"red", "top"}, {"green", "top"}, {"orange", "top"}};
                break;
            case "yellow":
                adjacent = new String[][]{{"blue", "bottom"}, {"red", "bottom"}, {"green", "bottom"}, {"orange", "bottom"}};
                break;
            case "red":
                adjacent = new String[][]{{"white", "bottom"}, {"green", "left"}, {"yellow", "top"}, {"blue", "right"}};
                break;
            case "orange":
                adjacent = new String[][]{{"white", "top"}, {"green", "right"}, {"yellow", "bottom"}, {"blue", "left"}};
                break;
            case "blue":
                adjacent = new String[][]{{"white", "left"}, {"red", "left"}, {"yellow", "left"}, {"orange", "right"}};
                break;
            case "green":
                adjacent = new String[][]{{"white", "right"}, {"red", "right"}, {"yellow", "right"}, {"orange", "left"}};
                break;
        }

        if (direction.equals("clockwise")) {
            for (int i = 0; i < 4; i++) {
                String fromFace = adjacent[i][0];
                String fromEdge = adjacent[i][1];
                String toFace = adjacent[(i + 1) % 4][0];
                String toEdge = adjacent[(i + 1) % 4][1];
                copyEdge(fromFace, fromEdge, temp);
                setEdge(toFace, toEdge, temp);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                String fromFace = adjacent[(i + 1) % 4][0];
                String fromEdge = adjacent[(i + 1) % 4][1];
                String toFace = adjacent[i][0];
                String toEdge = adjacent[i][1];
                copyEdge(fromFace, fromEdge, temp);
                setEdge(toFace, toEdge, temp);
            }
        }
    }

    private void copyEdge(String face, String edge, String[] buffer) {
        Face f = faces.get(face);
        for (int i = 0; i < n; i++) {
            switch (edge) {
                case "top":
                    buffer[i] = f.grid[0][i];
                    break;
                case "bottom":
                    buffer[i] = f.grid[n - 1][i];
                    break;
                case "left":
                    buffer[i] = f.grid[i][0];
                    break;
                case "right":
                    buffer[i] = f.grid[i][n - 1];
                    break;
            }
        }
    }

    private void setEdge(String face, String edge, String[] buffer) {
        Face f = faces.get(face);
        for (int i = 0; i < n; i++) {
            switch (edge) {
                case "top":
                    f.grid[0][i] = buffer[i];
                    break;
                case "bottom":
                    f.grid[n - 1][i] = buffer[i];
                    break;
                case "left":
                    f.grid[i][0] = buffer[i];
                    break;
                case "right":
                    f.grid[i][n - 1] = buffer[i];
                    break;
            }
        }
    }

    public boolean isSolved() {
        for (Face face : faces.values()) {
            String color = face.color;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!face.grid[i][j].equals(color)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void randomizeCube() {
        Random random = new Random();
        String[] facesArray = {"white", "yellow", "red", "orange", "blue", "green"};
        String[] directions = {"clockwise", "counterclockwise"};
        for (int i = 0; i < 100; i++) {
            String face = facesArray[random.nextInt(6)];
            String direction = directions[random.nextInt(2)];
            rotateFace(face, direction);
        }
    }


}
