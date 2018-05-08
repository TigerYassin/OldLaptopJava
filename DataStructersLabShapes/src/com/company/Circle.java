package com.company;

public class Circle implements Calculator{

    double radius;

    @Override
    public double calcArea() {
        return(Math.PI * radius * radius);
    }

    @Override
    public double calcPerimeter() {
        return(2 * Math.PI * radius);
    }

    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }
}
