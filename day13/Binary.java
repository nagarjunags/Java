import java.util.Scanner;

class Binary 
{
    public static void main(String[]args)
    {
        System.out.print("Enter the size of the array:");
        Scanner aa = new Scanner(System.in);
        int n = aa.nextInt();
        int[]a = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=aa.nextInt();
        }
        int start=0,end=n-1;
        
        System.out.print("Enter the search element:");
        int key=aa.nextInt();
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(key==a[mid])
            {
                System.out.println(key+" is found in index "+mid);
                return;
            }
            else if(key>a[mid])
                start=mid+1;
            else if (key<a[mid] )
                end = mid-1;    

        }
    }    
}
