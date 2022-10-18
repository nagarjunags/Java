abstract class A
{
    abstract void m1();
}
class B extends A
{
    void m1()//either you should define the body of the abstract method or you should make child class also a abstract class
    {
        System.out.println("m1 method");
    }    
}
/*   -------OR-----------
abstract class B extends A
{
    
} */
public class Abs 
{
    public static void main(String[]args)
    {
        A a = new B();
        a.m1();
        B b = new B();
        b.m1();
        //B c = new A();-----------ERROR(we cant create object for abstract class)-----------------------
    }
}
 