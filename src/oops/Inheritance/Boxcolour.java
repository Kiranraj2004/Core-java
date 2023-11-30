package oops.Inheritance;

public class Boxcolour extends Boxweigth {
    String colour;
    Boxcolour(double heigth,double width,double length,double weight,String colour){
        super(heigth,width,length,weight);
        this.colour=colour;
    }
    Boxcolour(double size,String colour){
        super(size);
        this.colour=colour;
    }
}
