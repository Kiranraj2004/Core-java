package oops.Access1;

import oops.Access.accessmodifier;

public class subclass extends accessmodifier {
    //    this is the subclass which is  inherited from parent class
    public static void main(String[] args) {
//        accessmodifier obj=new accessmodifier();
//        we can not  access the protected member in the subclass using the parent class
//        object because then it will be same as public
//        obj.protec=2;
//        System.out.println( obj.protec);
//        we can access the public member

        subclass obj = new subclass();
        obj.protec = 6;
        System.out.println(obj.protec);
        obj.pub = 3;
        System.out.println(obj.pub);
//        we access the default member;
//        obj.defult="kiran";
//        it showing error because the methods are default methods cannot access in this class

//        System.out.println(obj.defult);
//        we cant access the private member directly
//        obj.priva;
//        to  access the private member we can use getters and setters
//        example
//        obj.setters(10);
//        it showing error because the methods are default methods cannot access in this class

//        the above function will set the value to the object


//        it showing error because the methods are default methods cannot access in this class
//        System.out.println(obj.getters());
//        the above function getters it will return the the value
    }
}
