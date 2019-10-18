import java.util.Random;
import java.util.Scanner;

public class RockPaperBigfoot {
    public static void RockPaperScissorsBigfoot() {

        Scanner input = new Scanner(System.in);

        int Rock = 1;
        int Paper = 2;
        int Scissors = 3;
        int rand_pick;
        int userChoice;
        Random r = new Random();
        rand_pick = r.nextInt(3) + 1;

        System.out.println(" \n1-for Rock \n2-for Paper \n3-for Scissors");
        userChoice = input.nextInt();

        if (userChoice == 1) {
            if (rand_pick == 1)
                System.out.println("Tie");
            else if (rand_pick == 2) {
                System.out.println("Paper beats rock");
                System.out.println("Bigfoot beat you and killed out of anger");
            } else if (rand_pick == 3) {
                System.out.println("Rock beats Scissors");
                System.out.println("You beat bigfoot now he will take you to a world of beauty he calls it TACO WORLD");
            }

        } else if (userChoice == 2) {
            if (rand_pick == 2)
                System.out.println("Tie");
            else if (rand_pick == 1) {
                System.out.println("Paper beats rock");
                System.out.println("You beat bigfoot now he will take you to a world of beauty he calls it TACO WORLD");

            } else if (rand_pick == 3) {
                System.out.println("Scissors beats Paper");
                System.out.println("Bigfoot beat you and killed out of anger");
            } else if (userChoice == 3) {
                if (rand_pick == 3) {
                    System.out.println("Tie");
                } else if (rand_pick == 1) {
                    System.out.println("Rock beats Scissors");
                    System.out.println("Bigfoot beat you and killed out of anger");
                } else if (rand_pick == 2) {
                    System.out.println("Scissors beats Paper");
                    System.out.println("You beat bigfoot now he will take you to a world of beauty he calls it TACO WORLD");
                }

            }
        }
    }
}


