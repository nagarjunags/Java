import java.util.*;


class Check 
{
    public static void main(String[]args)
    {
        char a;
        Scanner aa = new Scanner(System.in);
        a=aa.next().charAt(0);
        if(Character.isDigit(a))//Character.isDigit(a)
            System.out.println("Number");
        else if(Character.isAlphabetic(a))  
            System.out.println("Alphabet");  
        else
            System.out.println("Special");    

    }
    
}
class Check2 
{
    public static void main(String[]args)
    {
        char a;
        Scanner aa = new Scanner(System.in);
        a=aa.next().charAt(0);
        if((a>='0'&&a<='9'))//Character.isDigit(a)
            System.out.println("Number");
        else if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))  
            System.out.println("Alphabet");  
        else
            System.out.println("Special");    

    }
    
}
