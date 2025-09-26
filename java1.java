Faza 1 – Nxehu public class TypesWarmup {
    public static void main(String[] args) {
        byte mosha = 17;
        int popullsia = 742000;
        long borxhi = 12000000000L;
        float temperatura = 23.5f;
        double koeficienti = 1.0/3.0;
        char shkronja = 'A';
        boolean student = true;
        final double TVSH = 0.1;
        System.out.println("mosha(byte) = " + mosha);
        System.out.println("popullsia(int) = " + popullsia);
        System.out.println("borxhi(long) = " + borxhi);
        System.out.println("temperatura(float) = " + temperatura);
        System.out.println("koeficienti(double) = " + koeficienti);
        System.out.println("shkronja(char) = " + shkronja);
        System.out.println("student(boolean) = " + student);
        System.out.println("TVSH = " + TVSH);
    }
}
me tipet (≈ 20 min)
Faza 2 – Casting & precizioni (≈ 25 min)
public class TypesWarmup {
    public static void main(String[] args) {
        // Casting implicit: int -> long, float -> double
        int intValue = 100;
        long longValue = intValue; // Implicit casting from int to long
        
        float floatValue = 3.14f;
        double doubleValue = floatValue; // Implicit casting from float to double
        
        System.out.println("=== Casting Implicit ===");
        System.out.println("int value: " + intValue);
        System.out.println("long value (after casting): " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value (after casting): " + doubleValue);
        
        // Casting explicit: double -> int, long -> int, double -> float
        double doubleNum = 99.99;
        int intNum = (int) doubleNum; // Explicit casting from double to int (loses decimal part)
        
        long longNum = 2147483648L; // Larger than int max value
        int intFromLong = (int) longNum; // Explicit casting from long to int (overflow occurs)
        
        double doubleNum2 = 3.14159265359;
        float floatNum = (float) doubleNum2; // Explicit casting from double to float (loses precision)
        
        System.out.println("\n=== Casting Explicit ===");
        System.out.println("double value: " + doubleNum);
        System.out.println("int value (after casting): " + intNum + " (decimal part lost)");
        System.out.println("long value: " + longNum);
        System.out.println("int value (after casting): " + intFromLong + " (overflow occurred)");
        System.out.println("double value: " + doubleNum2);
        System.out.println("float value (after casting): " + floatNum + " (precision lost)");
        
        // Overflow example: byte b = 127; (byte)(b + 1)
        byte b = 127;
        System.out.println("\n=== Overflow Example ===");
        System.out.println("Initial byte value: " + b);
        byte overflowResult = (byte)(b + 1);
        System.out.println("After adding 1: " + overflowResult + " (overflow occurred)");
        System.out.println("Explanation: byte range is -128 to 127. 127 + 1 = 128, which overflows to -128");
    }
}

Faza 3 – Mini-kalkulatori i çmimit (≈ 45 min)
import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double TVSH_RATE = 0.10;
        final int ZBRITJE_NX = 5;
        
        System.out.print("Shkruaj cmimin baz (lek): ");
        int cmimiBaze = scanner.nextInt();
        
        System.out.print("A je nx? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        double tvsh = cmimiBaze * TVSH_RATE;
        double cmimiMeTvsh = cmimiBaze + tvsh;
        
        double cmimiFinal;
        if (isStudent) {
            cmimiFinal = cmimiMeTvsh - ZBRITJE_NX;
        } else {
            cmimiFinal = cmimiMeTvsh;
        }
        
    
        int cmimiFinalRrumbullakuar = (int) Math.round(cmimiFinal);
     
        System.out.println("cmimi baz: " + cmimiBaze + " lek");
        System.out.println("TVSH (" + (TVSH_RATE * 100) + "%): " + tvsh + " lek");
        System.out.println("Ndermjetese me TVSH: " + cmimiMeTvsh + " lek");
        
        if (isStudent) {
            System.out.println("Zbritje nx: " + ZBRITJE_NX + " lek");
        }
        
        System.out.println("Totali per pages: " + cmimiFinalRrumbullakuar + " lek");
        
        scanner.close();
    }
}
Faza 4 – Kontroll i tipit & validim i thjeshtë (≈ 25 min)

import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TVSH_RATE = 0.10;
        final int ZBRITJE_NX = 5;
      
        System.out.print("Shkruaj cmimin baz (lek): ");
        int cmimiBaze = scanner.nextInt();
        
        if (cmimiBaze <= 0) {
            System.out.println("Gabim: cmimi baz duhet të jet > 0.");
            scanner.close();
            return;
        }
        
        System.out.print("A je nx? ");
        boolean isStudent;
        
        if (scanner.hasNextBoolean()) {
            isStudent = scanner.nextBoolean();
        } else {
           
            scanner.next(); 
            isStudent = false;
            System.out.println("Paralajmerim: Input i pavlefshem për nx, do të supozohet false.");
        }
    
        double tvsh = cmimiBaze * TVSH_RATE;
        double cmimiMeTvsh = cmimiBaze + tvsh;
        
        double cmimiFinal;
        if (isStudent) {
            cmimiFinal = cmimiMeTvsh - ZBRITJE_NX;
        } else {
            cmimiFinal = cmimiMeTvsh;
        }
        
    
        int cmimiFinalRrumbullakuar = (int) Math.round(cmimiFinal);
        
        System.out.println("cmimi baz: " + cmimiBaze + " lek");
        System.out.println("TVSH (" + (TVSH_RATE * 100) + "%): " + tvsh + " lek");
        System.out.println("Ndermjetese me TVSH: " + cmimiMeTvsh + " lek");
        
        if (isStudent) {
            System.out.println("Zbritje nx: " + ZBRITJE_NX + " lek");
        }
        
        System.out.println("Totali per pages: " + cmimiFinalRrumbullakuar + " lek");
        
        scanner.close();
    }
}
Faza 5 – Inspektim i shpejtë i kufijve (≈ 20 min)

public class RangesReport {
    public static void main(String[] args) {
      
        System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " .. " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " .. " + Double.MAX_VALUE);
    }
}
