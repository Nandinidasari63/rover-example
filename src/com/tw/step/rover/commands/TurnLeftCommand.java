package com.tw.step.rover.commands;

import com.tw.step.rover.boundary.Boundary;
import com.tw.step.rover.position.Navigator;
import com.tw.step.rover.rover.Rover;

public class TurnLeftCommand implements RoverCommand {
    private final Navigator navigator;
    private final Boundary boundary;

    public TurnLeftCommand(Navigator navigator, Boundary boundary) {
        this.navigator = navigator;
        this.boundary = boundary;
    }

    public void execute(Rover rover) {
        rover.turnLeft(this.navigator, this.boundary);
    }
}
