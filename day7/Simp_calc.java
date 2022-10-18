import java.util.Scanner;

class Simp_calc 
{
    int addd(int a,int b)
    {
        return(a+b);
    }
    int diff(int a, int b)
    {
        return(a-b);
    }
    int product(int a,int b)
    {
        return(a*b);
    }    
    public static void main(String[] args)
    {
        Scanner nn = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a = nn.nextInt();
        System.out.print("enter 2nd number:");
        int b = nn.nextInt();
        Simp_calc d = new Simp_calc();
        System.out.println("sum="+d.addd(a, b)+"\ndifference="+d.diff(a, b)+"\nProduct="+d.product(a, b));

    }
}