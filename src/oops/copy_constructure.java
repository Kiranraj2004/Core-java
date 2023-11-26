package oops;

public class copy_constructure {
    double l;
    copy_constructure(double length){
        this.l=length;
    }
//    copying the old constructor to new once
    copy_constructure(copy_constructure old){
        this.l=old.l;
    }

    public static void main(String[] args) {
        copy_constructure s=new copy_constructure(3);
        System.out.println(s.l);
        copy_constructure f=new copy_constructure(s);
        System.out.println(f.l);
    }
}
