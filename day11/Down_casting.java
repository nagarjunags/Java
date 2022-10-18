/*casting is of two types
 * 
 */
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
public class Down_casting 
{
    
    public static void main(String[]args)
    {
        Vehicle a = new Car(),b =new Bus();//upcasting
        a.start();
        b.start();
        a.stop();
        b.stop();
        /*a.carcolor*/ //error we cant access child class members in upcasting.
        Car c =(Car)a;//down casting Specialization
        c.start();
        System.out.println(c.carcolor);
        System.out.println(a instanceof Bus);
        System.out.println(a instanceof Car);
        System.out.println(a instanceof Vehicle);
        System.out.println(b instanceof Bus);
        System.out.println(b instanceof Car);
        System.out.println(b instanceof Vehicle);
    }
    

}
