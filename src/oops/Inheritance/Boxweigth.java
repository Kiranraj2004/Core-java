package oops.Inheritance;

public class Boxweigth  extends Box{
    double weigth,h;
    Boxweigth(){
        this.weigth=-1;
    }
    Boxweigth(double heigth,double width,double length,double weight ){
//        this.h=heigth;
//        this.w=width;
//        this.l=length;

//        super key word is use to call the constructor in parent class
//        and we have to pass the argument as same in the parent class constructor
        super(heigth,width,length);
        this.weigth=weight;
//        we cant access the private of parent class to child class
//        this.l;
//        System.out.println(super.h);
//        if you have same object in both class but you have to access the parent class
//        object then you have to use super keyword
//        if you use this.h it will initialize in this class it self
    }
}
