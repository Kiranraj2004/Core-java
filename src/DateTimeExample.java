import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimeExample {
    public static void main(String[] args) {
        // Creating a Date object to get the current date and time
        Date currentDate = new Date();

        // Creating a SimpleDateFormat object to format the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Formatting the date and time using the SimpleDateFormat
        String formattedDateTime = dateFormat.format(currentDate);

        // Displaying the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}

