package enums_example;

public class enums {
    enum weeks implements a{
        Monday,tuesday,wednesday,
//        this are final,static ,public
//        since final you can crete child enums
//        type is weeks
  sunday;
        weeks() {
            System.out.println("nhce"+this);
        }

        @Override
        public void display() {
            System.out.println("hello world");
        }
//        we can implements as many interface but not class
    }
    public static void main(String[] args) {
//              weeks e;
//              e=weeks.Monday;
//        System.out.println(e);
////        we can iterate over the week
//        for (weeks d:weeks.values()) {
//            System.out.println(d);
//        }
//        e.display();
        weeks s=weeks.Monday;
        System.out.println(s.toString());
//        it will print first word monday

    }
}
