class Function_overload
{
    static void aa(int a)
    {
        System.out.println("1st fun");
    }
    static void aa(float a)
    {
        System.out.println("2nd fun");
    }
    public static void main(String[] args)
    {
        System.out.println("Main starts");
        
        aa(9);
        aa(9.0f);

        System.out.println("MAin Ends");

    }
}