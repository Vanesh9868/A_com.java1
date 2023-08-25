package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utils {

	public static String compairDAtes(String currentDate, String DateToCompair) throws ParseException {

		String date = null;
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdformat.parse(currentDate);
		Date d2 = sdformat.parse(DateToCompair);
		
		
//		System.out.println("The date 1 is: " + sdformat.format(d1));
//		System.out.println("The date 2 is: " + sdformat.format(d2));
//		
	      if(d1.compareTo(d2) > 0) {
	    	  date="current date is greater";
	      } else if(d1.compareTo(d2) < 0) {
	    	  date="current date is smaller";
	      } else if(d1.compareTo(d2) == 0) {
	    	  date="current date is equal";
	      }
		return date;
	}
}
