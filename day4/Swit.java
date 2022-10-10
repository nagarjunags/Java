import java.util.*;
class Swit 
{
    public static void main(String[]args)
    {
        int n;
        Scanner nn = new Scanner(System.in);
        n=nn.nextInt();
        boolean repeat =true;
        while(repeat)
        switch(n)
        {
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2"); 
                break;
            default:
                System.out.println("default");       
        }

    }
    
}
