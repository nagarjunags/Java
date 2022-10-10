import java.util.*;
class Ebill         //1st 50= free
                    //2nd 50=3rs
                    //after 100 to 150=5rs
                    //150-200=8rs
                    //>200=10rs
                    //dew*(10/100)
                    //no dew -5*
{
    public static void main(String[]args)
    {
        int watt,due,interest=0;
        int amount=0;
        Scanner n = new Scanner(System.in);
        System.out.print("enter watt:");
        watt=n.nextInt();
        System.out.print("\nenter due amount:");
        due=n.nextInt();
        if((watt>50)&&(watt<=100))
        {
            watt-=50;
            amount=watt*3;
            System.out.println(" 0 to 50 = 0");
            System.out.println("50 to "+(watt+50)+"="+amount);
            
        }
        if((watt>100)&&(watt<=150))
        {
            watt-=50;
            amount=50*3;
            watt-=50;
            amount+=watt*5;
            System.out.println(" 0 to 50 = 0");
            System.out.println("50 to 100 =150");
            System.out.println("100 to "+(watt+100)+"="+(amount-150));

            
        }
        if((watt>150)&&(watt<=200))
        {
            watt-=50;
            amount=50*3;
            watt-=50;
            amount+=50*5;
            watt-=50;
            amount+=watt*8;
            System.out.println(" 0 to 50 = 0");
            System.out.println("50 to 100 =150");
            System.out.println("100 to 150=250");
            System.out.println("150 to "+(watt+150)+"="+(amount-400));
            
        }
        if((watt>200))
        {
            watt-=50;
            amount+=50*3;
            watt-=50;
            amount+=50*5;
            watt-=50;
            amount+=50*8;
            watt-=50;
            amount+=watt*10;
            System.out.println(" 0 to 50 = 0");
            System.out.println("50 to 100 =150");
            System.out.println("100 to 150=250");
            System.out.println("150 to 200=400");
            System.out.println("150 to "+(watt+200)+"="+(amount-800));
            
        }
        
        if(due == 0 )
        {
            interest= -((amount*5)/100);
        }    
        else if(due>0)
        {
            interest=((due*10)/100);
        }    
        amount+=interest;
        if(interest<=0)
        {
            System.out.print("Discount is:");
            System.out.println(interest);
        }
        if(interest>0)
        {
            System.out.print("fine=");
            System.out.println(interest);
        }
        amount+=due;
        System.out.println("Due="+due);       
        System.out.println("Total:"+amount+"RS");        
    }
    
}
