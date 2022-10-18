class Shoe 
{
    int price;
    int size;
    String color;   //instances of the class
    String brand;
    public void pend()//non static method
    {
        System.out.println(brand+"\n"+color+"\n"+price+"\n"+size);//
    }
    
}
class Shoe_classob
{
    public static void main(String[]aa)
    {
        Shoe a = new Shoe();
        a.brand="nike";
        a.color="white";
        a.price=5000;
        a.size=8;
        //System.out.println(a.brand+"\n"+a.color+"\n"+a.price+"\n"+a.size);
        a.pend();

    }
}
