class Father
{
    public void bike()
    {
 
        {
            System.out.println("rx 100");
        }
    }
}
class Son extends Father
{
    @Override
    public void bike()
    {
        System.out.println("RX 200");
    }
}
 class Ooverride
{
    public static void main(String[]args)
    {
    Father a =new Son();
    a.bike();
    }
}