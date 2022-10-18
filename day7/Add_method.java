import java.util.Scanner;

class Add_method 
{
    int add(int s,int t)//(a and b are formal arguments)
    {
        int c =s+t;
        return c;

    }
    public static void main(String[] args)
    {
        Scanner aa=new  Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = aa.nextInt();
        System.out.print("Enter the second number:");
        int b = aa.nextInt();
        Add_method d = new Add_method();
        int x = d.add(a, b);// a and b are actual arguments
        System.out.println("Sum="+x);

    }
    
}
