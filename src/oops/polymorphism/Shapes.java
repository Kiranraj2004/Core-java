package oops.polymorphism;

//we can use final keyword to class as well to method
public  class Shapes {

 void area(){
        System.out.println("I'm in the every shapes ");
    }
    void area(int a){
        System.out.println("area of square is side square  ");
    }

//    there are two area in the same class
//    but it has different parameter this is called compile time polymorphism /
//    method overloding /static polymorphism

    static void edge(){
        System.out.println("every shapes has edges except circle has no edges ");
    }
}
