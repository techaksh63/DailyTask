import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2015, Month.OCTOBER, 10);
        System.out.println(date);
        System.out.println(date1);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}