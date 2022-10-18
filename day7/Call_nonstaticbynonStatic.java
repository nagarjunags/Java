class Call_nonstaticbynonStatic 
{
    public static void main(String[] args)
    {
        System.out.println("Main start");
        Call_nonstaticbynonStatic a = new Call_nonstaticbynonStatic();
        
        a.manja();
        
        System.out.println("Main ends");
    }
    void manja()
    {
        System.out.println("Manja coming");
        System.out.println("manja calling sangu");
        Call_nonstaticbynonStatic b = new Call_nonstaticbynonStatic();
        b.sangu();
        System.out.println("Manja going");
    }
    void sangu()
    {
        System.out.println("San coming");
        System.out.println("san going");
    }    
}
