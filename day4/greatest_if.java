import java.util.*;//errrror
class greatest_if 
{
    public static void main(String[]args)
    {
        int a,b,c,d,e;
        Scanner n = new Scanner(System.in);
        System.out.println("enter 5 numbers followed by enter:");
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();
        d = n.nextInt();
        e = n.nextInt();
        System.out.println("Greatest number is:");
        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    if(a>e)
                    {
                        System.out.println(a);
                    }
                    else
                    {
                        System.out.println(e);
                    }
                }
                else
                {
                    System.out.println(d);
                }
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if(b>c)
            {
                if(b>d)
                {
                    if(b>e)
                    {
                        System.out.println(b);
                    }
                    else
                    {
                        System.out.println(e);
                    }
                }
                else
                {
                    System.out.println(d);
                }
            }
            else
            {
                System.out.println(c);
            }
        }
    }
    
}
