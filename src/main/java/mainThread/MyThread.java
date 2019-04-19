package mainThread;

public class MyThread {
    public static void main(String[] args) {
//        Luồng 1
        CountNumberThread1 countNumberThread1 = new CountNumberThread1();
        countNumberThread1.start();

//        LUồng 2
        // khai báo đối tượng cho  Thread
        CountNumberThread2 countNumberThread2 = new CountNumberThread2();

        // khai báo thêm 1 obj của Thread và truyền obj countNum2 vào hàm khởi tạo của Thread
        Thread thread = new Thread(countNumberThread2);
        thread.start();

//        LUồng 3:
        Thread countThread3 = new Thread()
            // new Thread()

            // tạo 1 thread vô danh bằng Implements từ Interface Runnable
            //Runnable obj = new Runnable()
        {
            @Override
            public void run(){
                for (int i = 1; i < 11; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("The End!!!");
            }
        };
        countThread3.start();
        //start();

        //Thread thread = new Thread(obj); ---code ngắn gọn: new Thread(obj).start();
        //thread.start();
    }
}
