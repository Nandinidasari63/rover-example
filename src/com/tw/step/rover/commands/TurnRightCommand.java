package com.tw.step.rover.commands;

import com.tw.step.rover.boundary.Boundary;
import com.tw.step.rover.position.Navigator;
import com.tw.step.rover.rover.Rover;

public class TurnRightCommand implements RoverCommand {
    private final Navigator navigator;
    private final Boundary boundary;

    public TurnRightCommand(Navigator navigator, Boundary boundary) {
        this.navigator = navigator;
        this.boundary = boundary;
    }

    @Override
    public void execute(Rover rover) {
        rover.turnRight(navigator, boundary);
    }
}
