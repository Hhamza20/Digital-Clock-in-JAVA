import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter Time in Hours and minutes: ");
        a = kb.nextInt();
        b = kb.nextInt();
        Clock c1 = new Clock();
        c1.setTime(a, b);
        while (true) {
            c1.tick();
            System.out.println(c1.display());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clearScreen();
        }
    }

    public static void clearScreen() {
        // Clear console screen for Windows, Unix-like systems, and IDEs
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}