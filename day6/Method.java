import java.util.*;
class Method
{
    public static void main(String[]args)
    {
        Scanner nn = new Scanner(System.in);
        int c = nn.nextInt();
        System.out.println("main Starts");
        method();
        methodwitharg(c);
        A1.notmain();//calling mothod outside the class
        System.out.println("main ends");
        

    }
    public static void method()
    {
        System.out.println("method starts");
        System.out.println("method ends");
    }
    public static void methodwitharg(int a)
    {
        System.out.println("methodwitharg starts");
        System.out.println("argument passed ="+a);
        method();
        System.out.println("methodwitharg ends");
    }
}
class A1
{
    public static void notmain()
    {
        System.out.println("notmain starts");
        System.out.println("not main ends");
    }
}