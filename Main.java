FAZA 2
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
FAZA 3
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
FAZA 4
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj emrin: ");
        String emri = scanner.nextLine();

        System.out.print("Shkruaj qytetin: ");
        String qyteti = scanner.nextLine();

        System.out.println("Përshëndetje, " + emri + " nga " + qyteti + "!");

        scanner.close();
    }
}
FAZA 5
Kodi fillestar
public class helloWorld {
    public static void main(String args) {
        System.out.println("Hello World";
    }
}
korrigjimi
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

