package Vehical_project;

public class Main {
    public static void main(String[] args) {
        jeep a=new jeep();
        a.createvehical(2,4,2);
        a.move(0,0);
        a.acceleration(10,0);
        a.operationofmusic(true);
        a.acceleration(100,0);
        a.acceleration(10,1);
        a.stop();
        a.display();
    }
}
