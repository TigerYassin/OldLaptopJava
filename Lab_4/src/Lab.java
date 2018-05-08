

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lab {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("message1"));
        ArrayList<String> records = new ArrayList<String>();


        String line;
        while ((line = reader.readLine()) != null)
        {
            records.add(line);
        }
        reader.close();

        for(int i = 0; i<5; i++) {
//            System.out.println(records.get(i));
            myParser(records.get(i));
        }

    }



    public static String myParser(String parse){

        String[] myArray = parse.split(" ");
        System.out.println(Arrays.toString(myArray));

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Integer> updated = new ArrayList<>();

        for(int x = 1; x < myArray.length; x++){
            String[] new1 = myArray[x].split("");
            for (int i = 0; i < new1.length; i++){
                if (Arrays.asList(alphabet).contains((new1)[i])){

                    updated.add(Arrays.asList(alphabet).indexOf(new1[i]));

                }


            }
//            Arrays.asList().indexOf("");


//            System.out.println(Arrays.toString(new1));
        }





        return "";
    }
}
