package a6_reverse_number;

public class reverse_number2 {

	public static void main(String[] args) {
		

		int a=987654321;
		
		int rem;
		int rev=0;
		
		while(a>0)
		{
			rem=a%10;
			
			rev=rev*10+rem;
			
			a=a/10;
		}
		System.out.println(rev);
		
	}
}
