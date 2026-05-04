package com.tw.step.rover.roversystem;

public class RoverSystemScanner {
    private final String[] tokens;
    private int currentIndex;

    private RoverSystemScanner(String[] tokens) {
        this.tokens = tokens;
        this.currentIndex = 0;
    }

    public String peek() {
        if(this.isDone()) return null;
        return this.tokens[this.currentIndex];
    }

    private boolean isDone() {
        return this.currentIndex >= this.tokens.length;
    }

    public String consume() {
        String token = this.peek();
        if(this.currentIndex < this.tokens.length) {
            this.currentIndex++;
        }
        return token;
    }

    public static RoverSystemScanner from(String input) {
        String[] tokens = input.split("[\n\t ]+");
        return new RoverSystemScanner(tokens);
    }
}
