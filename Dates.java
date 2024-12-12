import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Dates {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now(); 
        System.out.println("Local date " + localdate);
        System.out.println(LocalDate.of(06,05,9));
        System.out.println(LocalDate.now().plusDays(-1));
        // System.out.println(LocalDate.now().minus(1, ChronoUnit.month));
        LocalDate dateMinusYears = LocalDate.now().minus(3, ChronoUnit.YEARS);
        System.out.println("Date after subtracting 3 years: " + dateMinusYears);
    }
}
