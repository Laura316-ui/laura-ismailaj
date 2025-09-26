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
