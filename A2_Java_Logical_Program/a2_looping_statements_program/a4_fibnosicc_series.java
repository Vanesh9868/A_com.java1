package a2_looping_statements_program;

public class a4_fibnosicc_series {

	public static void main(String[] args) {

		
		int a=1;
		int b=2;
		int c;
		
		for(int i=1;i<=5;i++)
		{
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
					
		}
		
		
		
		
}

}
