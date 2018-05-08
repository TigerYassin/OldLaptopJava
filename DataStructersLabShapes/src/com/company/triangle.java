package com.company;

public class triangle implements Calculator{

    double leg1 = 0;
    double leg2 = 0;
    double leg3 = 0;
    @Override
    public double calcArea() {
        double p = (calcPerimeter()/2);
        return  Math.sqrt(p*(p-leg1)*(p-leg2)*(p-leg3));
    }

    //Perimeter
    @Override
    public double calcPerimeter() {

        return(this.leg1 + this.leg2 + this.leg3);
    }

    //Constructor
    public triangle(double leg1, double leg2, double leg3){
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.leg3 = leg3;
    }
}
