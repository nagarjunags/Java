import java.io.*;
import java.util.*;
class Google 
{
    public static void main(String[]args)
    
    {
        String a;
        int size;
        Scanner aa = new Scanner(System.in);
        a=aa.nextLine();
        size=a.length();
        for(int i=0;i<size-1;i++)
        {
            
            if(a.charAt(i)==a.charAt(i+1))
            {
                System.out.println(a.charAt(i)+" is repeated");

            }
                
        }
        
    }   
}
