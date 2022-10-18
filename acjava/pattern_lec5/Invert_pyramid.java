import java.util.Scanner;

class Invert_pyramid
{
    public static void main(String[]args)
    {
        int rows;
        Scanner aa = new Scanner(System.in);
        System.out.print("enter rows:");
        rows = aa.nextInt();
        for(int i =0;i<rows;rows++)
        {
            for(int j=0;j<(rows+rows-1)/2;j++)
            {
                System.out.print(" ");
            }
            for(int j=((rows+rows-1)-i);j>0;j--)
            {
                System.out.print("a");
            }
            System.out.println();
        }
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i<rows)
                {
                    System.out.print(" ");
                }
            }
            for (int j=0;j<(rows+rows-1)-2*i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}