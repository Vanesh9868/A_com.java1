package Dayz12_String_methods;

public class o4_StringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer ();        
		System.out.println(sb.capacity());
		
		sb.append("yogesh");
		System.out.println(sb.capacity());
		
		sb.append("shinde");
		System.out.println(sb.capacity());
		
		sb.append("prakash");                // after data limit extends old capacity
		System.out.println(sb.capacity());   // the capcity will increase by "(old capacity*2) +2"
		
		sb.append("sdjhsjdhgashgdhagsdhgshgdhsaghdgsh");
		System.out.println(sb.capacity());
	
		
		StringBuffer x = new StringBuffer ("ABCD");
		
		StringBuffer rev=x.reverse();
		
		System.out.println(rev);
		
	}

}
