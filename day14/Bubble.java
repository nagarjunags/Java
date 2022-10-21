import java.util.*;
class Bubble 
{
    public static void main(String[]args)
    {
        System.out.print("Enter the size of the array:");
        Scanner aa = new Scanner(System.in);
        int n = aa.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            a[i]=aa.nextInt();            
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted elements:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i!=(a.length-1))
            {
                System.out.print(", ");
            }
            else
                System.out.println();
        }
    }   
}
