package com.company;

public class Main {

    public static void main(String[] args) {

        //Triangle
        triangle myTraingle = new triangle(18,24,30);
        System.out.println(myTraingle.calcArea());
        System.out.println(myTraingle.calcPerimeter());


        //Circle
        Circle myCircle = new Circle(5);
        System.out.println(myCircle.calcArea());
        System.out.println(myCircle.calcPerimeter());

    }
}
