import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.print("Now its: " + hour);
        if(hour >= 5 && hour <= 12) {
            System.out.println(" then, Good Morning!");
        } else if (hour >= 13 && hour <= 17) {
            System.out.println(" then, Good Afternoon!");
        } else {
            System.out.println(" then, Good Night!");
        }
    }
}
