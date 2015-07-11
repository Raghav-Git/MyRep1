package jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTutorial {

	public static void main(String[] args) {

		//taking sample code from - http://jsoup.org/

		Document doc;
		try {
			doc = Jsoup.connect("http://en.wikipedia.org/").get();

			//Elements newsHeadlines = doc.select("#mp-itn b a");
			Elements links = doc.select("a");

			for(Element e:links){
				System.out.println(e.attr("href"));
				System.out.println(e.attr("text"));
				System.out.println(e.attr("html"));
			}

		} catch (Exception e) {
			System.out.println("Exp Cause : "+e.getCause());
			System.out.println("Exp Message : "+e.getMessage());
			System.out.println("Exp is : "+e);
			e.printStackTrace();
		}
	}

}
