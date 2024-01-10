package File_handling;

import java.io.File;
import java.io.IOException;
public class creatingnewfile {
    public static void main(String[] args) {
        try{
            File f=new File("/Users/USER/Desktop/java programing/core java/src/File_handling/note1.txt");
            f.createNewFile();
//            f.delete();
            f.compareTo(new File("/Users/USER/Desktop/java programing/core java/src/File_handling/note.txt"));
           f.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
