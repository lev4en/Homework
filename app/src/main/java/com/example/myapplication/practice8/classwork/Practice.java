package com.example.myapplication.practice8.classwork;

public class Practice {
    public static void main(String[] args) {
        Book book = new Book();
        book.print();

        Walkable someObj = new Walkable() {
            @Override
            public void walk() {
                System.out.println("Walk");
            }
        };
        Figure triangle = new Triangle(3);
        System.out.println(triangle.getSquare());
        Figure circle = new Circle(3);
        System.out.println(circle.getSquare());
        Figure rectangle = new Rectangle(9,2);
        System.out.println(rectangle.getSquare());

    }
}