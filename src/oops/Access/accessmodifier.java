package oops.Access;

public class accessmodifier {
//   this is the main class
   static int a;
   protected int protec;
   public int pub;
   String defult;
   private int priva;
//   we can access the protected member in any where except
//    class created in different package but which is not a subclass
//   accessmodifier(int data){
//       this.protec =data;
//   }
   void setters(int data){
      this.priva=data;
   }
   int  getters(){
      return this.priva;
   }

   public static void main(String[] args) {
//      there we can access the all the access modified member
   }
}
