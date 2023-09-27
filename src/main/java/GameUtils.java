import java.util.Scanner;

public class GameUtils extends CardGame {

    private static Scanner scanner = new Scanner(System.in);

    public GameUtils(String name) {
        super(name);
    }


    public static void introPrint() {
        System.out.println("*** Welcome to\u001B[31m Sneak-Diss Snap\u001B[0m ***");
        System.out.println("*** Get ready for\u001B[31m the best\u001B[0m fast-paced card experience  of your life...***");
        System.out.println("*** This is a 2-player game so if you don't have a friend...\u001B[31m get one\u001B[0m ***");
        System.out.println("*** Take it in turns with your friend...\u001B[31m obviously\u001B[0m...to press enter ***");
        System.out.println("*** Each time you press enter, a card is dealt");
        System.out.println("*** If the card being dealt is the same as the card already on the deck..");
        System.out.println("*** Then you have 2 seconds to type SNAP *** ");
        System.out.println("*** Well then...I guess you've won and then we can\u001B[31m move on to grown-up games\u001B[0m ***");
    }
}
