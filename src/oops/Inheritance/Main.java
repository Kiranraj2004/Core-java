package oops.Inheritance;
import oops.polymorphism.Circle;
public class Main {
    public static void main(String[] args) {
        Box n=new Box();
//        we cant access the private thing out side the that class even if we create the
//        object we cant access the element
//        System.out.println(n.l);
//        Box d=new Box(2);
//        System.out.println(d.h);
//        Box a=new Box(d);
//        System.out.println("copying the values of d box values into a box "+a.l);
//        Boxweigth x=new Boxweigth();
//        Boxweigth q=new Boxweigth(1,2,3,4);
//        System.out.println(d.w);
//        System.out.println(q.h);
//        Box z=new Boxweigth(3,4,5,1);
//        we cant access the weight object when we have refrenceing parent class we cant
//        access the child object
//        System.out.println(z.weigth);

//     Boxweigth z=new Box();
//        we cant reference the child class to parent class
//        but in the above example we can reference the parent to child but you cant
//        access the child class object
        Boxcolour s=new Boxcolour(1,2,3,4,"blue");
        System.out.println(s.colour);
         Boxcolour d=new Boxcolour(3,"green");
         d.get();


    }

}
