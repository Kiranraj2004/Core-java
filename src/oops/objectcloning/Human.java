package oops.objectcloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] data;

    public Human(String name,int age) {
        this.name = name;
        this.age=age;
        this.data=new int[]{1,2,3,4};
    }

//    public Human(Human other) {
//        this .age=other.age;
//        this.name=other.name;
//    }
//    public Object clone() throws CloneNotSupportedException {
////        this is a shallow copy
//       return super.clone();
//    }
//    this method is efficient ans fast then to copy the object

    public Object clone() throws CloneNotSupportedException {
//        this is a deep copy copy
        Human twin=(Human) super.clone();
        twin.data=new int[twin.data.length];
        for (int i = 0; i <data.length ; i++) {
            twin.data[i]=this.data[i];
        }
        return twin;
    }

}
