/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Consecutive 
{
	public static void main (String[] args)
	{
	    int t,n;
        Scanner aa = new Scanner(System.in);
        t = aa.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int count=0;
            n=aa.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=aa.nextInt();
            }
            for(int j=0;j<n-1;j++)
            {
                if(a[j]==a[j+1])
                {    
                    count++;
                    if(a[j+1]==0)
                        a[j+1]=1;
                    else
                        a[j+1]=0;
                }    
                
            }
            System.out.println(count);
        }
	}
}
