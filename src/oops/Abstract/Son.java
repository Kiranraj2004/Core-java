package oops.Abstract;

public class Son extends Parent {
    Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("my name  is coder");
    }

    @Override
    void patner() {
        System.out.println("i love superman");
    }
}
