package EXCEPTIONHANDLING;

public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=10;
//        this is the uncheck exceptional handling here  the number is not going to
//        divide from 0
        try{

            System.out.println(divide(a,b));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
//        we cant put expception above because all the expeption will come under this
//        so if we put put it first will be always executed
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this fill always executed");
        }

    }
    static int divide(int a,int b)throws RuntimeException{
        if (a==0){
//            throw new RuntimeException();
            throw new ArithmeticException("please do not divide by zero");
        }
        return b/a;
    }

}
