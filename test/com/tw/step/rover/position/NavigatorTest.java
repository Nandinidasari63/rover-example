package com.tw.step.rover.position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class NavigatorTest {
    @Test
    void shouldCreateSingletonNavigator() {
        assertSame(Navigator.create(), Navigator.create());
    }

    @Test
    void shouldFindLeftAndRightDirections() {
        Navigator navigator = Navigator.create();

        assertEquals(Direction.W, navigator.leftOf(Direction.N));
        assertEquals(Direction.E, navigator.rightOf(Direction.N));
    }

    @Test
    void shouldFindNextCoordinateForHeading() {
        Navigator navigator = Navigator.create();

        assertEquals(new Coordinate(3, 2), navigator.nextCoordinate(new Coordinate(2, 2), Direction.E));
    }
}
