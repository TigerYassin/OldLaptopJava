package com.company;

import com.company.PushCounterPanel;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounter

{

//-----------------------------------------------------------------

// Creates and displays the main program frame.

//-----------------------------------------------------------------

    public static void main(String[] args)

    {


        //random Value
        JFrame frame = new JFrame("Push Counter (Random Val)");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PushCounterPanel panel = new PushCounterPanel();

        frame.getContentPane().add(panel);

        frame.pack();

        frame.setVisible(true);




        //Likes and Dislikes Counter
        JFrame frame1 = new JFrame("Like Counter");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CountLikes panel1 = new CountLikes();
        frame1.getContentPane().add(panel1);
        frame1.pack();
        frame1.setVisible(true);




        //Random number sorter
        JFrame frame2 = new JFrame("Sorter");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SortNumbers panel2 = new SortNumbers();
        frame2.getContentPane().add(panel2);
        frame2.pack();
        frame2.setVisible(true);



    }

}


