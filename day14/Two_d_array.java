class Two_d_array
{
    public static void main(String[]args)
    {
        int[][] a= new int[2][2];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=30;
        a[1][1]=40;
        System.out.println(a[0]);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                //System.out.print("address="+a[i]+"\t\t");
                System.out.print(a[i][j]+ "   ");
            }
            System.out.println();
        }
        
    }
}