import java.util.*;

public class pt1 {
    public static void main(String[] args) {
        System.out.println("Enter the Date FORMAT OF DATE IS (MONTH/DAY/YEAR)\n-->");
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

        String dayOfWeek = getDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(dayOfWeek.toUpperCase());
    }

    public static String getDayOfWeek(int value) {
        String day;
        day = switch (value) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "";
        };
        return day;
    }
}
