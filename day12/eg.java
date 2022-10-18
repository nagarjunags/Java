class Vishanth
{
    void bodybuilder()
    {
        System.out.println("All girls behind");
    }

}
class Not_vishanth extends Vishanth
{
    @Override
    void bodybuilder()
    {
        System.out.println("No girls behind");
    }
}
class eg 
{  
    public static void main(String[]args)
    {
    Vishanth a= new Not_vishanth();
    a.bodybuilder();
    }
}
