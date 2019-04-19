package mainThread;

import collection.ViewCount;
import entity.Video;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TomJerry {
    public static void main(String[] args) throws IOException {

//            File file = new File("F:\\java2\\src\\main\\resources\\TomJerry.txt");
//
//            Scanner scanner = null;

//            try {
//                scanner = new Scanner(text);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }


//        try {
//            //Opening the file
//            scanner = new Scanner(text);
//
//            //Reading the file
//            while(scanner.hasNext()) {
//                String currentLine = scanner.nextLine();
//                System.out.println(currentLine);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("The file " + text + "is not found !");
//            e.printStackTrace();
//        } finally {
//            //Closing the file
//            scanner.close();
//        }

//        FileInputStream fileInputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//        while (true){
//            int c = inputStreamReader.read();
//            if (c == -1){
//                break;
//            }
//            System.out.println((char)c);
//        }

//        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
//        int c;
//        while ((c = isr.read()) != -1){
//            System.out.print((char)c);
//        }
//        isr.close();

        FileReader fileReader = new FileReader("F:\\java2\\src\\main\\resources\\TomJerry.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        ArrayList<Video> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                double view = Double.parseDouble(splitted[3]);
                Video video = new Video(day, id, title, view);
                list.add(video);
            }
            count++;
        }
        HashMap<String, ViewCount> statistic = new HashMap<>();
        for (Video vid : list
        ) {
            double currentViewCount = 0;
            if (statistic.containsKey(vid.getId())) {
                ViewCount viewCount = statistic.get(vid.getId());
                currentViewCount = viewCount.getView();
            }
            currentViewCount += vid.getView();
            ViewCount viewCount = new ViewCount(vid.getId(), vid.getTitle(), currentViewCount);
            statistic.put(vid.getId(), viewCount);
        }
        for (String id : statistic.keySet()
        ) {
            System.out.println(id);
            ViewCount viewCount = statistic.get(id);
            System.out.println(viewCount.getTitle());
            System.out.println(viewCount.getView());
        }

    }
}
