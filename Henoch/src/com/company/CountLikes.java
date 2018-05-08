package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountLikes extends JPanel{


    private int likeCount;
    private JButton pushLike = new JButton("Like");

    private int dislikeCount = 0;
    private JButton pushDislike = new JButton("Dislike");

    private JButton reset = new JButton("Reset");


    private JLabel label;
    private JLabel label1;


    public CountLikes() {

        likeCount = 0;

        label = new JLabel();
        label1 = new JLabel();




        /*
        creating the action listeners using anonymous classes for ease of code
         */

        pushLike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                likeCount++;
                label.setText("Like: " + likeCount);
            }
        });


        pushDislike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dislikeCount++;
                label1.setText("Dislike: " + dislikeCount);
            }
        });


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                likeCount = 0;
                dislikeCount = 0;
                label.setText("Like: " + likeCount);
                label1.setText("Dislike: " + dislikeCount);


            }
        });


        /*
        add buttons to panel
         */
        add(pushLike);
        add(pushDislike);
        add(reset);

        /*
        add labels to panel
         */
        add(label);
        add(label1);

        setBackground(Color.RED);

        setPreferredSize(new Dimension(300, 140));





    }
}
