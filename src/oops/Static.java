package oops;

public class Static {
    static int a;
    public static void main(String[] args) {
//        System.out.println("hello world" );
//        fun();
        Static d=new Static();
        d.a=2;
        System.out.println(d.a);
        Static w=new Static();
        w.a=0;
        System.out.println(d.a);
//        static variable is same for every object if you change from one variable
//        automatically it will change for another variable


    }
static void fun(){
//        this methods are not depended on object
//    with out static we cant we the methods
       Static obj=new Static();
       obj.fun1();
}
void fun1(){
//      this depends on objects or instance
    System.out.println("bengaluru");
}
}
