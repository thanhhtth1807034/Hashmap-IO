package collection;

import entity.LateInformation;


import java.util.ArrayList;
import java.util.HashMap;

public class MainThread {

    public static void main(String[] args) {
        ArrayList<LateInformation> list = new ArrayList<>();
        LateInformation l1 = new LateInformation(
                "10/04/2019",
                "A01",
                "thanh",
                10000
        );
        LateInformation l2 = new LateInformation(
                "11/04/2019",
                "A02",
                "phu",
                10000
        );
        LateInformation l3 = new LateInformation(
                "12/04/2019",
                "A03",
                "dat",
                20000
        );
        LateInformation l4 = new LateInformation(
                "13/04/2019",
                "A04",
                "nam",
                20000
        );
        LateInformation l5 = new LateInformation(
                "14/04/2019",
                "A01",
                "thanh",
                10000
        );
        LateInformation l6 = new LateInformation(
                "14/04/2019",
                "A03",
                "dat",
                20000
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

//        HashMap<String , StudentPunishment> statistic = new HashMap<>();
//        for (LateInformation lateInformation:list) {
//            double currentMoney = 0;
//            // kiểm tra xem có tồn tại hay không
//            if (statistic.containsKey(lateInformation.getRollNumber())){
//                StudentPunishment studentPunishment = statistic.get(lateInformation.getRollNumber());
//                currentMoney = studentPunishment.getMoney();
//            }
//            currentMoney = currentMoney + lateInformation.getMoney();
//            StudentPunishment studentPunishment = new StudentPunishment(lateInformation.getRollNumber(), lateInformation.getName(),currentMoney );
//            statistic.put(lateInformation.getRollNumber(), studentPunishment);
//
//        }
//        for (String rollNumber: statistic.keySet()) {
//            System.out.println(rollNumber);
//            StudentPunishment studentPunishment = statistic.get(rollNumber);
//            System.out.println(studentPunishment.getName());
//            System.out.println(studentPunishment.getMoney());
//        }
//

        HashMap<String, StudentPunishment> statistic = new HashMap<>();
        for (LateInformation information:list
             ) {
            double currentMoney = 0;
            if (statistic.containsKey(information.getRollNumber())){
                StudentPunishment studentPunishment = statistic.get(information.getRollNumber());
                currentMoney = studentPunishment.getMoney();
            }
            currentMoney += information.getMoney();
            StudentPunishment studentPunishment = new StudentPunishment(information.getRollNumber(),information.getName(), currentMoney);
            statistic.put(information.getRollNumber(), studentPunishment);
        }
        for (String rollNumber:statistic.keySet()
             ) {
            System.out.println(rollNumber);
            StudentPunishment studentPunishment = statistic.get(rollNumber);
            System.out.println(studentPunishment.getName());
            System.out.println(studentPunishment.getMoney());
        }
    }
}
