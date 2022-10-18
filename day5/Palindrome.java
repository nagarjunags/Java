import java.util.*;
class Palindrome 
{
    public static void main(String[]args)
    {
        int n,a=0,temp;
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=nn.nextInt();
        temp=n;
        while(n>0)
        {
            a*=10;
            a+=n%10;
            n/=10;
        }
        System.out.println("input is:"+temp);
        System.out.println("reversed:"+a);
        if(a==temp)
            System.out.println("It is palindrome");
        else
            System.out.println("not a palindrome");    
    }    
}
