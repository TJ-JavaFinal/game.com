import java.util.Random;
import java.util.Scanner;

public class puzzle {
    public static void main(String[] args){

        bombDifussal();

    }



    public static void bombDifussal(){

       System.out.println("              BOMB DIFFUSAL\n");
       System.out.println("there is a bomb in this room and it looks like you need to cut one of the wires.\n"+
               "there is also something in the lamp shade and something in the corner of the room\n"+
               " type corner for the corner of the room, bomb for the bomb,and lamp for the lamp.");
        puzzle.bombMETHOD();
    }
    public static void bombMETHOD() {
        Random random = new Random();
        int randColor = random.nextInt(4) + 1;
        Scanner key = new Scanner(System.in);
        String clue = "spooky scary skeletons";
        String falseClue = "send shivers down your spine";
        String wireColor = "shrieking skulls will shock your soul, seal your doom tonight.";

        if (randColor == 1) {
            wireColor = "blue";
            clue = "water";
            falseClue="darkness";
        } else if (randColor == 2) {
            wireColor = "green";
            clue = "growth";
            falseClue="blazing sun";
        } else if (randColor == 3) {
            wireColor = "white";
            clue = "light";
            falseClue="skeleton";
        } else if (randColor == 4) {
            wireColor = "red";
            clue = "fire";
            falseClue="1998";
        }


        boolean clueBoolean = true;
        while (clueBoolean) {
            System.out.println("what do you want to investigate?");
            String INoption = key.next();
            if (INoption.equalsIgnoreCase("corner")) {
                System.out.println("you find a paper that has " + falseClue + " written on it");
            }
            else if (INoption.equalsIgnoreCase("lamp")) {
                System.out.println("you find a paper that has " + clue + " written on it");
            }
            else if (INoption.equalsIgnoreCase("bomb"))
                clueBoolean = false;
        }
        System.out.println("the bomb has 4 wires; blue, green, white and red");
        System.out.println("what wire do you decide to cut?");
        String INcolor = key.next();

        if(INcolor.equalsIgnoreCase("blue")){
            if(wireColor=="blue"){
                System.out.println("you managed to cut the correct wire.\n"+"you move on to the next door.");
            }
            else{ System.out.println("you didn't cut the correct wire\n"+" you are reset");}
        }
        else if(INcolor.equalsIgnoreCase("green")){
            if(wireColor=="green"){
                System.out.println("you managed to cut the correct wire.\n"+"you move on to the next door.");
            }
            else{ System.out.println("you didn't cut the correct wire\n"+" you are reset");}
        }
        else if(INcolor.equalsIgnoreCase("white")){
            if(wireColor=="white"){
                System.out.println("you managed to cut the correct wire.\n"+"you move on to the next door.");
            }
            else{ System.out.println("you didn't cut the correct wire\n"+" you are reset");}
        }
        else if(INcolor.equalsIgnoreCase("red")){
            if(wireColor=="red"){
                System.out.println("you managed to cut the correct wire.\n"+"you move on to the next door.");
            }
            else{ System.out.println("you didn't cut the correct wire\n"+" the bomb explodes");}
        }
        else if(INcolor.equalsIgnoreCase("black")) {
            System.out.println("you somehow managed to not cut any of the wires in the bomb instead you cut the wires connecting the outlet to the lamp.\n"+
                    "you get abducted by aliens and they move you to the start.");
        }
    }
}