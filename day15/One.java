/*class One 
{
    public static void main(String[] args)
    {
        String s="aabaccb";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if (s.charAt(j)==a)
                    continue;
                    System.out.print(a);
     
            }
        }
    }
}*/
class One
{
    public static void main(String[]args)
    {
        String s ="aabaccb";
        String temp="";
        for(int i=0;i<s.length();i++)
        {   
            char c=s.charAt(i);
            if(!temp.contains(c+""))
            {
                temp+=c;
            }
        }
        
        System.out.println(temp);
    }
}
class Repetition
{
    public static void main(String[]args)
    {
            String s1="aabaccb";
            String s2 ="";
            while(s1.length()>0)
            {
                char c=s1.charAt(0);
                String temp=s1.replace(c+"","");
                int n=s1.length()-temp.length();
                s2=s2+n+""+c;
                s1=temp;
            }
            System.out.println(s2);
    }
}    