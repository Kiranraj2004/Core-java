package Multithreding;

public class Threadcreation {
    public static void main(String[] args) {
        System.out.println("main function starts ");
        thread s=new thread();
        s.setDaemon(false);
        s.run();
        System.out.println("main function");
    }
}
