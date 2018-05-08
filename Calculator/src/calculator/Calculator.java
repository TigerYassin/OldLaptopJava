package calculator;

//graphic user interface goes here

import javafx.scene.control.Alert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Calculator extends JFrame{


    JTextArea text_Area = new JTextArea(3,5);


    public static ArrayList mylist = new ArrayList();
    public static ArrayList operands = new ArrayList();

    JTextArea text2 = new JTextArea(1,2);       //2nd Text area for Error


    //buttons - operands
    static JButton btnZero = new JButton(" 0 ");
    static JButton btnOne = new JButton(" 1 ");
    static JButton btnTwo = new JButton(" 2 ");
    static JButton btnThree = new JButton(" 3 ");
    static JButton btnFour = new JButton(" 4 ");
    static JButton btnFive = new JButton(" 5 ");
    static JButton btnSix = new JButton(" 6 ");
    static JButton btnSeven = new JButton(" 7 ");
    static JButton btnEight = new JButton(" 8 ");
    static JButton btnNine = new JButton(" 9 ");

    //symbols operators
    static JButton btnPlus = new JButton(" + ");
    static JButton btnMinus = new JButton(" - ");
    static JButton btnMulti = new JButton(" * ");
    static JButton btnDivide = new JButton(" / ");
    static JButton btnEqual = new JButton(" = ");


    public Calculator() {
        addAllButtons();
        createGUI();
        showFrame();
    }

    private static void addAllButtons(){
        Collections.addAll(mylist, new JButton[]{btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive,btnSix, btnSeven,
        btnEight, btnNine});
        Collections.addAll(operands, new JButton[] {btnPlus, btnMinus, btnMulti, btnDivide, btnEqual});
        System.out.println(operands.get(0));
        System.out.println(mylist.get(0));
    }

    private void createGUI() {
        this.add(text_Area, BorderLayout.NORTH);
        this.add(text2, BorderLayout.SOUTH);
        JPanel buttonPanel = new JPanel();
        JPanel container = new JPanel();
        JPanel operators = new JPanel();

        buttonPanel.setLayout(new FlowLayout());

        //adding each button and changing up the color to spice things up ;)
        for (int x =0; x < mylist.size(); x++){
            //making sure the operands are inserted in the correct order, similar to how it would look in the
            //real world
            buttonPanel.add((JButton) mylist.get(x)).setBackground(Color.ORANGE);
             if (x % 2 == 0){
                buttonPanel.add((JButton) mylist.get(x)).setBackground(Color.PINK);
            }
            else {
                buttonPanel.add((JButton) mylist.get(x)).setBackground(Color.YELLOW);
            }
        }


        //adding the last two operands
        operators.add((JButton) operands.get(0)).setBackground(Color.GREEN);
        operators.add((JButton) operands.get(1)).setBackground(Color.GREEN);
        operators.add((JButton) operands.get(2)).setBackground(Color.GREEN);
        operators.add((JButton) operands.get(3)).setBackground(Color.GREEN);
        operators.add((JButton) operands.get(4)).setBackground(Color.GREEN);



            container.setLayout(new GridLayout( 2, 4));
            buttonPanel.setLayout(new GridLayout(4, 3));
            container.add(buttonPanel);

            operators.setLayout(new GridLayout(4, 1));
            container.add(operators);

        this.add(container, BorderLayout.CENTER);




        /*
        add action listener
         */

        for (int t = 0; t < mylist.size(); t++){
            listener((JButton) mylist.get(t));
        }

        for (int l = 0; l < operands.size(); l++){
            listener((JButton) operands.get(l));
        }



    }


    private void listener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text_Area.getText().startsWith("0")){
                    text_Area.setText("");
                }
                if (button.getText() == " = "){ //solves the equation
                    int answer = calculate(text_Area.getText());
                    text_Area.setText(String.valueOf(answer));

                }
                else {
                    text_Area.append(String.valueOf(button.getText().charAt(1)));
                }
            }

            //calculates the equation
            private int calculate(String text) {
                try {

                    for (int x = 0; x < text.length(); x++) {        //multiply
                        if (text.charAt(x) == '*') {
                            String[] myString = text.split("[*]");
                            return Integer.parseInt(myString[0]) * Integer.parseInt(myString[1]);
                        }
                    }


                    for (int x = 0; x < text.length(); x++) {        //divide
                        if (text.charAt(x) == '/') {
                            String[] myString = text.split("[/]");
                            return Integer.parseInt(myString[0]) / Integer.parseInt(myString[1]);
                        }
                    }

                    for (int x = 0; x < text.length(); x++) {        //addition
                        if (text.charAt(x) == '+') {
                            String[] myString = text.split("[+]");
                            return Integer.parseInt(myString[0]) + Integer.parseInt(myString[1]);
                        }
                    }

                    for (int x = 0; x < text.length(); x++) {        //Subtract
                        if (text.charAt(x) == '-') {
                            String[] myString = text.split("[-]");
                            return Integer.parseInt(myString[0]) - Integer.parseInt(myString[1]);
                        }
                    }

                    //Cating the errors
                }catch (NumberFormatException e){
                    System.out.println("That aint right");
                    text2.setText("Something went wrong with the signs bro");
                    text_Area.setText("");
                }
                //Out of bounds
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("That aint right");
                    text2.setText("Something went wrong with the signs bro");
                    text_Area.setText(text_Area.getText().substring(0,text_Area.getText().length()-1));
                    return Integer.parseInt(text_Area.getText().substring(0,text_Area.getText().length()-1));
                }

                String[] values = text.split("[-+*/]");
                System.out.println(values[0]);

                return 0;
            }
        });
    }


    private void showFrame(){
        this.setSize(230, 340);
        this.setTitle(" Azim ");
        text_Area.setEditable(false);
        text2.setSize(200,50);
        text2.setEditable(false);
        ImageIcon myImage = new ImageIcon("D:\\icon.png");
        this.setIconImage(myImage.getImage());
        System.out.println(this.getIconImage());
        //changing the size of the text area font so that you can see easier
        text_Area.setFont( text_Area.getFont().deriveFont(   text_Area.getFont().getSize() + 20.0f  ));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
