package textmining;

import java.util.*;

public class TextExtractor implements ITextExtractor {

    @Override
    public String[] getWords(String input) {
        String[] results;

        String alphanumericPattern = "[^A-Za-z]";
        String multipleDashPattern = "(.)\\1+";
        String multipleSpacepattern = "\\s+";
        String result = input.replaceAll(multipleSpacepattern, " ");
        result = result.toLowerCase();
        result = result.replaceAll(alphanumericPattern, "-");
        result = result.replaceAll(multipleDashPattern, "-");

        results = result.split("-");
        return results;
    }

    @Override
    public List<String[]> getAllWords(String[] phrases) {

        List<String[]> myList = new ArrayList<>();
        for (int x = 0; x < phrases.length; x++){
            myList.add(getWords(phrases[x]));
        }

        return myList;
    }

    @Override
    public String[] meltList(List<String[]> inList) {

        List mylist = new ArrayList();
        for (String[] myString : inList){
            for (String val : myString){
                if (val.length() > 1) {
                    mylist.add(val);
                }
            }
        }
        String[] newString = new String[mylist.size()];
        for (int x =0; x < mylist.size(); x++){
            newString[x] = mylist.get(x).toString();

        }

        return newString;
    }

    @Override
    public Map<String, Integer> computeTF(String[] allWords) {

        HashMap myMap = new HashMap();
        //Count the words in each string
        for (String x : allWords){

            if (!myMap.containsKey(x)){
                myMap.put(x, 1);
            }
            else {
                myMap.put(x, Integer.parseInt(myMap.get(x).toString()) +1);
            }
        }

        return myMap;
    }

    @Override
    public void crossUpdate(Map<String, Integer> source, Map<String, Integer> another) {
        // TODO Auto-generated method stub
        Map myMap = new HashMap();
        myMap.putAll(source);
        myMap.putAll(another);



        System.out.println(" \n\nThis is the overall map : " + myMap);

    }

}