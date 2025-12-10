package Game;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char you, comp;
        int m, n;
        int yr = 0;
        int cr = 0;

        System.out.println("\n\n\n***** WELCOME TO PLAY ROCK, PAPER, SCISSOR *****\n");
        System.out.println("#RULES : ");
        System.out.println("1) ROCK WINS AGAINST SCISSOR.");
        System.out.println("2) SCISSOR WINS AGAINST PAPER.");
        System.out.println("3) PAPER WINS AGAINST ROCK.\n");

        System.out.print("HOW MANY MATCHES YOU WANT TO PLAY: ");
        m = sc.nextInt();

        System.out.println("\nFOR PAPER: P, FOR ROCK: R, FOR SCISSORS: S");

        for (int i = 0; i < m; i++) {
            n = rand.nextInt(100);
            System.out.print("\n -> ENTER YOUR CHOICE: ");
            you = sc.next().toUpperCase().charAt(0);

            if (you != 'P' && you != 'S' && you != 'R') {
                System.out.println("\n!!!! INVALID INPUT !!!!");
                i--;
                continue;
            }

            if (n < 30) {
                comp = 'P';
            } else if (n < 60) {
                comp = 'S';
            } else {
                comp = 'R';
            }

            System.out.println("\n -> COMPUTER'S CHOICE: " + comp);

            if (you == comp) {
                System.out.println("\nOOPS!! THIS MATCH IS A DRAW !!!!");
            } else if ((you == 'R' && comp == 'S') ||
                    (you == 'S' && comp == 'P') ||
                    (you == 'P' && comp == 'R')) {
                System.out.println("\nCONGRATULATIONS!! YOU WIN THIS MATCH !!!!");
                yr++;
            } else {
                System.out.println("\nBETTER LUCK NEXT TIME !! YOU LOSE THIS MATCH !!!!");
                cr++;
            }
        }

        if (yr > cr) {
            System.out.println("\nCONGRATULATIONS!! YOU WIN THE GAME !!!!");
        } else if (yr == cr) {
            System.out.println("\nOOPS!! GAME IS A DRAW !!!!");
        } else {
            System.out.println("\nBETTER LUCK NEXT TIME!! YOU LOSE THE GAME !!!!");
        }

        System.out.println("\nYOUR WINS : " + yr + " AND COMPUTER WINS : " + cr);
        System.out.println("\n******* THE END *******");
    }
}
