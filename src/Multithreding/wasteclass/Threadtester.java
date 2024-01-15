package Multithreding;

public class Threadtester {
    public static void main(String[] args) {
        System.out.println("main function starts ");
        thread1creation s=new thread1creation("thread1");
        s.setDaemon(false);
        thread2creation t2=new thread2creation();
        t2.run();
        s.run();
        System.out.println("main function");
    }
}
