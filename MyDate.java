package functionOverloading;

import java.time.LocalDate;

public class MyDate {
	protected int day;
	protected int month;
	protected int year;

	public String getDate(char c) {
		String str = "" + this.day + c + this.month + c + this.year;
		return str;
	}

	public MyDate() {
		LocalDate today = LocalDate.now();
		this.year = today.getYear(); // שליפת השנה
		this.month = today.getMonthValue(); // שליפת החודש
		this.day = today.getDayOfMonth(); // שליפת היום

	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public MyDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
	}

	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
		} else {
			this.year = 2000;
		}
	}
}
