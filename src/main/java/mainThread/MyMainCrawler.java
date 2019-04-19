package mainThread;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

public class MyMainCrawler {
    private static ThreadPoolExecutor threadPoolExecutor;

    public static void main(String[] args) {
//        HashSet<String> setString = new HashSet<String>();
        HashMap<String, Boolean> mapString = new HashMap<String,Boolean>();
        String getLink = "https://vnexpress.net/";
        try {
            Scanner scanner = new Scanner(System.in);
            long startTime = Calendar.getInstance().getTimeInMillis();

            System.out.println("-----Menu-----");
            System.out.println("1.VNexpress");
            System.out.println("2.Cafebiz");
            System.out.println("nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Document doc = Jsoup.connect(getLink).get();
                    Elements elements = doc.select("a");
                    for (Element element:
                            elements) {
                        String link = element.attr("href");
                        mapString.put("https://vnexpress.net/the-thao", true);
                        mapString.put(link, true);
                    }
                    System.out.println(mapString.size());
//            for (String i : mapString.keySet()) {
//                System.out.println("key: " + i + " value: " + mapString.get(i));
//            }

                    // Lay mot tap hop cac entry
                    Set set = mapString.entrySet();
                    // Lay mot iterator
                    Iterator i = set.iterator();
                    while(i.hasNext()) {
                        Map.Entry me = (Map.Entry)i.next();
                        System.out.print(me.getKey() + ": ");
                        System.out.println(me.getValue());
                    }


                    break;
                case 2:
                    Document document = Jsoup.connect("http://cafebiz.vn/").get();
                    Elements links = document.select("a");
                    for (Element e : links) {
                        System.out.println(e.attr("href"));
                        break;
                    }
            }
            long endTime = Calendar.getInstance().getTimeInMillis();
            System.out.println(endTime - startTime);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
