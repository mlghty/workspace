import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today = " + today);
        LocalDate theDaYAfterTommorow = today.plusDays(2);
        System.out.println("Today + 2 = " + theDaYAfterTommorow);






    }
}
