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
//              this print statement will give bit code or aski value of that charecter
              System.out.println(l);
//              this print statement will gives number or charecter
              System.out.println((char)l);
              l=isr.read();
          }
          isr.close();
//          it will show a error because the stream is close after closing we cant write
//          isr.read();
//          isr.read();
          isr.close();
      } catch (IOException e) {
          System.out.println("error");
//          throw new RuntimeException(e);
      }
    }
}
