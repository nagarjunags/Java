//example program for Interface3

/*interface A 
{
    void m1();//implicitely public abstract is given  
}
class B implements A
{
    public void m1()
    {
        System.out.println("m1 method");
    }
}
public class Inter 
{
    public static void main(String[]args)
    {
        A a = new B();
        a.m1();
    }
}

--------------------------------OR------------------------------------------- */
interface A
{
    void m1();
}
abstract class B implements A
{

}
class C extends B
{
    public void m1()
    {
        System.out.println("m1");
    }
}
 
