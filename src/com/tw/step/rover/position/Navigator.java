package com.tw.step.rover.position;

import java.util.HashMap;
import java.util.Map;

public class Navigator {

    private static Navigator NAVIGATOR = null;
    private final HashMap<Direction, Direction> lefts;
    private final HashMap<Direction, Direction> rights;
    private HashMap<Direction, Coordinate> offsets;

    private Navigator() {
        offsets = new HashMap<>();
        offsets.put(Direction.NORTH, new Coordinate(0,1));
        offsets.put(Direction.EAST, new Coordinate(1,0));
        offsets.put(Direction.SOUTH, new Coordinate(0,-1));
        offsets.put(Direction.WEST, new Coordinate(-1,0));

        lefts = new HashMap<Direction, Direction>();
        lefts.put(Direction.NORTH, Direction.WEST);
        lefts.put(Direction.SOUTH, Direction.EAST);
        lefts.put(Direction.WEST, Direction.SOUTH);
        lefts.put(Direction.EAST, Direction.NORTH);

        rights = new HashMap<Direction, Direction>();
        for (Map.Entry<Direction, Direction> entry : lefts.entrySet()) {
            rights.put(entry.getValue(), entry.getKey());
        }
    }

    public Coordinate nextCoordinate(Coordinate coordinate, Direction heading) {
        return coordinate.add(offsets.get(heading));
    }

    public Direction leftOf(Direction direction) {
        return lefts.get(direction);
    }

    public Direction rightOf(Direction direction) {
        return rights.get(direction);
    }
    
    public Navigator create() {
        if(NAVIGATOR != null) return NAVIGATOR;
        NAVIGATOR = new Navigator();
        return NAVIGATOR;
    }
}
