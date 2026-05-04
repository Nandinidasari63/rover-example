package com.tw.step.rover.roversystem;

public class Main {
    static void main() {
        String text = """
1 5 N
LFFRFLFFFR                
                """;

        RoverSystemScanner scanner = RoverSystemScanner.from(text);
        RoverSystemParser roverSystemParser = new RoverSystemParser(scanner);
        roverSystemParser.parse();
    }
}
