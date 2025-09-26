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

