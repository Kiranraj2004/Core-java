package oops;
import java.util.Scanner;

class new_horizon{
    String nam;
    long usnnumber;
    long phonenumber;
//    using default string and assining value to that variable
    String department="AIML";
//    new_horizon() {
//        System.out.println("enter your name,usnnumber,phone number");
//    }
//    void insert(String nm,int usn ,long phone){
//        this.name=nm;
//        this.usnnumber=usn;
//        this.phonenumber=phone;
////        this.department="cse";
//    }
    void displaying(){
        System.out.println("NAME : "+nam);
        System.out.println("USN_NUMBER :" +this.usnnumber);
        System.out.println("PHONE_NUMBER :" +this.phonenumber);
        System.out.println("DEPARTEMNT :" +department);

    }

}
public class Student_class_project {
   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter how many student details you have to enter : " );
        int n=input.nextInt();
        new_horizon[] arr =new new_horizon[n];
        for (int i = 0; i <n; i++) {
             arr[i]=new new_horizon();
        }
        for (int i = 0; i <n ; i++) {
            System.out.println("enter your usn");
            arr[i].usnnumber=input.nextLong();

            System.out.println("enter your phone_number");
            arr[i].phonenumber= input.nextLong();
            System.out.println("enter your name");
            arr[i].nam=input.nextLine();

//            arr[i].insert(nm,usn,phone);
        }
        System.out.println("displaying student details");
        for (int i = 0; i <n ; i++) {
            arr[i].displaying();
        }
    }
}
