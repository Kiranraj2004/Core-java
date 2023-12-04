package oops.polymorphism;
import  static oops.polymorphism.Circle.edge;
public class Main {
    public static void main(String[] args) {
//        we can't access parents class methods by creating reference variable of child
//        class and reference object of parent class
//   Circle obj=new Shapes();

        Circle obj=new Circle();
//        obj.area();
        Shapes f=new Circle();
        f.area();
//        we can access the parent properties when we create reference variable of parent
//        class and reference object of child class
//        in above declaration the left hand side will access the properties
//        where as the right hand side wil show were the object is referencing to
        f.area(3);
        f.edge();
//        it will give the parent static method output it self because the reference
//        variable of class parent it will access the parent properties
//        obj.edge();
//        it will give child class output because the reference variable of type
//        child class
        Circle.edge();
//        if you have to call the static method please use class name because it does not
//        depend on object
        Main s=new Main();
        edge();

    }
}
