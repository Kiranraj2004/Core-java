package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwriter {
    public static void main(String[] args) {
        try(BufferedWriter b=new BufferedWriter(new FileWriter("/Users/USER/Desktop/java programing/core java/src/File_handling/note.txt",true))) {
b.flush();

 b.write("bengaluru");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
