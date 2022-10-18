class Car
{
    void start()
    {
        System.out.println("Car start");
    }
    void stop()
    {
        System.out.println("Car stopped");
    }
}
class Bmw extends Car
{
    void airbag()
    {
        System.out.println("Airbag!");
    }
}
class Maruti extends Car
{
    
}
public class Car_multy {
    public static void main(String[]args)
    {
        Bmw b =new Bmw();
        b.airbag();
        b.start();
        b.stop();
        Maruti a = new Maruti();
        a.start();
        a.stop();
    }
    
}
