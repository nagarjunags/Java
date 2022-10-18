//Upcastig..------------------------------------------
import javax.sound.sampled.SourceDataLine;

class Vehicle
{
    void start()
    {
        System.out.println("vehicle start");
        
    }
    void stop()
    {
        System.out.println("vehicle stops");
    }
}
class Car extends Vehicle
{
    String carcolor="red";

}
class Bus extends Vehicle
{
    String buscolor="white";
}
public class Upcast_hirarchical 
{
    
    public static void main(String[]args)
    {
        Vehicle a= new Car(),b=new Bus();
        a.start();
        b.start();
        a.stop();
        b.stop();
        /*a.carcolor*/ //error we cant access child class members in upcasting.

        
    }
    

}
