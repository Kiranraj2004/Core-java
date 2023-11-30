package oops;

public class Static_block {
    static int  a=10;
    static String name;
    static {
        name="nhce";
        System.out.println(name);
    }
    static int b;
//    static will run once,when the first obj is created
    static {
        System.out.println("b value is initalize ");
        b=a*3;
    }

    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(b);
////        static
////        {
////          b=a+1;
////        }
//        a=2;
        Static_block obj=new Static_block();
//        System.out.println(a +" ");
//        b=9;
//        System.out.println(b);
        System.out.println(Static_block.name);
        Static_block o=new Static_block();
        o.name="nhc";
        System.out.println(o.name);
        System.out.println(obj.name);


//        System.out.println(Static_block.a);
//        System.out.println(name);
//        name="kiran";
//        System.out.println(name);

    }
}
