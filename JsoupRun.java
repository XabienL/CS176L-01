import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupRun {

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0").timeout(6000).get();
            
            Elements body = doc.select("tbody");
            for (Element e : body.select("td.grid_line_regular")) {
            	final String name = e.select("a").text();
            	if (name != "" && name.length() > 3) System.out.println(name);        			
            	}
            /*for (Element e : body.select("tr")) {
                String img = e.select("td.posterColumn img").attr("src");
                System.out.println(img);
                String title = e.select("td.posterColumn img").attr("alt");
                System.out.println(title);
                String year = e.select("td.titleColumn span.secondaryInfo").text().replaceAll("[^\\d]", "");
                System.out.println(year);
                String rate = e.select("td.ratingColumn > strong").text().trim();
                System.out.println(rate); */
            
            
            
        } catch (IOException ex) {
        	System.out.println("Failed to connect to the website: " + ex.getMessage());
        }
    }
}
       
	


