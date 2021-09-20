package com.sages.turtleGraphics.turtle.entity;

public class Turtle {
    private Pen pen;
    private int xCoordinate;
    private int yCoordinate;

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    private CardinalPoint direction;
    private String name;
    public Turtle(String name){
        pen = new Pen();
        pen.setPosition(PenPosition.UP);
        direction = CardinalPoint.EAST;
        this.name = name;
    }
    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public void changePenPosition(PenPosition penPosition){
        this.getPen().setPosition(penPosition);
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void turnRight(){
        switch(direction){
            case EAST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void turnLeft(){
        switch(direction){
            case EAST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void moveForward(int numberOfSteps){
        if(direction.equals(CardinalPoint.EAST)){
            xCoordinate += numberOfSteps-1;
        }else
        if(direction.equals(CardinalPoint.SOUTH)){
            yCoordinate += numberOfSteps-1;
        }else if (direction.equals(CardinalPoint.WEST)) {
            xCoordinate -= numberOfSteps-1;
        }else
            if(direction.equals(CardinalPoint.NORTH)){
                yCoordinate -= numberOfSteps-1;
            }
    }
}
