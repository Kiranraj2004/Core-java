package oops;
import java.util.*;

class new_horizon{
    String name;
    int usnnumber;
    long phonenumber;
    String department="AIML";
//    new_horizon() {
//        System.out.println("enter your name,usnnumber,phone number");
//    }
    void insert(String nm,int usn ,long phone){
        name=nm;
        usnnumber=usn;
        phonenumber=phone;
    }
    void displaying(){
        System.out.println("NAME : "+this.name);
        System.out.println("USN_NUMBER :" +usnnumber);
        System.out.println("PHONE_NUMBER :" +phonenumber);
        System.out.println("DEPARTEMNT :" +department);

    }

}
public class Student_class_project {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many student details you have to enter : " );
        int n=input.nextInt();
        new_horizon[] arr =new new_horizon[n];
        for (int i = 0; i <n; i++) {
             arr[i]=new new_horizon();
        }
        for (int i = 0; i <n ; i++) {
            System.out.println("enter your name");
            String nm=input.nextLine();

            System.out.println("enter your usn");
            int usn=input.nextInt();

            System.out.println("enter your phone_number");
            long phone= input.nextLong();
            arr[i].insert(nm,usn,phone);
        }
        System.out.println("displaying student details");
        for (int i = 0; i <n ; i++) {
            arr[i].displaying();
        }
    }
}
