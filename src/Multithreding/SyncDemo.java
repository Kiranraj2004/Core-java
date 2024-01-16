package Multithreding;
//synchronized keyword in multithreading
 class counter{
     int count;
//     synchronized means when ever the h1 call the increment the h2 should be quiet
     public synchronized void increment(){
         count++;
     }

}
//class d  extends counter implements Runnable{
//     counter s=new counter();
//    @Override
//    public void run() {
//        for (int i = 0; i <1000 ; i++) {
//           s.increment();
//        }
//
//    }
//}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
//        d d1=new d();
        counter j=new counter();
//        Thread h1=new Thread(d1);
        Thread h1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    j.increment();
                }
            }
        });
        Thread h2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                       j.increment();
                }
            }
        });

        h1.start();
        h2.start();
        h1.join();
        h2.join();
        System.out.println(j.count);
    }
}
