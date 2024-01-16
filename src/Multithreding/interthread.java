package Multithreding;
class q{
    int num;
  boolean d=false;
//  wait object is from object class there is difference between sleep and wait
//    in wait some one should notify the wait method but in sleep we should define the time
//    and sleep is from thread class where as wait is object class
    public synchronized void  getNum() {
        if (!d){
            try{
                wait(100);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("getnum"+num);
        d=false;
        notify();

    }

    public  synchronized void setNum(int num) {
        if (d){
           try{
               wait(100);
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
        }
        System.out.println("setnum"+this.num);
        this.num = num;
        d=true;
        notify();
    }
}
class producer implements Runnable{
    q w;

    public producer(q w) {
        this.w = w;
      Thread t1=new Thread(this,"producer");
      t1.start();
    }
int i=0;
    @Override
    public void run() {
        while (true){
            w.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class consumer implements Runnable{
    q w;
    public consumer(q w) {
        this.w = w;
        Thread t2=new Thread(this,"consumer");
        t2.start();
    }
    @Override
    public void run() {
      while (true){
          w.getNum();
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
    }
}

public class interthread {
    public static void main(String[] args) {
        q e=new q();
        consumer f=new consumer(e);
        producer b=new producer(e);

    }
}
