package oops;
import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            arr[i]=new Student();
            System.out.println("Enter the details of student " + (i + 1) + ":");
            System.out.print("Enter the name: ");
            String a=scanner.nextLine();
            arr[i].name = a;
            System.out.print("Enter the roll number: ");
            arr[i].rollno = scanner.nextInt();
            System.out.print("Enter the age: ");
            arr[i].age = scanner.nextInt();
            System.out.print("Enter the address: ");
            arr[i].address = scanner.nextLine();
        }
        System.out.println("Here are the details of the students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + arr[i].name);
            System.out.println("Roll number: " + arr[i].rollno);
            System.out.println("Age: " + arr[i].age);
            System.out.println("Address: " + arr[i].address);
        }
//        scanner.close();
    }
}
class Student {
    String name;
    int rollno;
    int age;
    String address;
}