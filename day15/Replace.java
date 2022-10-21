public class Replace 
{
    public static void main(String[]args0)
    {
        String a="Hello World";
        String b=a.replace("ll","xx");
        System.out.println(b);
    }    
}
class Replace_sir
{
    public static void main(String[]args)
    {
        String s="Hello World";
        int n=0;
        String res="";
        int len=s.length()-1;
        while(n<=len)
        {
            if(s.charAt(n)=='l'&&s.charAt(n+1)=='l')
            {
                res+="xx";
                n+=2;
            }
            else
            {
                res+=s.charAt(n);
                n+=1;
            }
        }
        System.out.println(res);
    }
}
