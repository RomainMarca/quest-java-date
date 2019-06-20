import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line

        Calendar calendar = new GregorianCalendar(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = calendar.getTime();
        System.out.println("The date is : " + sdf.format(date));
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayWeek = "";
        switch (dayOfWeek) {
        case 1:
            dayWeek = "SUNDAY";
            break;
        case 2:
            dayWeek = "MONDAY";
            break;
        case 3:
            dayWeek = "TUESDAY";
            break;
        case 4:
            dayWeek = "WEDNESDAY";
            break;
        case 5:
            dayWeek = "THURSDAY";
            break;
        case 6:
            dayWeek = "FRIDAY";
            break;
        case 7:
            dayWeek = "SATURDAY";
            break;
        default:
            dayWeek = "To day";

        }
        System.out.println("The day of the week is : " + dayOfWeek + ", And this day is : " + dayWeek);

    }
}