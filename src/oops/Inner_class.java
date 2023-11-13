package oops;

//import java.util.Arrays;

public class Inner_class {
//    if you dont use static it will be depended on outer class
    static class a{
        String name;
        a(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        a x=new a("kiran");
//        Arrays.toString(new int[]{1,2,3,4
//        });
        System.out.println(x.name);
    }
}
