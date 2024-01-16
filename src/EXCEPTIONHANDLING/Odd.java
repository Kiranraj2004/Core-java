package EXCEPTIONHANDLING;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the odd number ");
        int a=input.nextInt();
        try {
            odd(a);
        }catch (Exception w){
            System.out.println("please enter odd number");
//            System.out.println(w.getMessage());
        }

//        System.out.println(" thanks for entering odd number ");


    }
    static void odd(int a){
        if (a%2==0){
            throw new RuntimeException();
        }
        System.out.println(" thanks for entering odd number ");
    }
}
