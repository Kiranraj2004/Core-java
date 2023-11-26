package oops.Inheritance;

public class Box {
    double w,h;
    private double l;
    Box (){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }
    Box (double heigth,double width,double length){
        this.h=heigth;
        this.w=width;
        this.l=length;
    }
    Box (double size){
        this.h=size;
        this.w=size;
        this.l=size;
    }
//    copy constructor
    Box (Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }

}
