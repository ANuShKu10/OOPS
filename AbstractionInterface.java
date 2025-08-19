//Parent abstract class
abstract class Vehicle{
    private String vehicleID;
    //constructor for initialization
    public Vehicle(String id){
        this.vehicleID = id;
    }
    //to print vehicle ID
    public String getVehicleID(){
        return "Vehicle ID is " + vehicleID;
    }
    //abstract method
    public abstract void startEngine();
}

//interface 
interface Drivable{
    void accelerate();
    void brake();
}

//child class
class Car extends Vehicle implements Drivable{
    public Car(String id){
        super(id);
    }
    @Override
    public void startEngine(){
        System.out.println("Engine is starting up");
    }

    @Override
    public void accelerate(){
        System.out.println("Car is speeding up");
    }

    @Override
    public void brake(){
        System.out.println("Car is slowing");
    }

}

//main
public class AbstractionInterface {
    public static void main(String[] args){
        Car myCar1 = new Car("VID345");
        System.out.println(myCar1.getVehicleID());
        myCar1.startEngine();
        myCar1.accelerate();
        myCar1.brake();

    }
    
}
