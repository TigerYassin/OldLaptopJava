/*
    This application goes over the uses of a simple calculator and replicates a real life calculator. The "calculator"
    is given an infix expression and it will return a postfix expression and along with the answer.
 */


/*
example:
input : (x + 1) * (x – 2) / 4
converted expression:  x 1 + x 2 - * 4 /


prompt user for value x:
user input: x= 5
output: 4

user input: x =7
output = 10
 */

package com.company;

import java.util.*;


public class Main {

    static Stack operators = new Stack();
    static ArrayList operands = new ArrayList();

    public static void main(String[] args) {


        String expression = "(x + 1) * (x – 2) / 4"; //the mathematical expression we are getting from the user

        StringBuilder myBuild = new StringBuilder();

        for (char var : expression.toCharArray()) {
            if ((var >= 48 && var <= 57) || (var == 120)) {// 0 is equivalent to 48 and 9 is equivalent to 57
                myBuild.append(var);
            }
            else if (!myBuild.toString().isEmpty()) {
                operands.add(myBuild);
                myBuild = new StringBuilder();
            }
        }

        operands.add(myBuild);
        System.out.println(operands);

        //cycles through the operators stack and calls its appropriate method.
        for (char x : expression.toCharArray()) {
            if (x == '+' || x == '–') {
                lowerPrecedence(x);
            } else if (x == '*' || x == '/') {
                higherPrecedence(x);
            }
            else if (x == '('){
                openParenthesis();
            }
            else if (x==')'){
                closeParenthesis();
            }
        }
        popAll();
    }




    private static void openParenthesis() {
        operators.push("(");
    }

    private static void closeParenthesis() {

        while (!operators.peek().toString().equals("(")){
            System.out.println(operators.pop());
        }
        operators.pop();
    }


    private static void lowerPrecedence(char x) {
        if (!operators.empty()) {
            if (operators.peek().toString().equals("*") || operators.peek().toString().equals("/")) {
                for (int y = 0; y <= operators.size(); y++) {
                    System.out.println(operators.pop());
                }

                operators.push(x);

            } else operators.push(x);

        } else operators.push(x);
    }



    private static void higherPrecedence(char x) {
        if (!operators.empty()) {
            if (operators.peek().toString().equals("*")) {
                System.out.println(operators.pop());
            }
        }
        operators.push(x);
    }

    private static void popAll() {
            while (!operators.empty()){
                System.out.println(operators.pop());

        }
    }


}
