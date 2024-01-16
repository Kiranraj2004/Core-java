package oops;

public class Human_1 extends Human{
    Human_1(int age, String name, boolean married) {
        super(age, name, married);
    }

    public static void main(String[] args) {
        Human mithun=new Human(12,"mithun",false);
        System.out.println(mithun.age);
        System.out.println(Human.population);
        System.out.println(mithun.married);
    }
}
