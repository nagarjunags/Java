import java.util.*;
class Xylem_phloem 
{
    public static void main(String[]args)
    {
        int n,temp,c=0,sum=0,sum1=0;
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=nn.nextInt();
        temp=n;
        while(temp>0)
        {
            c++;
            temp/=10;
        }
   
        temp=n;
        for (int i = 0;i<c;i++)
        {
            int a=temp%10;
            temp/=10;
            if((i==0)||(i==c-1))
            {
                sum1+=a;
                continue;
            }
            sum+=a;


        }
        System.out.println("inner sum="+sum);
        System.out.println("outer sum="+sum1);
        if(sum==sum1)
            System.out.println("xylem");
        else
            System.out.println("phloem");    
    }    
}
