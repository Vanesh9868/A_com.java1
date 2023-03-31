package Dayz14_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class o5_set {

	public static void main(String[] args) {


		Set<String> set= new HashSet<String> ();
		set.add("yogesh");
		set.add("manish");
		set.add("rajesh");		

		System.out.println(set);	
		Iterator<String> it=set.iterator();
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());


		int a=0;
		while(it.hasNext()) {
			
			if(it.hasNext()) {
				a=a+1;
			}
			
			System.out.println("SetValue "+a+" : "+it.next());
		}
		
		
	}

}
