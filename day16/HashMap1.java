import java.util.HashMap;
class HashMap1
{
    public static void main(String[]args)
    {
        HashMap<Integer,String> a =new HashMap();
        a.put(1,"Satti");
        a.put(5,"manju");
        a.put(6,"java");
        Set<Integer> b=a.keySet();
        for(int c:b)
        {
            System.out.print(c+"\t");
            System.out.println(a.get(c));
        }
    }
}