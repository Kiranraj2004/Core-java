package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practice {
    public static void main(String[] args) {
//        this ia the another byte stream in which it is a output stream
//        it is used for represent the error it will display in red colour
//        System.err.println("This is an error message.");
        try (BufferedReader ob=new BufferedReader(new FileReader("D:/Atomic Habits by James Clear.pdf"))){
//            ob.read();
            while(ob.ready()){
                System.out.println(ob.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
