import java.util.Set;
import java.util.TreeMap;
class TreeMap1
{
    public static void main(String[]args)
    {
        TreeMap a =new TreeMap();
        a.put(1,"Satti");
        a.put('a',"manju");
        a.put(6,"java");
        System.out.println(a);
        Set<Integer> b=a.keySet(); 
        for(int c:b)
        {
            System.out.println(a.get(c));
        }
    }
}