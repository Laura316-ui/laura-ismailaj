import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Printo mesazhin e parë
        System.out.println("Hello, World");

        // Printo përshëndetjen me emrin tënd
        System.out.println("Përshëndetje, Kristi!");

        // Merr datën dhe orën aktuale
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateTime = now.format(formatter);

        // Printo datën dhe orën
        System.out.println("Sot është: " + dateTime);

        // Përcakto përshëndetjen sipas orës
        int hour = now.getHour();
        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Mirëmëngjes";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Mirëdita";
        } else {
            greeting = "Mirëmbrëma";
        }

        // Printo mesazhin final
        System.out.println(greeting + " dhe mirë se erdhe në Java!");
    }
}
