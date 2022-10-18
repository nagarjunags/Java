class M1
{
    
    public void m1()
    {
        System.out.println("m1 method");    
    }
    public void m2(double a)
    {
        System.out.println("mm2 method");
    }
    public static void main(String[] args) {
        
        M1 a = new M1();
        a.m1();
        a.m2(0);
    }
}