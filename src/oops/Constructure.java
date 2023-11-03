package oops;

public class Constructure {
    public static void main(String[] args) {

        students kiran=new students(99,"aryan",9.2f);
//        students();is default constructure
//        kiran.rollnumber=75;
//        kiran.name="kiran raj b";
//        kiran.marks=9.8f;
kiran.print();
students j=new students();
        System.out.println(j.rollnumber);
students l=new students(13,"kiran",90.2f);
        System.out.println(l.rollnumber);
        l.print();

    }
}
class students{
    int rollnumber;
    String name;
    float marks;
     void print(){
         System.out.println("helllo my name is "+this.name);
     }
    students(){
//        this.rollnumber=75;
//        this.name="kiran raj b";
//        this.marks=9.8f;
    }
    students(int roll,String n,float ma){
        rollnumber=roll;
       name=n;
       marks=ma;
    }

}
