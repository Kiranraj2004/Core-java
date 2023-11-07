package oops;
 class a{
     final int nums=0;
      String name;
      a(){

      }
       public a(String name){
           this.name=name;
       }
 }
public class Final {
    public static void main(String[] args) {
         final int a=2;
//         always initialize while declaring variable
//         a=2; we cant change any value after giving final value
//       final
     final  a b=new a("kiran");
//        b=new a("ooooooo");
        System.out.println(b.name);
//        we cant assining another number to b.nums this is why we created final keyword
//        b.nums=2;
//       b=new a();



    }
}
