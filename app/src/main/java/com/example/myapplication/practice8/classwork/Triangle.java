package com.example.myapplication.practice8.classwork;

public class Triangle extends Figure {
    public Triangle(int side) {
        super(side);
    }

    @Override
    public int getSquare() {
        double sqrTriangle = (Math.pow((double) getSide(), 2.0)*Math.sqrt(3))/4;
        return (int) sqrTriangle;
    }
}