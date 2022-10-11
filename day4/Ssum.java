import java.util.*;
class Ssum 
{
    public static void main(String[]args)
    {
        long n;
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=nn.nextLong();
        long sum;
        do
        {
            sum=0;
            while(n>0)
            {
                long r=n%10;
                sum+=r;
                n/=10;
            }
            System.out.println(sum);
            n=sum;
        }
        while(sum>9);
    }   
}
