package com.company.Main2;

import java.util.ArrayList;
import java.util.Stack;

public class check {



    static Stack myStack = new Stack();
    static ArrayList numbers = new ArrayList();
    static StringBuilder myBuild = new StringBuilder();
    static ArrayList final_array = new ArrayList();


    public static void main(String[] args){

        String expression = "(xx + 1) * (x – 2) / 4 ";
        int newNumber = 0;


        for (int x = 0; x < expression.length(); x++){
            if (true) {
                if ((expression.charAt(x) >= 48 && expression.charAt(x) <= 57) || (expression.charAt(x) == 120)) {

                    myBuild.append(expression.charAt(x));

                }
                else if ((!(expression.charAt(x) >= 48 && expression.charAt(x) <= 57) || (expression.charAt(x) == 120))&&
                        !myBuild.toString().isEmpty()){

                    numbers.add(myBuild);
                    myBuild = new StringBuilder();
                }
            }


            if (expression.charAt(x) == '+' || expression.charAt(x) == '–'){
                lowerPrecedence(expression.charAt(x));

            }

            if (expression.charAt(x) == '*' || expression.charAt(x) == '/'){
                higherPrecedence(expression.charAt(x));

            }

            if (expression.charAt(x) == '('){
                openParanthesis();
            }

            if (expression.charAt(x) == ')'){
                closeParanthesis();
            }

        }


        if (!myBuild.toString().isEmpty()){


        }

        popAll();


        System.out.println(final_array);
        for (int y = 0; y < final_array.size(); y++){
            System.out.print(final_array.get(y) + " ");
        }
        System.out.println( );
        String final_Expression = (expression.replace('x', String.valueOf(newNumber).charAt(0)));

        System.out.println(final_Expression);
        for (int i = 0; i < final_array.size(); i++){

            if (final_array.get(i).equals('+') || final_array.get(i).equals('–') || final_array.get(i).equals('*') ||
                    final_array.get(i).equals('/')){
                System.out.println(final_array.get(i));



            }

        }
























    }

    private static void popAll() {
        while (!myStack.empty()){
            removeValues();
        }


    }


    private static void openParanthesis(){
        myStack.push("(");
    }


    private static void closeParanthesis() {
        while (!(myStack.peek().toString().equals("("))){

            removeValues();

        }
        myStack.pop();

    }


    private static void higherPrecedence(char x) {
        if (!myStack.isEmpty()){

            if (myStack.peek().toString().equals("*")){
                removeValues();
            }
        }myStack.push(x);

    }


    private static void lowerPrecedence(char x) {
        if (!myStack.empty()) {
            if (myStack.peek().toString().equals("*") || myStack.peek().toString().equals("/")) {
                for (int y = 0; y <= myStack.size(); y++) {
                    removeValues();
                }

                myStack.push(x);

            } else myStack.push(x);

        } else myStack.push(x);

    }





    private static void removeValues() {

        while (!(numbers.isEmpty())) {
        final_array.add(numbers.remove(0));


        }

        final_array.add(myStack.pop());

    }



}
