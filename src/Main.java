import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner game= new Scanner(System.in);
        String input=null;
        System.out.println("do you want to see the instructions?");
        game.next();
        if(input.equalsIgnoreCase("yes"))
        Game.instructions();

        System.out.println();
        Doors.Doors();
    }
}
