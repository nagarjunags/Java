public class Jagged_array 
{
    public static void main(String[]args)
    {
        int[][] a = new int[2][];
        a[0]=new int[3];//Jagged array is nothing but diiferent size of rows
        a[1]=new int[2];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        
    }    
}
