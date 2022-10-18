import java.util.*;
class Factorial
{
    public static void main(String[]args)
    {
        long n,a=1,temp;
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=nn.nextLong();
        temp=n;
        while(n>0)
        {
            a*=n;
            n-=1;
            
        }
        System.out.println("factorial:"+a);  
    }    
}
class Factorial2
{
    public static void main(String[]args)
    {
        int n,a=1,sum=0,temp,tempp;
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=nn.nextInt();
        tempp=n;
        while(n>0)
        {
            temp=n%10;
            n/=10;
            a=1;
            while(temp>0)
            {
                a*=temp;
                temp-=1;
            }
            sum+=a;

        }
        System.out.println("sum="+sum);
        if(tempp==sum)
            System.out.println("Strong number");
        else    
            System.out.println("not a strong number");    
    }
}
class Float
{
    public static void main(String[]args)
    {
        float a;
        a=10F;
        System.out.println(a);
    }
}    
