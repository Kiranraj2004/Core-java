package Vehical_project;

public class vehical{
    private String name;
   private int gears;

    public void setGears(int gears) {
        this.gears = gears;
    }

   private int speed;
    int direction;

     public void stop(){
         this.speed=0;
         this.gears=0;
         this.direction=-1;
     }
     public void move(int speed,int direction){
         this.speed=speed;
         this.direction=direction;

     }

    public vehical(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public String getName() {
        return name;
    }

    public int getDirection() {
        return direction;
    }
}
