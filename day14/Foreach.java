
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Foreach 
{
    public static void main(String[]args)
    {
        System.out.print("Enter the size of the array:");
        Scanner aa = new Scanner(System.in);
        int n = aa.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array elements:");
        for(int i =0;i< n;i++)
        {
            a[i]=aa.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted elements:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();

    }   
}
class Student implements Comparable
{
    String name;
    int id;
    Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
   
    /*public int compareTo(Object o)
    {
         Student a =(Student)o;
         return this.name.compareTo(a.name);
       /*  if(this.id==0)
            return 0;
        else if(this.id>a.id)
            return 1;
         else
         return -1;     
    }*/
    @Override
    public String toString()
    {
        return"Student [name="+name+", id="+id+"]";
    } 
    
    public static void main(String[]args)
    {
        Student a=new Student("Satti",15);
        Student b=new Student("bhanu",200);
        Student c=new Student("Nidhi",25);
        Student[] student = {a,b,c};
        Arrays.sort(student);//needs Overriding of the compareTo method
        for(int i=0;i<student.length;i++)
        System.out.println(student[i]);
    }

    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
  
}
class StudentId implements Comparator 
{
    public int compare(Object o1,Object o2)
    {
        Student a=(Student)o1;
        Student b=(Student)o2;
        if(a.id==b.id)
            return 0;
        else if(a.id>b.id)
            return 1;
        else
            return -1;        
    }
}    
