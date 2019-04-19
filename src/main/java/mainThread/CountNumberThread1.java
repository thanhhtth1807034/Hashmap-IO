package mainThread;

public class CountNumberThread1 extends Thread{
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
        System.out.println("THe End!");
    }
}
