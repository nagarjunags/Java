import java.util.*;
class A
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter One number:");
        int a =input.nextInt();
        System.out.println("Enter another no");
        int b=input.nextInt();
        try
        {
        System.out.println(a/b);
        }
        catch(ClassCastException e)//catching classCastException
        {
            System.out.println(e.getMessage());
        }
        catch(Exception d)
        {
            System.out.println(d.getMessage());
        }
        System.out.println("end");
        
    }
}

 class Exception2 
{
    public static void main(String[]args) throws InsufficientBalance
    {
        int balance=1000;
        int amount=500;
        if(amount<=balance)
        {
            System.out.println("withdraw successfull");
        }
        else
        {
            throw new InsufficientBalance();

    
        }
    }
}
