package Multithreding.wasteclass;

public class thread2creation implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread()+" "+i);
        }
    }
}
