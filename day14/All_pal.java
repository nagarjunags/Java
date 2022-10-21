public class All_pal 
{
    public static void main(String[]args)
    {
        
        String a="malayalam";
        for(int i=0;i<a.length()-1;i++)
        {
            for(int j=1;j<a.length()-1-i;j++)
            {
                String b=a.substring(i,j);
                int flag=0;
                for(int k =0;k<b.length()/2;k++)
                {
                    if(b.charAt(k)!=a.charAt(b.length()-k-1))
                    {
                        flag=1;
                        break; 
                    }
                }  
                if(flag!=1)
                {
                    for(int m=0;m<b.length()-1;m++)
                    System.out.println(b.charAt(i));
                }

            }
        }
    }    
}
class Palindromeee
{
    public static void main(String[]args)
    {
        String s1="gadag";
        for(int i=0;i<s1.length()-1;i++)
        {
            for(int j=2+i;j<=s1.length();j++)
            {
                String s2=s1.substring(i, j);
                if(isPalindrome(s2))
                    System.out.println(s2);
            }
        }
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
            
        }
        return true;
        
    }
}
