package oops.Access;

public class Subclass1 extends accessmodifier{
//    this subclass which going to inherited by parent class
public static void main(String[] args) {
    Subclass1 obj=new Subclass1();
//        we can access the protected member in the subclass
    obj.protec=2;
    System.out.println( obj.protec);
//        we can access the public member
    obj.pub=3;
    System.out.println(obj.pub);
//        we access the default member;
    obj.defult="kiran";
    System.out.println(obj.defult);
//        we cant access the private member directly
//        obj.priva;
//        to  access the private member we can use getters and setters
//        example
    obj.setters(10);
//        the above function will set the value to the object

    System.out.println(obj.getters());
//        the above function getters it will return the the value
}
}
