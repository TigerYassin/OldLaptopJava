package com.company;

import calculator.Calculator;

import javax.swing.*;

public class Main {

    public static void main(String[] asdf) {

        Calculator myCalc = new Calculator();

        ImageIcon myImage = new ImageIcon("../smashicons.jpg");
        myCalc.setIconImage(myImage.getImage());
//        System.out.println(myCalc);
    }

}
