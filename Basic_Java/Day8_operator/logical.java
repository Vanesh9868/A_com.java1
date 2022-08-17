package Day8_operator;

public class logical {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		// and &&
		System.out.println(a>b & b<a);   //true
		System.out.println(a>b & b>a);   //false
		System.out.println(a<b & b<a);   //false
		System.out.println(a<b & b>a);   //false
		System.out.println();
		
		// or ||
		System.out.println(a>b || b<a);   //true
		System.out.println(a>b || b>a);   //true
		System.out.println(a<b || b<a);   //true
		System.out.println(a<b || b>a);   //false


	}

}
