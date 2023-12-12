package Vehical_project;

public class car extends vehical {
    public car(String name) {
        super(name);
    }
    private int wheels,seat;
    private int doors;
    public void createvehical(int doors,int wheels,int seat){
       this.seat=seat;
        this.doors=doors;
        this.wheels=wheels;
    }
    public void acceleration(int speed,int direction){
        setSpeed(speed);
        this.direction=direction;
        if (direction==1){
            setGears(-1);
            System.out.println("car is going in reverse");
        }
       else{
           changegear();
       }
    }
    public void changegear(){
        int currentspeed=getSpeed();
       if (currentspeed==0){
           setGears(0);
        } else if (currentspeed>=0&&currentspeed<=10) {
           setGears(1);
       }
       else if (currentspeed>10&&currentspeed<=30) {
           setGears(2);
       }
       else if (currentspeed>30&&currentspeed<=50) {
           setGears(3);
       }
       else if (currentspeed>50&&currentspeed<=80) {
           setGears(4);
       }
       else if (currentspeed>80&&currentspeed<=100) {
           setGears(5);
       }
    }
}
