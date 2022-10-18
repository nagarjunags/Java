import java.util.Scanner;

class Car
{
    String color,brand;
    int speed,price,seats;
    public void pprint()
    {
        System.out.println("clolur="+color+"\nbrand="+brand+"\nspeed="+speed+"\nprice="+price+"\nseats="+seats);
    }

}

class Car_class 
{
    
    public static void main(String[]aa)
    {
        Car a =new Car();// creating object(Constructor.(constructor is always created by using class name))
        Scanner aaa=new Scanner(System.in);
        System.out.print("emter speed:");
        a.speed=aaa.nextInt();
        System.out.print("price:");
        a.price=aaa.nextInt();
        System.out.print("seat");
        a.seats=aaa.nextInt();
        Scanner bbb=new Scanner(System.in);
        System.out.print("colour:");
        a.color=bbb.nextLine();
        System.out.print("Brand:");
        a.brand=bbb.nextLine();
        a.pprint();
        
        
    }
}
