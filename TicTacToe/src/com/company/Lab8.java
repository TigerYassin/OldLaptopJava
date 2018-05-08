import java.lang.reflect.Array;
import java.util.ArrayList;


public class Lab8 {

    //Write your code here to implement averageVowels


    public static double averageVowels(ArrayList<String> Sent){
        double count = 0.0;
        if (Sent.size() < 1){
            return count;
        }
        for (String word : Sent){
            word = word.toLowerCase();
            for (char x =0; x < word.length(); x ++){
                if (word.charAt(x) == 'a' || word.charAt(x) == 'e' || word.charAt(x) == 'i' || word.charAt(x) == 'o'
                        || word.charAt(x) == 'u'){
                    count++;
                }
            }
        }

        return count/Sent.size();

    }

    //Write your code here to implement removeEvenLength


    public static void removeEvenLength(ArrayList<String> Sent){

        for (int x = 0; x < Sent.size(); x++){
            if (Sent.get(x).length()%2 == 0){
                Sent.remove(x);
                x--;
            }
        }

    }


    //Write your code here to implement removeDuplicates

    public static void removeDuplicates(ArrayList<String> Sent){

        for(int x =0; x < Sent.size()-1; x++){

            if (Sent.get(x).equalsIgnoreCase(Sent.get(x+1))){
                Sent.remove(x);
                x--;
            }

        }
    }


    public static void main(String[] args) {
        ArrayList<String> arrStr = new ArrayList<String>();

        arrStr.add("be"); // has 1 vowel
        arrStr.add("be");
        arrStr.add("is");
        arrStr.add("not");
        arrStr.add("or");
        arrStr.add("question"); // has 4 vowels
        arrStr.add("that");
        arrStr.add("the");
        arrStr.add("to");
        arrStr.add("to");



        Lab8 test = new Lab8();

        System.out.println("Task -1-");
        // Test averageVowels
        System.out.println("Average Count: "+ test.averageVowels(arrStr));// 1.3 expected


        System.out.println("\nTask -2-");
        // Test removeEvenLength
        System.out.println("After removing the strings with even length from list " + arrStr);
        test.removeEvenLength(arrStr);
        System.out.println("The array list becomes:  " + arrStr);


        arrStr = new ArrayList<String>();

        arrStr.add("be"); // has 1 vowel
        arrStr.add("be");
        arrStr.add("is");
        arrStr.add("not");
        arrStr.add("or");
        arrStr.add("question"); // has 4 vowels
        arrStr.add("that");
        arrStr.add("the");
        arrStr.add("to");
        arrStr.add("to");

        System.out.println("\nTask -3-");
        // Test removeEvenLength
        System.out.println("After removing the duplicates from list " + arrStr);
        test.removeDuplicates(arrStr);
        System.out.println("The array list becomes:  " + arrStr);

    }

}