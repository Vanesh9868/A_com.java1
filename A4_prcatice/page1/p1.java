package page1;

import java.util.Arrays;

public class p1 {

	public static void main(String[] args) {


		String x = "the test";
		char s[]=x.toCharArray();
		
		int Tcount=0;
		
		for(int i=0; i<x.length(); i++) {
			
			if(s[i]== 't') {
				System.out.println(s[i]);
				Tcount=Tcount+1;
			}
			
		}
		
		System.out.println(Tcount);

	}
}
