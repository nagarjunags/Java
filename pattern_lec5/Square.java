import java.util.*;
class Square
{
    public static void main(String[] args)
    {
        char a='*';
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter the number of Rows And Columns:");
        int n = nn.nextInt();
        for(int i = 0;i<n;i++)
        {
            for (int j =0;j<n;j++)
                System.out.print(a);
            System.out.println();    
        }   
    }
}