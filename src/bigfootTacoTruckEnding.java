import java.util.Scanner;

public class bigfootTacoTruckEnding {
    public static void bigfootTacoTruckEnding(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("After you open the exit door you see a taco truck");
        taco.truck();

        System.out.println("What's in that taco truck is unknown so you get a choice:");

        System.out.println("\n 1- to look in the truck " +
                "\n 2- to ignore the truck \n choice >>>>");
        // choose between looking in or walking away from the truck
        choice = input.nextInt();

        if(choice == 1 ){
            // tells you what happens after you choose to look in the truck
            System.out.println("You choose to look in the truck");
            System.out.println("You then look in and see non other than The Man,The Myth, The Legend himself Bigfoot ");
            System.out.println("When he sees you think he's going to attack but he holds out two tacos and offers you to sit at the front of the truck");
            System.out.println("You then proceed to open and eat the delicious Bigfoot made taco after you're done you crumble up the wrapper and throw it behind you");
            System.out.println("When bigfoot sees the wrapper he looks intensely at you with anger he grabs and brings you to the back of the truck");
            System.out.println("He takes his left hand and lays it flat out so his palm is facing upward");
            System.out.println("He then makes his right hand a fist and slams it onto his left hand");
            System.out.println("You then realize he has challenged you to a game of rock, paper, scissors");
            RockPaperBigfoot.RockPaperScissorsBigfoot();
            // If you lose against bigfoot it then prints out THE END
            // If you win against bigfoot it then prints out something about going to a special place

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
        else if(choice == 2){
            System.out.println("You chose to ignore the truck and have completed the game");
            //this what happens when you choose to ignore the truck
            // it's an automatic end and nothing goes on after that and prints THE END

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


    }
}
