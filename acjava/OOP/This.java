class Student
{
    String name;
    int age;
    void printinfo()
    {
        System.out.println(age+"\t"+name);
    }
    Student(String a,int b)
    {
        this.age=b;
        this.name=a;        //defenition of the constructor.....and it is optional
        //java automatically defines the constructor method,So its not mandatary to initialize or define the constructor.
    }
}
class This
{.
    public static void main(String[]args)
    {
        Student a = new Student("naga",22);// Claaing Constructor with parameter
        Student b = new Student("Arjun",26);
        a.printinfo();
        b.printinfo();
    }
}