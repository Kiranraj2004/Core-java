package oops.polymorphism;

public class Circle extends Shapes{
    @Override
//    this is a notation to check whether the method is overrides

    void area(){
        System.out.println("the area of circle is pie*r*r ");
    }


//    were the child class has method which having same name and parameter
//    which has in parent class then it is called as runtime polymorphism/
//    method over riding / dynamic polymorphism
//
//    @Override this will give you error because static method does not
//    override because it does not depend on object
  static void edge(){
    System.out.println(" circle has  no edges ");
}

}
