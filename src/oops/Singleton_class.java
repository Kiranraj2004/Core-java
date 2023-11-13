package oops;

public class Singleton_class {
//   private Singleton_class(){
//
//    }
    private Singleton_class instance;

   Singleton_class getInstance() {
        if (instance==null){
            instance=new Singleton_class();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton_class s=new Singleton_class();
        Singleton_class a=new Singleton_class();
//        all three are pointing to single object
    }
}
