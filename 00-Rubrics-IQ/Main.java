package org.example;

import org.example.models.RubiksCube;

public class Main {
    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube(3);
        System.out.println(cube.isSolved());
        cube.rotateFace("white", "clockwise");
        System.out.println(cube.isSolved());
    }
}

