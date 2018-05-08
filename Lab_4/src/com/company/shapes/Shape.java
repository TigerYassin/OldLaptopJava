package com.company.shapes;

public class Shape {


    String name;
    double area;
    double perimeter;


    public Shape(){

        name = "NA";
        area = 0;
        perimeter = 0;
    }

    public Shape(String name){
        this.name = name;
        area = 0;
        perimeter = 0;
    }


    public void display() {
        System.out.println("Name: \t" + name);
        System.out.println("Area: \t" + area);
        System.out.println("Perimeter: \t" + perimeter);
    }



}
