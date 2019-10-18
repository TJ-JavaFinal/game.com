import java.util.Scanner;

public class bigfootTacoTruckEnding {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("After you open the exit door you see a taco truck");
        System.out.println("What's in that taco truck is unknown so you get a choice:");

        System.out.println("\n 1- to look in the truck " +
                "\n 2- to ignore the truck \n choice >>>>");
        choice = input.nextInt();

        if(choice == 1 ){
            System.out.println("You choose to look in the truck");
            System.out.println("You then look in and see nonother than ");

        }
        else if(choice == 2){
            System.out.println("You chose to ignore the truck and have completed the game");

            System.out.println("So I guess this means you won the game Sooo... you can leave now congrats I guess.");
            System.out.println("                                    ");
            System.out.println("TTTTTTTTTT  H        H    EEEEEEEEEE");
            System.out.println("    T       H        H    E ");
            System.out.println("    T       H        H    E ");
            System.out.println("    T       HHHHHHHHHH    EEEEEEEEEE");
            System.out.println("    T       H        H    E ");
            System.out.println("    T       H        H    E ");
            System.out.println("    T       H        H    EEEEEEEEEE");

            System.out.println(" EEEEEEEEEE   N         N    D D  D ");
            System.out.println(" E            N N       N    D     D ");
            System.out.println(" E            N   N     N    D      D ");
            System.out.println(" EEEEEEEEEE   N     N   N    D       D");
            System.out.println(" E            N       N N    D      D");
            System.out.println(" E            N        NN    D     D");
            System.out.println(" EEEEEEEEEE   N         N    D D D ");

        }

//        public static void bigfootEnding(){
    }
}
