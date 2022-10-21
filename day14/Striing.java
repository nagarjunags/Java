import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class Striing 
{
    public static void main(String[]args)
    {
        String a="Javannna";
        System.out.println(a.length());//length method
        //---------------------------------------------------
        System.out.println(a.toUpperCase().toLowerCase());//uppercase method && lower case
        //--------------------------------------------------------------------------------
        System.out.println(a.indexOf("a"));
        //---------------------------------------------------------------------------------------
        System.out.println(a.lastIndexOf("a"));//last index of the word
        //---------------------------------------
        String b =a.replace('j', 'b');//replace
        System.out.println(b);
        //------------------------------------------------------------------------
        System.out.println(a.startsWith("Ja"));
        //-------------------------------------------------------------
        System.out.println(a.substring(2,5));
        System.out.println(a.substring(4));
        //-------------------------------------------------------------------
        System.out.println(a.charAt(5));
        //-----------------------------------------------------------------
        System.out.println(a.indexOf("a"));
        //------------------------------------------------------------------
        char []ch = a.toCharArray();//converting the String to the array
        for(int i =0;i<ch.length;i++)

        System.out.print(ch[i]+"     ");
        System.out.println();////
        //---------------------------------------------------------------------------------------------
        String[] c=a.split("n");
        System.out.println(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        //---------------------------------------------------------------------------------------------------


    }
    
}
