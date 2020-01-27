package barkingdog;

import java.util.Calendar;
import java.util.Date;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(shouldWakeUp(true, 21));

	}

	public static boolean shouldWakeUp(boolean barking, int hourOfday) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR, hourOfday);

		if (barking == true && (cal.get(cal.HOUR_OF_DAY) <= 8 || cal.get(cal.HOUR_OF_DAY) >= 22)) {
			return true;
		}

		return false;
	}

}
