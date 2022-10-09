import java.util.*;//program to calculate number of notes
class note 
{
    public static void main(String[]args)
    {
        int a,b;
        System.out.print("Enter the amount:");
        Scanner aa = new Scanner(System.in);
        a=aa.nextInt();
        b=a/2000;
        int x= a-(b*2000);
        int c=x/500;
        int d =(b*2000)+(c*500);
        a-=d;
        int z=a/200;
        a=a-(z*200);
        int o= a/100;


                            //100  500 2000
       System.out.println("2000x"+b);
       System.out.println("500x"+c);
       System.out.println("200x"+z);
       System.out.println("100x"+o);
       


    }
    
}
