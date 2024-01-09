package File_handling;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        try(FileWriter f=new FileWriter("/Users/USER/Desktop/java programing/core java/src/File_handling/note.txt",true)){
//            f.write("nhce");
//            it will override the original text which is already exist
            f.append("nhce");
//            before apppendeing the string we have to give true in beside the file name
            f.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
