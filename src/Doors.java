import java.util.Scanner;

public class Doors {

    public static void main(String[] args) {

        int choice;
        boolean doorsActive = true;
        while (doorsActive) {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose a door! \n 1- for Door 1 " +
                    "\n 2- for Door 2 \n 3 - for Door 3 \n choice >>>>");
            choice = input.nextInt();
            System.out.println("You choose Door Number " + choice + " now you will have to complete a puzzle in this room to be able go on to the next choices of rooms.");


        }
    }

    public static void secondRoomDoors() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a door! \n 1- for Door 1 " +
                "\n 2- for Door 2 \n choice >>>>");
        choice = input.nextInt();



    }
}
