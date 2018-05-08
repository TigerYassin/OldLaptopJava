package com.company.Main2;


/*

this application replicates a calculator in real life. It takes input in infix position and returns the values in
postfix position.

The point of this assignment is to gain a better familiarity using stacks. The point of this calculator is to be
able to push values to a stack and pop them accordingly. The calculator then takes the postfixed and calculates its answer.

The problem is the input given by the user.
the solution to the presented problem is my calculated answer after the postfix conversion.

The datastructer that i used for this problem is the Stack datastructer.
I only created one class which is the Main class.
 */

//import the scanner and the stack datastructer
import java.util.Scanner;
import java.util.Stack;

import static javafx.application.Platform.exit;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//gettting user input
        System.out.println("Give me an infix equation: ");

        String user_Input = scan.nextLine().replaceAll("\\s+","");
        preprocess(user_Input);
        System.out.println("Output: "+ rewrite(user_Input));
        while(true){ //quits once the user enters the character 'q'
            if(user_Input.startsWith("q")){
                exit();
            }
            System.out.println("What do you wish the value of x to be? ");
            user_Input = scan.next().trim();
            System.out.println("Solution: "+ solveX(rewrite(user_Input), Integer.parseInt(user_Input)));
        }
    }


    //rewrites our infix problem
    private static String rewrite(String input){
        Stack<String> myStack = new Stack<String>(); //creating a new instance of our datastructer
        String result = "";

        //loops through the String 'input' and checks for operands and operators
        for(int i =0;i<input.length();i++){
            if (isOperand(input.charAt(i)+"")){
                result += input.charAt(i);
            }else if(isOperator(input.charAt(i)+"")){
                while(!myStack.empty() && !openParanthesis(myStack.peek()) && checkRank(myStack.peek(),input.charAt(i)+"")){
                    result += myStack.peek();
                    myStack.pop();  //removes the last entered value from the stack
                }
                myStack.push(input.charAt(i)+"");
            }

            //checks if if the input at the given character is an open perenthasis or a close perenthesis
            else if(openParanthesis(input.charAt(i)+"")){
                myStack.push(input.charAt(i)+"");
            }else if(closingParanthesis(input.charAt(i)+"")){

                while(!myStack.isEmpty() && !openParanthesis(myStack.peek())){
                    result +=myStack.peek();
                    myStack.pop();
                }

                myStack.pop(); //pops the last entered instances
            }
        }

        //pops any extra values in the stack that
        //have not been popped out previously in the program
        while(!myStack.empty()){

            result +=myStack.peek(); //adds the peek to the result variable
            myStack.pop();
        }
        return result;
    }

    private static int solveX(String postfix, int userInput) {

        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < postfix.length(); ++i) {

            if (postfix.charAt(i) == 'x') {
                s.push(userInput);
            }else if (Character.isDigit(postfix.charAt(i))){
                s.push(Character.getNumericValue(postfix.charAt(i)));
            }else{
                int right = s.pop();
                int left = s.pop();

                //checks to see if any of the characters selected are equal to any operators that we have set for it.
                //if we find it that it matches, then it will push them accordingly.
                if(postfix.charAt(i) == '+'){
                    s.push(left + right);
                }else if(postfix.charAt(i) == '-'){
                    s.push(left - right);
                }else if(postfix.charAt(i) == '%'){
                    s.push(left % right);
                }else if(postfix.charAt(i) == '*'){
                    s.push(left * right);
                }else if(postfix.charAt(i) == '/'){
                    s.push(left / right);
                }
            }
        }
        return s.pop(); //will return the popped character.
    }

//this will handle the closing perenthasis part of the application. If the selected character is ")" then it will
    //return the boolean value true and the reverse will happen otherwise.
    private static boolean closingParanthesis(String s){
        if(s.equals(")")){
            return true;
        } else{
            return false;
        }
    }
//similar to the closing parenthesis code but instead, it looks for any open perenthasis. And returns
    //the appropriate boolean value
    private static boolean openParanthesis(String s){
        if(s.equals("(")){
            return true;
        } else{
            return false;
        }
    }


    //this will checkk the rank (presedence) of the selected character in comparison to the other characters.
    private static boolean checkRank(String s, String str){
        int weight = 0;
        int weight2 = 0;
        if(s.equals("+") || s.equals("-")){
            weight = 1;
        }else if(s.equals("*") || s.equals("/") || s.equals("%")){
            weight = 2;
        }

        if(str.equals("+") || str.equals("-")){
            weight2 = 1;
        }else if(str.equals("*") || str.equals("/") || s.equals("%")){
            weight2 = 2;
        }

        if(weight == weight2){
            return true;
        }else if(weight > weight2){
            return true;
        }else {
            return false;
        }

    }

    //Checks if the selected character is an operand or not.
    //if the operand is equal to "X" or a number then it will return true and the opposite will happen if it is
    //not a "X" nor number.
    //used regex to match for digits.
    private static boolean isOperand(String str){
        if(!(str.equals("x") || str.matches(".*\\d+.*"))){
            return false;
        }else
            return true;
    }

    /*
    this is the method that checks if the given character an
    operator or not, and returns the appropriate boolean
    value
     */
    private static boolean isOperator(String str){
        if(!(str.equals("*") || str.equals("/") || str.equals("%") || str.equals("-") || str.equals("+"))){
            return false;
        }else
            return true;
    }



    //This is the preprocessing. This method will check with all the fault cases that Bhola has lined up for us.
    private static void preprocess(String input){
        int countOpen =0;
        int countClosed =0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == '('){
                countOpen++;
            }
            if(input.charAt(i) == ')'){
                countClosed++;
            }


            //checks for any fault cases. Prints out the proper output that Bhola has listed onto his website.
            if(input.charAt(i) == '.'){

                System.out.println("Error in expression!! Cannot accept floating point numbers.");
                exit();



            }else if(i>0 && isOperand(input.charAt(i-1)+"") && isOperand(input.charAt(i)+"")){
                System.out.println("Error in expression!! No operator between operands. Also last token must be an operand.");
                exit();

            }else if(i>0 && input.charAt(i-1) == '(' && !isOperand(input.charAt(i)+"")){
                System.out.println("Error in expression!! No operator between operand and left parentheses.");
                exit();

            }else if(i>0 && input.charAt(i-1) == '*' && input.charAt(i) == '*'){
                System.out.println("Error in expression!! The * operator cannot be preceded by a * operator.");
                exit();

            }else if(i == input.length()-1 && countOpen>countClosed){
                System.out.println("Error in expression!! No matching right parentheses for a right parentheses.");
                exit();

            }else if(i == input.length()-1 && countClosed>countOpen){
                System.out.println("Error in expression!! No matching left parentheses for a right parentheses.");
                exit();

            }else if(i>0 && input.charAt(i) == ')' && !isOperand(input.charAt(i-1)+"")){
                System.out.println("Error in expression!! No operator between operand and right parentheses.");
                exit();
            }
        }
    }
}