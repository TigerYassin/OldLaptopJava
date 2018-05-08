package textmining;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * DO NOT MODIFY ANYTHING IN THIS INTERFACE.
 *
 * @author Azim Ahmadzadeh - https://grid.cs.gsu.edu/~aahmadzadeh1/
 *
 */
public interface ITextExtractor {

    /**
     * Processes the input phrase by removing the non-alphanumeric
     * characters, extra spaces. This method at the end, returns
     * an array of single words.
     *
     * 		Example input: This "   IS \ + a baD 22 __E-xample
     * 		Example output: {this,is,a,bad,example}
     *
     * @param input a string of multiple words possibly including
     * noises (i.e., non-alphanumeric characters).
     *
     * @return an array of single words.
     */
    public String[] getWords(String input);

    /**
     * Extracts single words from each phrase, and for an array
     * of phrases, it creates and returns a list consists of
     * multiple arrays of single words.
     *
     *
     * 		Example input: { {This "   IS \ + a baD __E-xample},{BAD & exAMPLE},{yeT 45 OnE #^ more bAd} }
     * 		Example output: [ {this,is,a,bad,example}, {bad,example} , {yet,one,more,bad} ]
     *
     * @param phrases an array of phrases each of which consists
     * of multiple words with possible noises.
     *
     * @return a list containing the array of the extracted words.
     */
    public List<String[]> getAllWords(String[] phrases);




    /**
     * Melts the given list by copying the elements of all of its
     * arrays into one big array of Strings.
     *
     * 		Example input:[ {this,is,a,bad,example}, {bad,example} , {yet,one,more,bad} ]
     * 		Example output: { this,is,a,bad,example,bad,example,yet,one,more,bad }
     *
     *
     * @param inList
     * @return
     */
    public String[] meltList(List<String[]> inList);




    /**
     * Counts the frequency of each word in the given array,
     * and stores the results into a hashmap, where keys are
     * the words and the values are the frequencies.
     *
     * 		Example input: { this,is,a,bad,example,bad,example,yet,one,more,bad }
     * 		Example output: { <this,1>, <is,1>, <a,1>, <bad,3>, <example,2>, <yet,1>, <one,1>, <more,1> }
     *
     *
     * @param allWords an array of words with possible repetitions.
     * @return a hashmap of words and frequencies.
     */
    public Map<String, Integer> computeTF(String[] allWords);




    /**
     * Adds the missing words of one map to another map such that they both
     * have the union of the words. For the newly added words the frequency
     * will be set to zero.
     *
     * 		Example input:
     * 			map1 : { <this,1>, <is,1>, <a,1>, <bad,3> }
     * 			map2 : { <this,1>, <learn,2>, <is,2>, <example,1> }
     * 		Example output:
     * 			map1 : { <this,1>, <is,1>, <a,1>, <bad,3>, <learn,0>, <example,0> }
     * 			map2 : { <this,1>, <learn,2>, <is,2>, <example,1>, <a,0>, <bad,0> }
     *
     * @param source
     * @param another
     */
    public void crossUpdate(Map<String, Integer> source, Map<String, Integer> another);


    /**
     * ALREADY IMPLEMENTED FOR YOU. DO NOT MODIFY THIS.
     *
     * Calculates the cosine similarity between the two term-frequencies. In other
     * words it calculates how similar the documents which are represented by map1
     * and map2 are similar.
     *
     * @param map1
     * @param map2
     * @return
     */

    public default double cosineSimilarity(Map<String, Integer> map1, Map<String, Integer> map2) {

        Collection<Integer> s1 = map1.values();
        Collection<Integer> s2 = map2.values();

        Integer[] freq1 = s1.toArray(new Integer[0]);
        Integer[] freq2 = s2.toArray(new Integer[0]);

        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;
        for (int i = 0; i < freq1.length; i++) {
            dotProduct += freq1[i] * freq2[i];
            normA += Math.pow(freq1[i], 2);
            normB += Math.pow(freq2[i], 2);
        }
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));

    }
}