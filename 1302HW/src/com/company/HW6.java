package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class HW6 extends JFrame{

    JTextArea text_Area = new JTextArea(3,5);
    JTextArea tex_Area2 = new JTextArea(4,5);
    JPanel panel = new JPanel();
    JButton load = new JButton("Load from File");
    JButton save = new JButton("Save to File");
    File file = new File("file.txt");
    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    BufferedReader reader = new BufferedReader(new FileReader(file));




    private void showFrame() {
        this.setSize(250, 340);
        this.setTitle("Yassin Assignment");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void addAllButtons(){
        this.add(text_Area, BorderLayout.NORTH);

        load.setSize(20, 30);
        save.setSize(20,30);
        panel.add(save);
        panel.add(load);
        this.add(panel, BorderLayout.CENTER);

        tex_Area2.setText("This is the output of the file!");
        tex_Area2.setEditable(false);
        this.add(tex_Area2, BorderLayout.SOUTH);



        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    writer = new BufferedWriter(new FileWriter(file));
                    writer.write(text_Area.getText().toString());
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });


        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    reader = new BufferedReader(new FileReader(file));
                    tex_Area2.setText(reader.readLine());
                    reader.close();
                } catch (IOException e1) {
                    System.out.println("Save something to the file first then print try to load.");
                    tex_Area2.setText("Save Something First!");
                }
            }
        });
    }

    public HW6() throws IOException {
        addAllButtons();
        showFrame();
    }

    public static void main(String[] args) throws IOException {

        HW6 myHW = new HW6();



    }





}
