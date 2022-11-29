package com.example.myapplication.practice8.classwork;

public class Circle extends Figure{
    public Circle(int side) {
        super(side);
    }

    @Override
    public int getSquare() {
        double sqrCircle = 3.14 * Math.pow(getSide(),2.0);
                return (int) sqrCircle;
    }
}
