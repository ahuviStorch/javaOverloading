package functionOverloading;
//import java.time.LocalDate; // ייבוא המחלקה


public class Main {
    public static void main(String[] args) {
        // יצירת מופע של MyDate באמצעות הבנאי ברירת המחדל (תאריך נוכחי)
        MyDate date1 = new MyDate();
        System.out.println("תאריך נוכחי עם יום בשבוע: " + date1.getDate('/'));
        System.out.println("היום בשבוע: " + date1.getDayInWeek());

        // יצירת מופע של MyTime באמצעות הבנאי המלא
        // (יום, חודש, שנה, מספר סידורי של היום בשבוע, שעה, דקות, שניות)
        MyTime time1 = new MyTime(15, 6, 2026, 1, 14, 30, 45);
        
        // הדפסת התאריך והשעה תוך שימוש בתווים שונים להפרדה
        System.out.println("תאריך ושעה מותאמים אישית: " + time1.getDate('.', ':'));
    }
}
