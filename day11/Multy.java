
class A
{
    int a=10;
}
class B extends A
{
    int b=20;
}
class C extends B
{
    int c =30;
}
class Multy
{
    
    public static void main(String[]args)
    {
        C d=new C();
        System.out.println(d.a+"\t"+d.b+"\t"+d.c);
    }

}
