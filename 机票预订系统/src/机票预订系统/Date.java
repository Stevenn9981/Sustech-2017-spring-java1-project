package »úÆ±Ô¤¶©ÏµÍ³;

public class Date {
	private int month;
	private int day;
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int year;

	public Date(int theYear, int theMonth, int theDay) {
		month = checkMonth(theMonth);
		year = theYear;
		day = checkDay(theDay);

	}

	// utility method to confirm proper month value
	private int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12)
			return testMonth;
		else {
			return 1;
		}
	}

	private int checkDay(int testDay) {
		int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;

		if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			return testDay;

		return 1;
	}

	public String toString() {
		return String.format("%d-%02d-%02d", year,month,day);
	}
}
