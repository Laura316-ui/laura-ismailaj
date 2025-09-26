import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World");

        System.out.println("Përshëndetje, Kristi!");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateTime = now.format(formatter);

        System.out.println("Sot është: " + dateTime);

        int hour = now.getHour();
        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Mirëmëngjes";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Mirëdita";
        } else {
            greeting = "Mirëmbrëma";
        }

        System.out.println(greeting + " dhe mirë se erdhe në Java!");
    }
}
