import java.util.*;
class Simple_calc 
{
    public static void main(String[]args)
    {
        int a,b;
        char c;
        boolean repeat = true;
        System.out.println("press q in operator to quit");
        while(repeat)

        {
            Scanner aa =new Scanner(System.in);
            System.out.print("enter 1st number:");
            a=aa.nextInt();
            System.out.print("enter 2nd number:");
    
            b=aa.nextInt();
            Scanner bb =new Scanner(System.in);
            System.out.print("enter operator(+,-,*,/    or q to quit):");
            c= bb.next().charAt(0);
            switch(c)
            {
                case '+':
                    System.out.println(a+"+"+b+"="+(a+b));
                    break;
                case '-':
                    System.out.println(a+"-"+b+"="+(a-b));
                    break;
                case '*':
                    System.out.println(a+"*"+b+"="+(a*b));
                    break;
                case '/':
                    System.out.println(a+"/"+b+"="+(a/b));
                    break;
                case 'q':
                    System.out.println("Thank you");
                    repeat=false; 
                    break;       
                default:
                    System.out.println("invalid operator");
                    break;     
            }
    }
    }
    
}
