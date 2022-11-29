package com.example.myapplication.practice8.classwork;

abstract class Figure implements Squareble{
    private int side;

   public Figure(int side) {
        this.side = side;


    }
    public int getSide(){
       return side;
    }
}
