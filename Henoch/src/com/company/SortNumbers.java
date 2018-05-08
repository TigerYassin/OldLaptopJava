package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SortNumbers extends JPanel{

    //Creating Buttons and labels
    JButton generate;
    JButton sort;

    JLabel label;


    ////////CONSTRUCTOR
    public SortNumbers(){


        generate = new JButton("Generate");
        sort = new JButton("Sort");
        label = new JLabel();

        label.setText("0000000000");

        generate.addActionListener(e -> {


            label.setText("");

            for (int x = 0; x < 10; x++){
                int rand = new Random().nextInt(10);


                    label.setText(label.getText() + rand);

            }


        });


        sort.addActionListener(e -> {

            String[] myString = label.getText().split("");

            label.setText("");
            System.out.println("Original array " + Arrays.toString(myString)); //Prints the array unsorted
            ArrayList<Integer> myNum = new ArrayList();

            for(String string : myString) {
                myNum.add(Integer.parseInt(string));
            }
            //Sorting
            Collections.sort(myNum);
            for (int x : myNum){

                label.setText(label.getText() + x);
            }
            System.out.println("Sorted Array " + myNum); //Prints the array SORTED

        });

        add(generate);
        add(sort);
        add(label);
        setBackground(Color.GREEN);
        setPreferredSize(new Dimension(300, 140));

    }


}
