package a2_looping_statements_program;  // 0 , 1 , 127,153,370,371,407,1634

public class a7_armstrong_number {

	public static void main(String[] args) {
		
		int no=153;
		int  a=no;
		int leng=0;
		
		while(a>0)
		{
			leng=leng+1;
			a=a/10;
		}
				
		int b=no;
		int arm=0;
		int rem ;

		while(b>0)
		{
			int mul = 1;			
			rem=b%10;
			
			for(int i =1; i<=leng ; i++)
			{	
				mul=mul*rem;
			}
			arm=arm+mul;	
			b=b/10;	
		}

		if(arm==no)
		{
			System.out.println(no + " is armstrong number");
		}
		else
		{
			System.out.println(no + " is not armstrong number");
		}
		
		
		
}

}
