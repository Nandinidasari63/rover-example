package com.tw.step.rover.position;

public enum Direction {
    NORTH("N"),EAST("E"),SOUTH("S"),WEST("W");

    private final String dirString;

    Direction(String dirString) {
        this.dirString = dirString;
    }
}
