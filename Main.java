faza 1
public class PrePostWarmup {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int y = x++ + ++x;
        System.out.println("x final = " + x + ", y = " + y);
    }
}
faza 2
public class ShorthandBasics {
    public static void main(String[] args) {
       
        int a = 10; 
        System.out.print("a=" + a);
        a += 5; 
        System.out.print(" a=" + a);
        a *= 2; 
        System.out.print(" a=" + a);
        a -= 4; 
        System.out.print(" a=" + a);
        a /= 2;
        System.out.print(" a=" + a);
        a %= 3; 
        System.out.println(" a=" + a);
        
        String s = "Bileta: "; 
        int n = 3; 
        s += n; 
        System.out.println(s);
        
        int p = 5; 
        p /= 2;
        System.out.println("p=" + p);
        
        double q = 5; 
        q /= 2;
        System.out.println("q=" + q);
    }
}
faza 3
public class MixPrePostShorthand {
    public static void main(String[] args) {
        
        int k = 3; // k = 3
        int r = ++k * 2 + k++ - 1;
       
        System.out.println("k = " + k + ", r = " + r); 
        
        int m = 8;
        m += ++k; 
        m *= k--;
        System.out.println("m = " + m + ", k = " + k);
        
        int t1 = 10 + ++k * 2; 
        int t2 = (10 + ++k) * 2; 
        System.out.println("t1 = " + t1 + ", t2 = " + t2);
    }
}
faza 4
import java.util.*;

public class TicketCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int biletaFillestare = 100;
        int shitje1 = 35;
        int shitje2 = 28;
        boolean bonusDitor = true;
        
        int stok = biletaFillestare;
        int totalBiletaShitura = 0;
        double teArdhura = 0;
        final int cmim = 40;
        
        System.out.println("Stok fillestar: " + stok);
       
        stok -= shitje1; 
        totalBiletaShitura += shitje1; 
        System.out.println("Shitje paradite: " + shitje1 + " → stok: " + stok);
       
        stok -= shitje2; 
        totalBiletaShitura += shitje2; 
        System.out.println("Shitje pasdite: " + shitje2 + " → stok: " + stok);
       
        teArdhura = totalBiletaShitura * cmim; 
        System.out.println("Totali i biletave të shitura: " + totalBiletaShitura);
        System.out.println("Të ardhurat bruto: " + teArdhura);
        
        if (bonusDitor) {
            double bonus = teArdhura * 0.05;
            teArdhura += bonus;
            System.out.println("Bonus 5% i aplikuar: " + bonus);
        }
        
        System.out.println("Të ardhurat neto: " + teArdhura);
        System.out.println("Raporto (lek, i rrumbullakuar): " + (int)Math.round(teArdhura));
        
        System.out.println();
       
        stok = biletaFillestare;
        totalBiletaShitura = 0;
        teArdhura = 0;
        bonusDitor = false;
       
        System.out.println("Stok fillestar: " + stok);
        
        stok -= shitje1; 
        totalBiletaShitura += shitje1;
        System.out.println("Shitje paradite: " + shitje1 + " → stok: " + stok);
        
        stok -= shitje2;
        totalBiletaShitura += shitje2;
        System.out.println("Shitje pasdite: " + shitje2 + " → stok: " + stok);
        
        teArdhura = totalBiletaShitura * cmim; 
        System.out.println("Totali i biletave të shitura: " + totalBiletaShitura);
        System.out.println("Të ardhurat bruto: " + teArdhura);
        
        if (bonusDitor) {
            double bonus = teArdhura * 0.05;
            teArdhura += bonus;
            System.out.println("Bonus 5% i aplikuar: " + bonus);
        }
        
   
        System.out.println("Të ardhurat neto: " + teArdhura);
        System.out.println("Raporto (lek, i rrumbullakuar): " + (int)Math.round(teArdhura));
    }
}
faza 5 
public class FixTheBugs {
    public static void main(String[] args) {
        int v = 10;
        System.out.println(v++ + ++v); 
        
        v += 2 * 5;
     
        double d = 5;
        d /= 2;
        System.out.println("v=" + v + ", d=" + d);
    }
}

