package Multithreding;
// this  is using runnalbe and it is the interface so we can inhert the mutiple class
class hi implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
//            here we cant use the t1 object so we use the current thread to access to getname
//            get-priority
            Thread.currentThread().getName();
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class hello implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Threaddemo2 {
    public static void main(String[] args)  throws Exception{
//        we can aslo create the reference variable of interface Runnable
       Runnable obj1=new hi();
        hello obj2=new hello();
//        here in runnable interface there is no run method so we use the thread class
//        which has run method and it also has the constructor where we can pass the  runnable
//        object
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        t2.start();
//        System.out.println("bye");
//        this print function will executed by main function it will not wait until the
//        thread execute in order to wait until the execution we can use join method
//        to wait
        t1.join();
        t2.join();
        System.out.println("bye");
        System.out.println(t2.isAlive());
//        is-alive is a method which gives true or false  whether your thread is running
        System.out.println(t1.getName());
//        it will give the name of thread
//        we can change the name by this
        t1.setName("hi thread");
        System.out.println(t1.getPriority());
//        range of priority 1 is low 5 is average 10 is high priority
    }
}
