package oops;

public class Static_block {
    static int  a=10;
    static int b;
//    static will run once,when the first obj is created
    static {
        System.out.println("b value is initalize ");
        b=a*3;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
//        static
//        {
//          b=a+1;
//        }
        a=2;
        Static_block obj=new Static_block();
        System.out.println(obj.a +" ");
        b=9;
        System.out.println(b);
        Static_block o=new Static_block();
        System.out.println(Static_block.a);
    }
}
