import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class performAnimalEnrichment {

    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1);    // create a period
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) {       // uses the generic period
        var upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }
}
