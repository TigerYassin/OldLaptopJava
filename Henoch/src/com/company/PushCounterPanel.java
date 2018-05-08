package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PushCounterPanel extends JPanel

{

    /*
    Setting the variables
     */
    private int count;
    private JButton push;




    private JLabel label;

//-----------------------------------------------------------------

// Constructor: Sets up the GUI.

//-----------------------------------------------------------------

    public PushCounterPanel()

    {

        count = 0;


        push = new JButton("Push Me!");

        label = new JLabel();

        push.addActionListener(new ButtonListener());
        add(push);



        /*
        add labels to panel
         */
        add(label);

        setBackground(Color.cyan);

        setPreferredSize(new Dimension(300, 140));

    }

//*****************************************************************

// Represents a listener for button push (action) events.

//*****************************************************************

    private class ButtonListener implements ActionListener

    {

        public void actionPerformed(ActionEvent event)

        {

            count++;

            label.setText("Pushes: " + (new Random().nextInt(50)+1));
        }

    }

}
