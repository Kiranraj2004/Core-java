package oops;

public class Human {
    int age;
    String name;
    boolean married;
    static long population;


    Human(int age,String name,boolean married){
        this.age=age;
        this.name=name;
        this.married=married;
        Human.population+=1;
//        this.population+=1;
//        if you want to access static object you should access by class name it self
    }
}
