package File_handling;

import java.io.*;

public class bufferreader {
    public static void main(String[] args) {
//        we use buffer reader because it will read at once
//        inputstreamreader will take the input in form of byte and
//        it is converted into char stream and then reading char stream
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("enter your name: ");
            System.out.println( br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br=new BufferedReader(new FileReader("/Users/USER/Desktop/java programing/core java/src/File_handling/note.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }
        catch (IOException e){
            System.err.println("file not found");
        }


    }
}
