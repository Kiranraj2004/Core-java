package oops.Abstract;

//we cant use final word to class because we need to inherit the class
public  abstract class Parent {
//    if any one method in class are abstract then the class should be define
//    as abstract


//    always the abstract methods has no body because it need to ovrride
//    by child class
    abstract void career();
    abstract void patner();

//    we can also create constructor
    int age;
    Parent(int age){
        this.age=age;
    }
//    abstract static void masg();
//    also we cant create abstract static method because statis methods are cant
//    override
//    but we can create static methods in this class
     static void msg(){
         System.out.println("hello everyone ");
     }

     void normal(){
         System.out.println("this are the normal methods ");
     }
}
