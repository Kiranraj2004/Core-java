package oops;

public class Class {
    public static void main(String[] args) {
//        declaring a student1 object
        student kiran;
//        initalizing
        kiran=new student();
//        System.out.println(student1.marks);0.0
//        System.out.println(student1.name);null
//
        kiran.rollnumber=75;
        kiran.name="kiran raj b";
        kiran.marks=9.8f;
        System.out.println(kiran.name);
        System.out.println(kiran.rollnumber);
        System.out.println(kiran.marks);


    }
}
class student{
    int rollnumber;
    String name;
    float marks;
}
