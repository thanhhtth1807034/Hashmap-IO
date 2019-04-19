package mainThread;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class MyCrawler {
    public static void main(String[] args) {
//        try {
//            Document doc = Jsoup.connect("http://cafebiz.vn/").get();
//            Elements newsHeadlines = doc.select(".listtimeline .last li h3 a");
//
//            if (newsHeadlines.size() > 0) {
////                for (Element e: newsHeadlines
////                     ) {
////                    System.out.println(e.attr("title"));
////                    System.out.println(e.attr("href"));
////                }
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(newsHeadlines.get(i).attr("title"));
//                    System.out.println("http://cafebiz.vn/" + newsHeadlines.get(i).attr("href"));
//                }
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //            Scanner scanner = new Scanner(System.in);
//            long startTime = Calendar.getInstance().getTimeInMillis();
//
//            System.out.println("-----Menu-----");
//            System.out.println("1.VNexpress");
//            System.out.println("2.Cafebiz");
//            System.out.println("nhập lựa chọn của bạn: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    Document getconnect = Jsoup.connect("https://vnexpress.net/").get();
//                    Elements newsHeadlines = getconnect.select("a");
//                    for (Element e : newsHeadlines) {
//                        System.out.println(e.attr("href"));
//                    }
//
//                    break;
//                case 2:
//                    Document document = Jsoup.connect("http://cafebiz.vn/").get();
//                    Elements links = document.select("a");
//                    for (Element e : links) {
//                        System.out.println(e.attr("href"));
//                        break;
//                    }
//            }
//            long endTime = Calendar.getInstance().getTimeInMillis();
//            System.out.println(endTime - startTime);
//            for (int i = 0; i < 17; i++) {
//                System.out.println(newsHeadlines.get(i).text() + "title");
//            }

    }
}
