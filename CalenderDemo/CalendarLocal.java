package CalenderDemo;

import java.util.Calendar;

public class CalendarLocal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current time is : " + c.getTime());
        System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + c.get(Calendar.SECOND));
    }
}
