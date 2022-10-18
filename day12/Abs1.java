abstract class Person
{
    public abstract void work();
    public void eat()
    {
        System.out.println("eating");
    }
}
class Employee extends Person
{
    public void work()
    {
        System.out.println("working");
    }
    public static void main(String[]args)
    {
        Person e= new Employee();
        e.work();
        e.eat(); 
    }
}