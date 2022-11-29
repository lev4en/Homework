package com.example.myapplication.practice8.classwork;

public class Rectangle extends Triangle{
    private final int side2;

    public Rectangle(int side,int side2) {
        super(side);
        this.side2 = side2;
    }

    @Override
    public int getSquare() {
        double sqrRectangle = getSide()*side2;
        return(int)sqrRectangle;
    }
}
