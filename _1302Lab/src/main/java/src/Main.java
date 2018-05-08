package src;
/**
 * Practice for:
 * 		Friday 13-Apr-2018
 *
 * This project is designed to give an opportunity to the students
 * to see the application of their programming skills while reviewing
 * the basics of Java SE that they have learned so far.
 *
 * In this project, students are given the class 'MyGoogleSearch' to
 * use as a black-box to retrieve the results of a google search
 * queried. This class requires jsoup-1.11.2 library which can be
 * downloaded from:
 * 		https://jsoup.org/download
 *
 * Students need not to know anything about jsoup library. Their task
 * is to create a class which implements 'ITextExtractor' and implement
 * all the methods to be able to process the raw data (text) queried
 * suing 'MyGoogleSearch'.
 *
 *
 * @author Azim Ahmadzadeh - https://grid.cs.gsu.edu/~aahmadzadeh1/
 *
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import googlebridge.MyGoogleSearch;
import textmining.ITextExtractor;
import textmining.TextExtractor;


public class Main{

    public static final String GOOGLE_SEARCH_URL = "https://www.google.com/yassin";

    public static void main(String[] args) throws IOException {
        TextExtractor myEx = new TextExtractor();


        String[] myString = MyGoogleSearch.getTitleResults("java", 3);
        System.out.println(Arrays.toString(myEx.getWords(Arrays.toString(myString))));


		/*
		 * 1. FUNCTION: getAllWords(String[] phrases);
		 *
		 * 		Input: titles1
		 * 		Output: allTitles1
		 */


		List<String[]> myList = myEx.getAllWords(myString);
		System.out.println(Arrays.toString(myList.get(2)));
        System.out.println(Arrays.toString(new List[]{myList}));

		/*
		 * 2. FUNCTION: meltList(List<String[]> inList);
		 * 
		 * 		Input: allTitles1
		 * 		Output: allWords1
		 */


		System.out.println("Here is the melted array " + Arrays.toString(myEx.meltList((myList))));
		
		
		/*
		 * 3. FUNCTION: computeTF(String[] allWords);
		 * 
		 * 		Input: allWords1
		 * 		Output: termFreq1
		 */

		System.out.println(myEx.computeTF(myEx.meltList(myList)));
		
		
		/*
		 * 4. Repeat this for another search
		 * 
		 * 		Final Outputs:
		 * 				- termFreq1
		 * 				- termFreq2
		 */
		System.out.println("\n\n\n");

        TextExtractor newEx = new TextExtractor();
        String[] otherString = MyGoogleSearch.getTitleResults("Python", 3);
        System.out.println(Arrays.toString(newEx.getWords(Arrays.toString(otherString))));

        List<String[]> secondList = newEx.getAllWords(otherString);
        System.out.println(Arrays.toString(secondList.get(2)));
        System.out.println(Arrays.toString(new List[]{secondList}));
        System.out.println("Here is the melted array for the second search: " + Arrays.toString(newEx.meltList((secondList))));





		/*
		 * 5. FUNCTION: crossUpdate(Map<String, Integer> source, Map<String, Integer> another);
		 *
		 * 		Inputs: termFreq1, termFreq2
		 */

		//computeTensorFlow
        System.out.println("Computed term frequency" + newEx.computeTF(newEx.meltList(secondList)));
        myEx.crossUpdate(myEx.computeTF(myEx.meltList(myList)), newEx.computeTF(newEx.meltList(secondList)));

		
		/*
		 * 6. FUNCTION: cosineSimilarity(Map<String, Integer> map1, Map<String, Integer> map2)
		 * 
		 * 		Inputs: termFreq1, termFreq2
		 * 	@return : double
		 */

        System.out.println(myEx.cosineSimilarity(myEx.computeTF(myEx.meltList(myList)), newEx.computeTF(newEx.meltList(secondList))));



    }

}