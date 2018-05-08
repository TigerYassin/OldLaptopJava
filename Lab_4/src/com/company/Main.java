package com.company;
import com.company.shapes.Circle;
import com.company.shapes.Shape;


public class Main {

    public static void main(String[] args) {

        Shape myShape = new Shape();
        myShape.display();

        Shape newShape = new Shape("Yassin");
        newShape.display();


        Circle myCircle = new Circle();
        myCircle.display();



        myCircle.area();
        myCircle.perimeter();
        myCircle.display();

    }
}
