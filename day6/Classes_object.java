import javax.sound.sampled.SourceDataLine;

class Pen
{
    String brand="bright"; //non-static variable(instance variables)
    String color;
    double price;
    public void print()
    {

        System.out.println(color);
        System.out.println(price);
        System.out.println(brand);
   
    }
}
class Pendrive
{
    public static void main(String[]aa)
    {
        Pen b=new Pen();
        System.out.println(b);
        System.out.println(b.brand);
        Pen a=new Pen();//now a contains the address of the object(block of memory)
        System.out.println(a);//a is a refference variable
        a.brand="Bright";
        a.color="red";
        a.price=5;
        System.out.println(color);
        System.out.println(price);
        
    }
}