import java.util.Scanner;

public class Reverse 
{
    public static void main(String[]args)
    {
        String a,b;
        System.out.print("Enter the string;");
        Scanner aa=new Scanner(System.in);
        a=aa.nextLine();
        for(int i=a.length()-1;i>=0;i--)
        {
            System.out.println(a.charAt(i));
        }
    }
    
}
