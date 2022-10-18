class A
{
    int a=10;

}
class B extends A
{
    int b=20;
}
public class Casting 
{
    public static void main(String[]args)
    {
        A a= new B();
        System.out.println(a.a);
        System.out.println(a.b);//error we cant access child class members with help of parent object refference
    }
}
