package com.company.shapes;

public class Circle extends Shape{

    double radius;

    public Circle(){
        super();
        this.name = "Circle";
        this.radius = 10;
    };
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("()()()()()()()()()()");
        super.display();
        System.out.println("()()()()()()()()()()");
    }


    public void area(){
        this.area =  (Math.PI * radius * radius);
    }

    public void perimeter(){
        this.perimeter = (2*Math.PI*radius);
    }


}
