package oops.EXCEPTIONHANDLING;

public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=10;
//        this is the uncheck exceptional handling here  the number is not going to
//        divide from 0
        try{

          divide(b,a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this fill always executed");
        }

    }
    static int divide(int a,int b){
        if (a==0){
            throw new RuntimeException();
        }
        return b/a;
    }

}
