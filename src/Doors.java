import java.util.Scanner;

public class Doors {
    public static void main(String[] args){
//    public static void Doors(){

        int choice;
        boolean doorsActive = true;

            Scanner input = new Scanner(System.in);
            //this is where you choose between the three doors and which ever door you choose you will get a randomly generated puzzle that chooses out of three puzzles
            System.out.println("Choose a door! \n 1- for Door 1 " +
                    "\n 2- for Door 2 \n 3 - for Door 3 \n choice >>>>");
            choice = input.nextInt();
            // this tells you which door you have chosen
            System.out.println("You chose Door Number " + choice + " now you will have to complete a puzzle in this room to be able go on to the next choices of rooms.");

            puzzle.bombDifussal();

             doorsActive = false;


        }


    public static void secondRoomDoors() {
        int choice;

        Scanner input = new Scanner(System.in);
        //this is where you choose between the two doors and which ever door you choose you will again get a randomly generated puzzle that chooses out of three puzzles
        System.out.println("Choose a door! \n 1- for Door 1 " +
                "\n 2- for Door 2 \n choice >>>>");
        choice = input.nextInt();
        puzzle.bombDifussal();





    }
    public static void exitDoors() {
        // this is where it will tell you you've reached the end but will give you a choice
        System.out.println("Congratulations you have found the exit door you can finally leave");
        System.out.println(" _________________________");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|      ___________        |");
        System.out.println("|     |           |       |");
        System.out.println("|     |           |       |");
        System.out.println("|     |           |       |");
        System.out.println("|     |___________|       |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                   ____  |");
        System.out.println("|                  |    | |");
        System.out.println("|                  |  P | |");
        System.out.println("|                  |  U | |");
        System.out.println("|                  |  S | |");
        System.out.println("|                  |  H | |");
        System.out.println("|                  |____| |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println(" _________________________");

        bigfootTacoTruckEnding.bigfootTacoTruckEnding();






    }
}
