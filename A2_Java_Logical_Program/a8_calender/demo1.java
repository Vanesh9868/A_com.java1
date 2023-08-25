package a8_calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date1 = sdf.parse("2020-01-31 10:30:45");
		Date date2 = sdf.parse("2020-10-10 14:20:00");

		// after() method
		if (date1.after(date2)) {
			System.out.println(date1 + " is after " + date2);
		}

		// before() method
		if (date1.before(date2)) {
			System.out.println(date1 + " is before " + date2);
		}

		// equals() method
		if (date1.equals(date2)) {
			System.out.println(date1 + " is equal to " + date2);
		}

		// compareTo() method
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
