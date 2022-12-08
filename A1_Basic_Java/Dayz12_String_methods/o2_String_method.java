package Dayz12_String_methods;

public class o2_String_method {

	public static void main(String[] args) {

		    String a  = "yogesh@12345";	
			String yps []=a.split("@");                 
			
			System.out.println(yps[0]);
			System.out.println(yps[1]);
			System.out.println(a);
			System.out.println();
			
			String b=a.replaceFirst("12345", "4545");
			System.out.println(b);
			
			String c=b.replaceAll("yogesh", "sunil");    // replace All
			System.out.println(c);
			
			String d=c.replace("sunil", "milind");     // char sequence
			System.out.println(d);
			
			String e=d.replace('@', '#');               // char
			System.out.println(e);
			
		
		
	}

}
