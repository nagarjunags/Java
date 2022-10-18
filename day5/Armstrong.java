import java.util.*;
class Armstrong 
{
    public static void main(String[]args)
    {
        int n,a,c=0,temp,tempp,sum=0,e;
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=nn.nextInt();
        temp=tempp=n;
        while(n>0)
        {
            n/=10;
            c++;
        }
        System.out.println(c+"=c");
        while(temp>0)
        {
            a=0;
            a=temp%10;
            
            temp/=10;
            for(int i=1;i<c;i++)
            {
                e=a;
                a=a*e;
                //System.out.println("*");
                
            }
            System.out.println(a);
            sum+=a;
        
        }
        System.out.println("sum="+sum);

    }   
}
