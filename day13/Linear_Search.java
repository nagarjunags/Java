import java.util.*;
class Linear_Search 
{
       public static void main(String[]args)
       {
            System.out.print("Enter the size of the array:");
            Scanner aa = new Scanner(System.in);
            int n = aa.nextInt();
            int[] a = new int[n];
            System.out.println("Enter the array elements:");
            for(int i = 0;i<n;i++)
            {
                a[i]=aa.nextInt();
            }
            System.out.print("Enter the Key:");
            int key = aa.nextInt();
            for(int i =0;i<n;i++)
            {
                if(a[i]==key)
                {
                    System.out.println(key+" found in index "+i);
                    break;
                }
            }
       }
}
