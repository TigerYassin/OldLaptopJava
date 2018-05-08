package items;

import java.util.Arrays;
import java.util.Vector;

public class DataStructers_Study {

    public static void main(String[] args){

        int a = 1;
        double b = 8;
        double c;
        try {
            c = a%b;
        }catch (ArithmeticException e){
            System.out.println("Error in the code");
            return;
        }

        System.out.println(c);



        System.out.println(b/=2);



        int d1 = 31;
        int d5 = d1 % 2;
        d1/=2;
        int d4 = d1 % 2;
        d1/=2;
        int d3 = d1 % 2;
        d1/=2;
        int d2 = d1 % 2;
        d1/=2;

        System.out.println("Answer: " + d1 + d2 + d3 + d4 + d5);

        Vector str1 = new Vector();
        Vector str2 = new Vector();

        str1.add("this is a test");
        str1.add("And another test");
        str2 = str1;

        System.out.println(str2.size());



        System.out.println(15/4*2.0);

        String myString = "this is the string that i will be tokenizing";

        System.out.println(Arrays.toString(myString.split(" ")).replace(" ", ""));

    }


}
