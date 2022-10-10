class Ssum 
{
    public static void main(String[]args)
    {
        int n=1234;
        int sum;
        do
        {
            sum=0;
            while(n>0)
            {
                int r=n%10;
                sum+=r;
                n/=10;
            }
            System.out.println(sum);
            n=sum;
        }
        while(sum>9);
    }   
}
