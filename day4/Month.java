import java.util.*;
class Month 
{
    public static void main(String[]args)
    {
        int a,b;
        System.out.print("Enter the year:");
        Scanner aa=new Scanner(System.in);
        a= aa.nextInt();
        System.out.print("Enter the month:");
        b=aa.nextInt();
// check if it is a leap year
        if(((a%100!=0)&&(a%4==0))||(a%400==0))
            a=1;
        else
            a=0;
        switch(b)
        {
            case 1:

            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("30 days in the month "+ b);
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                if(a==1)
                    System.out.println("29 days in the month since it is a leap year "+b);
                else
                    System.out.println("28 days in the month "+b); 
                break;    
            default:
                System.out.println("invalid input");           
            
        }    
            


    }
    
}
