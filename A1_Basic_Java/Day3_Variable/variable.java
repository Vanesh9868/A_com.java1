package Day3_Variable;

public class variable {
	
	static int k= 100;                              // static variable / gobal variable
	static int l= 200;                              // static variable
	static int m= 300;                              // static variable

    int        x= 1000;                             // instance variable / global variable
    int        y= 2000;                             // instance variable
    int        z= 3000;                             // instance variable
                                    
 public static void main(String[] args) { 
      
	int a = 10;	                                    // local variable  
	int b = 20;                                     // local variable
	int c = 30;                                     // local variable
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	System.out.println(variable.k);
	System.out.println(variable.l);
	System.out.println(variable.m);

	variable obj = new variable();    // object create for instance variable
	
	System.out.println(obj.x);
	System.out.println(obj.y);
	System.out.println(obj.z);

		
	}

}
