class A
{
    int a = 10 ;
}
class B extends A
{
    int a = 20;
}
class Variable_shadowing 
{
    public static void main(String[]args)
    {
        A obj = new B();
        System.out.println(obj.a);
        B abj = new B();
        System.out.println(abj.a);
    }
}
