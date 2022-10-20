public class Last 
{
    public static void main(String[]args)
    {
        int loop=0;
    
    int[] a={1,2,3,4,5};
    int size=5;
    for(int i=0;i<3;i++)
    {
        loop++;
       int temp=a[0];
       for(int j=0;j<size-1;j++)
       {
        loop++;
        a[j]=a[j+1];
       }
       a[size-1]=temp;

    }
    for(int i=0;i<5;i++)
    {
        loop++;
        System.out.println(a[i]);
    }
    System.out.println("Loop="+loop);

    }    
}
