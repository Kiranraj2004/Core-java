package oops.Interface;

public class Main {
    public static void main(String[] args) {
        car s=new car();
        s.aceleerate();
        s.start();
        s.stop();
        int o=s.a;
        s.power();

        outer g=new outer();
        System.out.println(g.odd(3));
    }
}
