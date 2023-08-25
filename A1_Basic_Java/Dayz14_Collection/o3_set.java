package Dayz14_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class o3_set {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String> ();
		
		set1.add("yogesh");
		set1.add("manish");
		set1.add("niraj");
		set1.add("rahul");
		set1.add("hirak");

		
//		System.out.println("set1 : "+set1);

		Iterator<String> it=set1.iterator();
		
		while(it.hasNext())
		{
//			System.out.println(it.next());

			if(it.next().equalsIgnoreCase("yogesh"))
			{
				System.out.println("id2 = yogesh ");
				break;
			}
			

		}
		
		
		
	
	}

}
