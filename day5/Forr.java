import java.util.*;
class Forr
{
    public static void main(String[]args)
    {
        for(int x =1;x<=10;x++)
        {
            System.out.print(x+"  ");
            int a=-(x-11);
            System.out.println(a);   
        }
    }
}

class for2
{
    public static void main(String[]args)
    {
        for(int i=1, j=10;i<=10;i++,j--)
        {
            if(i%3==0)
                 continue;
            System.out.println(i+"     "+j);
            
           
        }

    }
}
class for3
{
    public static void main(String[]args)
    {
        for(int i=1, j=10;i<=10;i++,j--)
        {
            if(i%3==0)
                 break;
            System.out.println(i+"     "+j);
            
           
        }
        System.out.println("hi");

    }
}
class for4
{
    public static void main(String[]args)
    {
        for(int i=1, j=10;i<=10;i++,j--)
        {
            if(i%3==0)
                 return;
            System.out.println(i+"     "+j);
            
           
        }
        System.out.println("hi");
    }

}
class nested
{
    public static void main(String[]args)
    {
        for(int x=0;x<10;x++)
        
            for (int y=0;y<10;y++)
                System.out.println(x+"\t\t"+y);
        
    }

}

class reverse
{
    public static void main(String[]args0)
    {
        int n;
        String a="";
        Scanner nn = new Scanner(System.in);
        n=nn.nextInt();
        while (n>0)
        {

            a+=(n%10);
            n/=10;
           
        }
        System.out.println(a);
        
    }
}