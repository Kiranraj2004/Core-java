package oops.objectcloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human s=new Human("kiran",12);
//        Human d=new Human(s);
        Human t=(Human)s.clone();
        System.out.println(t.name);
        System.out.println(Arrays.toString(t.data));
        t.data[0]=10;
//        it will change the main s object data also because its goind to shallow copy
//        the original it will create the object gor only primitive data type
//        and it not create the object rather then it will reference the original once
        System.out.println(Arrays.toString(s.data));

    }
}
