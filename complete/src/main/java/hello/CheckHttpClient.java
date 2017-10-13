package hello;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by rsm095 on 13/10/2017.
 */
public class CheckHttpClient {

    public static String callEbayCategorySite(){
        try {
            Document doc = Jsoup.connect("https://www.ebay.co.uk/sch/allcategories/all-categories").get();
            Elements categories = doc.select("#mainContent div .right-section .categories-with-links");
            String extractedInfo = categories.get(0).text();
            System.out.println("YUPI: Information fetched: "+extractedInfo);
            return extractedInfo;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ERROR: Something blew up!";
    }

}
