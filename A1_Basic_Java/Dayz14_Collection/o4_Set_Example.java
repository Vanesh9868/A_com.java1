package Dayz14_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class o4_Set_Example {

	public static void main(String[] args) {

		Set<String> s2 = new HashSet<String>();
		s2.add("yogesh12345");
		s2.add("manish45678");
		s2.add("rakesh789");
		System.out.println("s2 :" + s2);

		Iterator<String> it = s2.iterator();

		System.out.println("it :" + it);

		while (it.hasNext()) {
			String childWindow = it.next();
			if (!childWindow.equalsIgnoreCase("yogesh12345")) {
				System.out.println(childWindow);
				break;
			}
		}
	}

}
