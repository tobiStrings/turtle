package com.sages.turtleGraphics.turtle.entity;

public class SketchPad {
    private int[][] floor = new int[20][20];

    public int[][] getFloor() {
        return floor;
    }

    public void setFloor(int[][] floor) {
        this.floor = floor;
    }
}
