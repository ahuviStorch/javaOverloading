package functionOverloading;


import java.time.LocalDateTime;

public class MyTime extends MyDate {
    private int hours;
    private int minutes;
    private int seconds;

    public MyTime(int day, int month, int year,int dailySerialNum, int hours, int minutes, int seconds) {
        super(day, month, year, dailySerialNum);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    
    public MyTime() {
		LocalDateTime today = LocalDateTime.now();
		this.year = today.getYear(); 
		this.month = today.getMonthValue();  
		this.day = today.getDayOfMonth();

		this.hours = today.getHour();
        this.minutes = today.getMinute();
        this.seconds = today.getSecond();
		
	}


    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    
    @Override
    public String getDate(char c) {
        return super.getDate(c) + " " + hours + c + minutes + c + seconds;
    }

    public String getDate(char dateChar, char timeChar) {
        return super.getDate(dateChar) + " " + hours + timeChar + minutes + timeChar + seconds;
    }

    
}