public class Noaccess_nomod //no access specifiers and no Specifiers. 
{
    void pulama()
    {
        System.out.println("PULAMA dancing");
    }
    public static void main(String[] args)
    {
        System.out.println("main starts");
        Noaccess_nomod a = new Noaccess_nomod();
        a.pulama();
        System.out.println("main ends");
    }
}
