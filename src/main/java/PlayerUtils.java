import java.util.Scanner;

public class PlayerUtils extends CardGame {

    private static Scanner scanner = new Scanner(System.in);

    public PlayerUtils(String name) {
        super(name);
    }

    public static void introPrint() {
        System.out.println("*** Welcome to Snap! ***");
    }
}
