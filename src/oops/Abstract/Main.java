package oops.Abstract;

public class Main {
    public static void main(String[] args) {
        Son obj =new Son(3);
        obj.career();
        daguhter d=new daguhter(7);
        d.patner();
//        Parent ob=new Parent() ;
//        we cant create parent class object
//        because if we create the object we will access the methods of class
//        but in parent class the methods dont have body so that we cant create object

        Parent.msg();


    }
}
