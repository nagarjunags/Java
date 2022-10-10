import java.util.*;
class Sign 
{
    public static void main(String[]args)
    {
        int a;
        Scanner n = new Scanner(System.in);
        a=n.nextInt();
        if(a>0)
            System.out.println("Possitive");
        else if(a<0)
            System.out.println("Negative");
        else if(a==0)
            System.out.println("It is zero");        

    }
    
}
