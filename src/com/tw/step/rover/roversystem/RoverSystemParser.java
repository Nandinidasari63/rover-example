package com.tw.step.rover.roversystem;

public class RoverSystemParser {
    private final RoverSystemScanner scanner;

    public RoverSystemParser(RoverSystemScanner scanner) {
        this.scanner = scanner;
    }

    public void parse() {
        int x = scanNumber();
        int y = scanNumber();

        System.out.println(x + " " + y);
    }

    private int scanNumber() {
        return Integer.parseInt(scanner.consume());
    }
}
