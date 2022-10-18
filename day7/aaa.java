class aaa 
{
    int a =15;//non static variable
    void m1()
    {
        int a=10;//local var
        aaa d =  new aaa();// object creation
        System.out.println(a);//printing local var a
        System.out.println(d.a);//printing non ststic var with refference to object d
    }
    public static void main(String[]args)  
    {
        aaa a = new aaa();
        a.m1();
    }  
}
