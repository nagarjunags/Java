class Father
{
    Father(int a)
    {
        System.out.println("hI FATHER");
    }
}
class Son extends Father
{
 Son()
 {
    super(10);
    System.out.println("Hello Son");
 }   
}
public class Super_constructor 
{
    public static void main(String[] args)
    {
        new Son();
    }
}
