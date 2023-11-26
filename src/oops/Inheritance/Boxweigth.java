package oops.Inheritance;

public class Boxweigth  extends Box{
    double weigth;
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
    }
}
