package Day9_condition_statement;

public class nested_if_larger_of_3 {

   public static void main(String[] args) {
	   int a=10;
	   int b=20;
	   int c=30;
	   
	  if (a>b)               
	   {
		if (a>c)
	      {System.out.println("a is greater");}
		else   
		{System.out.println("c is greater");}
	   }
	  if (b>a)	
      {
        if (b>c) 
          {System.out.println("b is greater");}
       else     
          {System.out.println("c is greater");}
      }

		  
	
	  
	  
	  
	  
	  
	  
	  
	  
	}

}