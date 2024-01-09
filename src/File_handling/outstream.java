package File_handling;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class outstream {
    public static void main(String[] args) {
        try (OutputStreamWriter o=new OutputStreamWriter(System.out)){
            o.write("hello");
            o.write(97);
//            it will print the char vale of aski value
            char[]arr="world".toCharArray();
            o.write(arr);
//            we can also print the char array
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
