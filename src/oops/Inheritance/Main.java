package oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box n=new Box();
//        we cant access the private thing out side the that class even if we create the
//        object we cant access the element
//        System.out.println(n.l);
        Box d=new Box(2);
        System.out.println(d.h);
        Box a=new Box(d);
//        System.out.println("copying the values of d box values into a box "+a.l);
        Boxweigth x=new Boxweigth();
        Boxweigth q=new Boxweigth(1,2,3,4);
        System.out.println(q.h);

    }

}
