package oops.Interface;

//in interfaces, we can inherit the multilevel inheritance
public class car implements Break,engine {

    @Override
    public void start() {
        System.out.println("i start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like normal car");
    }

    @Override
    public void aceleerate() {
        System.out.println("i accelerate like normal car");
    }

    public static void main(String[] args) {
//        we can use the variables in class which is going to be implements
        System.out.println(a);
    }
}
