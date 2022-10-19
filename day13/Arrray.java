import java.util.*;
class Arrray 
{
    public static void main(String[]args)
    {
        
        System.out.print("Enter size of the Array:");
        Scanner aa=new Scanner(System.in);
        int n = aa.nextInt();
        int a[]=new int[n] ;
        System.out.println("enter "+n+" elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=aa.nextInt();
        } 
        System.out.print("entered elements are:");
        for(int i=0;i<n;i++)
        {
            
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }    
}
