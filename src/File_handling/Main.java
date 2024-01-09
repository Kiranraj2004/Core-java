package File_handling;

import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
      try(InputStreamReader isr=new InputStreamReader(System.in)){
          System.out.println("enter some letter");
          int l=isr.read();
          while (isr.ready()){
//              this print statement will give bit code or aski value of that character
              System.out.println(l);
//              this print statement will gives number or character
              System.out.println((char)l);
              l=isr.read();
          }
          isr.close();
//          it will show a error because the stream is close after closing we cant write
//          isr.read();
          isr.read();
//          isr.close();
      } catch (IOException e) {
          System.out.println("error");
//          this catch will execute on when object is close and then also we use the read
//           stream
//          throw new RuntimeException(e);
      }
    }
}
