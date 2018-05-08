
import java.util.ArrayList;
import java.util.Arrays;


public class LabPractice {


    public static void main(String[] args){
        String parse = "this is the string that I will be parsing";
        String[] myArray = parse.split(" ");

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<int[]> updated = new ArrayList<>();




        for (int i =0; i < myArray.length; i++){
            String[] myChar = myArray[i].split("");
            System.out.println(Arrays.toString(myChar));
            int[] myChar1 = new int[myArray[i].length()];
            for (int x = 0; x<myArray[i].length(); x++){
                myChar1[x] = (Arrays.asList(alphabet).indexOf(myChar[x])+1);
            }
            updated.add(myChar1);
            System.out.println(Arrays.toString(myChar1));

        }

System.out.println(Arrays.toString(updated.get(2)));








    }
}
