import java.util.*;
class Leap 
{
    public static void main(String[]args)
    {
        int a;
        System.out.print("Enter the year:");
        Scanner aa = new Scanner(System.in);
        a=aa.nextInt();
     /*    if(((a%4)==0)&&(a%400==0)||(!(a%100==0)))
            System.out.println("leap year");
        else
            System.out.println("not a leap year");    */
        if(((a%100!=0)&&(a%4==0))||(a%400==0))
            System.out.println("leap year");
        else
            System.out.println("not a leap year");    
    }   
}
