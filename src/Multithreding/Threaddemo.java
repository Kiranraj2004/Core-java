package Multithreding;
//this is one type of creation of thread in this we have extended Thread
class a extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class b extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
        }
    }
}
public class Threaddemo {
    public static void main(String[] args){
       a obj1=new a();
       b obj2=new b();
       obj1.start();
       try{
           Thread.sleep(10);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       obj2.start();
    }
}
