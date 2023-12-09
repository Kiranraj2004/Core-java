package oops.Interface;

public interface engine {
   final int a=10;
    void start();
    void stop();
    void aceleerate();
    default void power(){
        System.out.println("hello everyone");
    }

}
