package Vehical_project;

public class jeep extends car{

    public jeep() {
        super("thar");
        display();
    }

    boolean music_system;
    public void operationofmusic(boolean music_syste){
        this.music_system=music_syste;

    }

    public void display(){
        System.out.println("your car name is :"+getName());
        System.out.println("speed :"+getSpeed());
        System.out.println("Gear :"+getGears());
        System.out.println("direction :"+getDirection());
        if (!music_system||this.direction==-1) {
            System.out.println("music is off");
        } else {
            System.out.println("music is on track");
        }
    }
}
