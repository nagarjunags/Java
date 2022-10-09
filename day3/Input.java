import java.util.*;
class Input 
{
    public static void main(String[]args)
    {
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a=input.nextInt();
        System.out.print("Enter 2nd number:");
        b=input.nextInt();
        System.out.println("sum = "+(a+b)+"\ndifference ="+(a-b));
        
        //for taking a string(full line)
        // sc.nextLine
        //sc.nextInt
        //sc.nextFloat 
        //next().charAt();
        //next();
        //nextLine();
        //nextBoolean();

    }
    
}

class allin
{
    public static void main(String[] args)
    {
        int a;
        long b;
        float c;
        double d;
        char e;
        boolean f;
        short g;
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter int:");
        a=aa.nextInt();
        System.out.print("Enter long:");
        b=aa.nextLong();
        System.out.print("Enter float:");
        c=aa.nextFloat();
        System.out.print("Enter double:");
        d=aa.nextDouble();
        System.out.print("Enter char:");
        e=aa.next().charAt(0);
        System.out.print("Enter boolean:");
        f=aa.nextBoolean();
        System.out.print("Enter short:");
        g=aa.nextShort();
        System.out.print("Enter String:");
        //Scanner bb = new Scanner(System.in);
        String h =aa.nextLine();//to take input it jumps to nxt line
        String z =aa.nextLine();
        System.out.print("Enter byte:");
        byte i=aa.nextByte();
        System.out.println("---------------------------------------------------------------");
        System.out.println("|                    output                                    |");
        System.out.println("---------------------------------------------------------------");
        System.out.println("int ="+ a+"\nlong="+b+"\nfloat="+c+"\ndouble"+d+"\nchar="+e+"\nBoolean="+f+"\nshort="+g);
        System.out.println("String="+z);
        System.out.println("byte="+i);



    }
}
