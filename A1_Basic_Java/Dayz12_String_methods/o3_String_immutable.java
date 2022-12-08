package Dayz12_String_methods;

public class o3_String_immutable {

	public static void main(String[] args) {


		String x="yogesh";
		x.concat("shinde");
		System.out.println(x);                              // String are immutable
		
		StringBuffer y = new StringBuffer ("Sunil");        // StringBuffer are mutable
//		y.append("Devloper");
		System.out.println(y);
		
		StringBuilder z = new StringBuilder ("milind");     // String Builder Are mutable
		z.append("jio");
		System.out.println(z);
		
		
	}

}
