import java.util.Scanner;

class Odd_even 
{
    public static void main(String[]args)
    {
        System.out.print("Enter the size of  array:");
        Scanner aa = new Scanner(System.in);
        int n=aa.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers:");
        int odd=0,even=0;
        for(int i=0;i<n;i++)
        {
            a[i]=aa.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
                odd++;
        }
        System.out.println("Odds="+odd);
        System.out.println("Even="+even);
    }    
}
