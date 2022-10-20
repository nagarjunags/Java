import java.util.*;
class MAx_no {
    



    public static void main(String[]args)
    {
        
        System.out.print("Enter size of the Array:");
        Scanner aa=new Scanner(System.in);
        int n = aa.nextInt();
        int a[]=new int[n] ;
        System.out.println("enter "+n+" elements:");
        a[0]=aa.nextInt();
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(i<n-1)
                a[i+1]=aa.nextInt();
            if(max<a[i])
            max=a[i];
        } 
       
       System.out.println("Largest number:"+max);
    }    
}
