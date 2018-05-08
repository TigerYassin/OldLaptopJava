package com.company;


import javax.swing.*;
import java.awt.*;

public class IconPractice {
    IconPractice(){

        JSlider mySlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);


        JFrame f=new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");


        f.add(mySlider);
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(200,200);
        f.setVisible(true);
    }
}

