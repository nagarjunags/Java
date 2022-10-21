import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[]args)
    {
        int flag=0;
        System.out.print("Enter the string:");
        Scanner aa = new Scanner(System.in);
        String a =aa.nextLine();
        for(int i =0;i<a.length()/2;i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-i-1))
            {
                flag=1;
                break; 
            }
        }
        if(flag!=1)
            System.out.println("It is a Palindrome");
        else
            System.out.println("Not a palindrome");    
    }   
}
class Sir//thought by sir
{
    public static void main(String[]args)
    {
        String s="malayalam";
        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");    
    }
}
