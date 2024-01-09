package File_handling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class filereader {
    public static void main(String[] args) {
        try(FileReader isr=new FileReader("/Users/USER/Desktop/java programing/core java/src/File_handling/note.txt")){
//            System.out.println("enter some letter");
            int l=isr.read();
            while (isr.ready()){
//              this print statement will give bit code or aski value of that charecter
//                System.out.println(l);
//              this print statement will gives number or charecter
                System.out.print((char)l);
                l=isr.read();
            }
            isr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//
    }
}
