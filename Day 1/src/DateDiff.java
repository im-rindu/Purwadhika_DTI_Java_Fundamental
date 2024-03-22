import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDiff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Input Date 1 (yyyy-mm-dd) : ");
        String dateInput1 = input.nextLine();
        LocalDate date1 = LocalDate.parse(dateInput1, dateFormat);
        
        System.out.print("Input Date 2 (yyyy-mm-dd) : ");
        String dateInput2 = input.nextLine();
        LocalDate date2 = LocalDate.parse(dateInput2, dateFormat);
        input.close();

        long diffInDays = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Date difference is : " + diffInDays + " day");
    }
}
