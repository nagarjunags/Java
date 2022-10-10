import java.util.Scanner;

class Count 
{
    public static void main(String[]args)
    {
        int a,c=0;
        Scanner aa =new Scanner(System.in);
        System.out.print("enter the digit:");
        a=aa.nextInt();
        while(a>0)
        {
            a=a/10;
            c+=1;
        }
        System.out.println(c+" digits");
    }
    
}
class Sum 
{
    public static void main(String[]args)
    {
        int a,c=0;
        Scanner aa =new Scanner(System.in);
        System.out.print("enter the digit:");
        a=aa.nextInt();
        while(a>0)
        {
            
            c+=(a%10);
            a=a/10;

        }
        System.out.println("sum of number="+c);
    }
}    