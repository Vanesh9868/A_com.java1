package a8_calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date1 = sdf.parse("2023-04-27 13:00:05");
		Date date2 = sdf.parse("2020-10-10 14:20:00");

		int diff = date1.compareTo(date2);
		if (diff > 0) {
			System.out.println(date1 + " is greater than " + date2);
		} else if (diff < 0) {
			System.out.println(date1 + " is less than " + date2);
		} else {
			System.out.println(date1 + " is equal to " + date2);
		}
	}

}
