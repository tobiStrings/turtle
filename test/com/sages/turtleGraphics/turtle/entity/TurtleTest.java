package com.sages.turtleGraphics.turtle.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle ijapa;
    @BeforeEach
    void setUp() {
        ijapa = new Turtle("ijapa");
    }

    @AfterEach
    void tearDown() {
        ijapa = null;
    }

    @Test
    void changePenPositionFromUpToDown(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
    }
    @Test
    void changePenPositionFromDownToUp(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
    }

    @Test
    void turnRightFromEast(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH,ijapa.getDirection());
    }

    @Test
    void turnRightFromSouth(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST,ijapa.getDirection());
    }

    @Test
    void turnRightFromWest(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.NORTH,ijapa.getDirection());
    }

    @Test
    void turnRightFromNorth(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.NORTH,ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
    }

    @Test
    void turnLeftOnEast(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH,ijapa.getDirection());
    }

    @Test
    void turnLeftOnNorth(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.WEST,ijapa.getDirection());
    }

    @Test
    void turnLeftOnWest(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.WEST,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.SOUTH,ijapa.getDirection());
    }

    @Test
    void turnLeftOnSouth(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.WEST,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.SOUTH,ijapa.getDirection());
        ijapa.turnLeft();
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
    }

    @Test
    void moveForwadrfromEast(){
        assertEquals(BigDecimal.ZERO.intValue(),ijapa.getxCoordinate());
        assertEquals(BigDecimal.ZERO.intValue(),ijapa.getyCoordinate());
        ijapa.moveForward(12);
        assertEquals(11,ijapa.getxCoordinate());
        assertEquals(0,ijapa.getyCoordinate());
    }

    @Test
    void moveForwadFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        assertEquals(BigDecimal.ZERO.intValue(),ijapa.getxCoordinate());
        assertEquals(BigDecimal.ZERO.intValue(),ijapa.getyCoordinate());
        ijapa.moveForward(12);
        assertEquals(0,ijapa.getxCoordinate());
        assertEquals(11,ijapa.getyCoordinate());
    }

    @Test
    void moveForwadFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        ijapa.setxCoordinate(11);
        assertEquals(11,ijapa.getxCoordinate());
        assertEquals(BigDecimal.ZERO.intValue(),ijapa.getyCoordinate());
        ijapa.moveForward(12);
        assertEquals(0,ijapa.getxCoordinate());
        assertEquals(0,ijapa.getyCoordinate());
    }


    @Test
    void moveForwadFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.setyCoordinate(11);
        assertEquals(0,ijapa.getxCoordinate());
        assertEquals(11,ijapa.getyCoordinate());
        ijapa.moveForward(12);
        assertEquals(0,ijapa.getxCoordinate());
        assertEquals(0,ijapa.getyCoordinate());
    }

    @Test
    void moveForwadFromEastWithExccessStep(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.setxCoordinate(10);
        assertEquals(10,ijapa.getxCoordinate());
        assertEquals(BigDecimal.ZERO.intValue(),ijapa.getyCoordinate());
        ijapa.moveForward(12);
        assertEquals(10,ijapa.getxCoordinate());
        assertEquals(0,ijapa.getyCoordinate());
    }

}