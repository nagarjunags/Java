import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.text.Style;
class ArrayList1

{
	public static void main(String[]args)
	{
		ArrayList a =new ArrayList();//ctreated with initial capacity =10
		ArrayList b =new ArrayList(20);//userdefined capacity
		a.add(10);
		a.add(20);
		System.out.println(a);
		System.out.println(a.isEmpty());
		//a.clear();
		//System.out.println(a.isEmpty());
		a.add(1,50);
		a.set(2, 500);
		a.addAll(a);
		/*//Stack:
		//import java.util.Stack
		Stack c= new Stack();
		c.push(10);
		c.push(20);
		c.push(30);
		System.out.println(c);
		System.out.println(c.pop());
		System.out.println(c);
		System.out.println(c.peek());
		System.out.println(c);
		Enumeration d=c.elements();
		while(d.hasMoreElements())
		{
			System.out.println(d.nextElement());
		}


*/
		/*Iterator C=(Iterator) a.Iterator();
		while(c.hasNext())
		{
			System.out.println(c.next);
		}*/
		
	}
}
