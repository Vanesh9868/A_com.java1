package a8_fibonaciSeries;            // for repeat the set of code

public class phibonacci_series {

	public static void main(String[] args) {

		int a =0;
		int b =1;
		
		 System.out.println(a+""+b);
		 
		int c;
		 
		for(int i=1; i<=5; i++)
		 {
			 c=a+b;
			 System.out.println(""+c);
			 a=b;
			 b=c;
			 
		  }
			 

		    
		    
		    
	}

}
