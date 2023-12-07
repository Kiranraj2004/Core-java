package oops;

public class objectclass extends Static{
    int num;
    objectclass(int num){
        this.num=num;
    }
    public static void main(String[] args) {
        objectclass obj=new objectclass(2);
        objectclass obj2=new objectclass(2);
        System.out.println(obj.hashCode());
//        it will give some random number
        System.out.println(obj2.hashCode());

        if (obj.num==obj2.num){
            System.out.println("hello");
        }
        if (obj.equals(obj2)){
            System.out.println("hi");
        }

        System.out.println(obj.getClass());
//       it gives the package where it located  class oops.objectclass

        System.out.println(obj instanceof Static);
//        it gives whether the created object is instance of given class
    }

}
