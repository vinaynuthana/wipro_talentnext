package dateTimeAPI;

import java.time.LocalTime;

public class DT6 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime before5Hrs30Min = time.minusHours(5).minusMinutes(30);
		System.out.println("Current time: " + time);
		System.out.println("Time before 5 Hrs 30 Mins: " + before5Hrs30Min);

	}

}