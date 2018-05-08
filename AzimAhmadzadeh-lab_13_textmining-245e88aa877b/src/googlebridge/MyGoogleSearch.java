/*
 * This code is copied from:
 * 		https://www.journaldev.com/7144/jsoup-java-html-parser
 * 
 * The jsoup-1.11.2 library is needed. You can download it
 * from:
 * 		https://jsoup.org/download
 */

package googlebridge;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class MyGoogleSearch {

	public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";

	/**
	 * 
	 * @param searchTerm
	 * @param count
	 * @return
	 * @throws IOException
	 */
	public static String[] getTitleResults(String searchTerm, int count) throws IOException {

		String[] allText;
		String searchURL = GOOGLE_SEARCH_URL + "?q=" + searchTerm + "&num=" + count;
		Document doc = Jsoup.connect(searchURL).userAgent("Mozilla/5.0").get();

		
		Elements results = doc.select("h3.r > a");
		

		allText = new String[results.size()];
		
		int i = 0;
		for (Element result : results) {
			String linkText = result.text();
			allText[i] = linkText;
			i++;
		}
		
		return allText;

	}
	
	/**
	 * 
	 * @param searchTerm
	 * @param count
	 * @return
	 * @throws IOException
	 */
	public static String[] getLinkResults(String searchTerm, int count) throws IOException {

		String[] allLinks;
		String searchURL = GOOGLE_SEARCH_URL + "?q=" + searchTerm + "&num=" + count;
		Document doc = Jsoup.connect(searchURL).userAgent("Mozilla/5.0").get();

		
		Elements results = doc.select("h3.r > a");
		

		allLinks = new String[results.size()];
		
		int i = 0;
		for (Element result : results) {
			String linkHref = result.attr("href");
			allLinks[i] = linkHref; //
			i++;
		}
		
		return allLinks;

	}

}
