package Dayz10_looping_statement;

public class A_foreachloop {

	public static void main(String[] args) {
		
		String current ="1682664943230";

		String b[][] = { {
						  "1682580605000", "1782580605000",
						  "1682580605000", "1882580605000",
						  "1982580605000", "1682580605000", 
						  "1682580605000", "1982580605000" 
						}};
				
		for(String[] i : b) {
						
			for(String n : i) {
				
				if(n.compareTo(current)==1) {
					
				}
				
				System.out.println(n);
	
			}
		}
		
		

		
		

	}

}
