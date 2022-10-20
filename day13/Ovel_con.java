import java.util.Scanner;
public class Ovel_con 
{
    public static void main(String[]args)
    {
        System.out.print("Enter the size of  array:");
        Scanner aa = new Scanner(System.in);
        int n=aa.nextInt();
        char a[]=new char[n];
        System.out.println("Enter the Letters:");
        int odd=0,even=0;
        for(int i=0;i<n;i++)
        {
            a[i]=aa.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='o')
            {
                even++;
            }
            else
                odd++;
        }
        System.out.println("Consonents="+odd);
        System.out.println("Ovels ="+even);
    }    
}
