package oops;

public class Static {
    public static void main(String[] args) {
        System.out.println("hello world" );
        fun();
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
