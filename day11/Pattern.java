class Pattern
{
    public static void main(String[] args)    
    {
        int rows = 4;
        for (int i=0;i<rows;i++)
        {
            for(int spaces =1;spaces<=rows-i;spaces++)
            {
                System.out.print(" ");
            }
            for (int star =0;star<=i*2;star++)
            {
        
                System.out.print("*");
            }
           
            System.out.print('\n');
        }
    }

}