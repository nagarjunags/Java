class Lobi 
{
    public void parimala()
    {
        System.out.println("I am not coming");
    }    
}
class Prabhi extends Lobi
{
    public void parimala()
    {
        System.out.println("for you i can give my heart");//when method is overrided then the child class member is executed even though the class is upcasted.
    }
}
class Run
{
    public static void main(String[]args)
    {
        Lobi a = new Prabhi();
        a.parimala();
    }
}
