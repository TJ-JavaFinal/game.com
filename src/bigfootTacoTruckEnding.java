import java.util.Scanner;

public class bigfootTacoTruckEnding {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("After you open the door you see a taco truck");
        System.out.println("What's in that taco truck is unknown so you get a choice:");

        System.out.println("\n 1- to look in the truck " +
                "\n 2- to ignore the truck \n choice >>>>");
        choice = input.nextInt();

        if(choice == 1 ){
            System.out.println("You choose to look in the truck after ");

        }
        else if(choice == 2){
            System.out.println("You chose to ignore the truck and have completed the game");

        }

//        public static void bigfootEnding(){
    }
}
