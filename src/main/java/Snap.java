import java.util.Scanner;

public class Snap extends CardGame {
    private String player1;
    private String player2;
    private boolean snapOpportunity;
    private boolean gameOver;
    private String winner;
    private Card previousCard;
    Scanner scanner = new Scanner(System.in);

    public Snap() {
        super("Snap");
        snapOpportunity = false;
        gameOver = false;
        winner = null;
    }

    public void playGame() {
        PlayerUtils.introPrint();
        System.out.println("Player 1 - Enter your name: ");
        player1 = scanner.nextLine();
        System.out.println("Player 2 - Enter your name here: ");
        player2 = scanner.nextLine();
        System.out.println("Players: " + player1 + " and " + player2);
        System.out.println("Press enter to take your turn " + player1);

        while (!gameOver) {
            scanner.nextLine();
            shuffleDeck();
            previousCard = dealCard();
            scanner.nextLine();
            Card card = dealCard();
            if (deckOfCards.size() >= 2) {
                if (card.getSymbol().equals(previousCard.getSymbol())) {
                    snapOpportunity = true;
                }
            }
            if (snapOpportunity) {
                System.out.println("Snap opportunity! Type 'snap' within 2 seconds to win: ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("snap")) {
                    winner = getCurrentPlayer();
                    gameOver = true;
                    break;
                } else {
                    System.out.println("Time's up! You missed the opportunity to snap.");
                }
            }
        }

        System.out.println("Game over!");
        if (winner != null) {
            System.out.println("Congratulations " + winner + "! You won.");
        } else {
            System.out.println("No winner. Better luck next time!");
        }
    }

    private String getCurrentPlayer() {
        return snapOpportunity ? player2 : player1;
    }
}

