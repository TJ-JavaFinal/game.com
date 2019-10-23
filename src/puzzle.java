import java.util.Random;
import java.util.Scanner;

public class puzzle {

    public static void randPUZZLE(int x) {
        // this is where the puzzle is randomized. if the x entered 1 it goes to the second door opening 
        Random random = new Random();
        int rand = random.nextInt(3) + 1;
        if (rand == 1)
            bombDifussal(x);
        if (rand == 2)
            password(x);
        if (rand == 3)
          keypad(x);
        }


        public static void bombDifussal(int x){

            System.out.println();
            System.out.println("there is a bomb in this room and it looks like you need to cut one of the wires.\n" +
                    "there is also something in the lamp shade and something in the corner of the room\n" +
                    " type corner for the corner of the room, bomb for the bomb,and lamp for the lamp.");
          bombMETHOD(x);
        }
        public static void bombMETHOD (int x) {
            Random random = new Random();
            int randColor = random.nextInt(4) + 1;
            Scanner key = new Scanner(System.in);
            String clue = "";
            String falseClue = "";
            String wireColor = "";

// the wire colors and the clues and false clues
            if (randColor == 1) {
                wireColor = "blue";
                clue = "water";
                falseClue = "darkness";
            } else if (randColor == 2) {
                wireColor = "green";
                clue = "growth";
                falseClue = "blazing sun";
            } else if (randColor == 3) {
                wireColor = "white";
                clue = "light";
                falseClue = "skeleton";
            } else if (randColor == 4) {
                wireColor = "red";
                clue = "fire";
                falseClue = "1998";
            }


            boolean clueBoolean = true;

            while (clueBoolean) {
                System.out.println("what do you want to investigate?");
                String INoption = key.next();
                if (INoption.equalsIgnoreCase("corner")) {
                    System.out.println("you find a paper that has " + falseClue + " written on it");
                } else if (INoption.equalsIgnoreCase("lamp")) {
                    System.out.println("you find a paper that has " + clue + " written on it");
                } else if (INoption.equalsIgnoreCase("bomb"))
                    clueBoolean = false;
            }
            System.out.println("the bomb has 4 wires; blue, green, white and red");
            System.out.println("what wire do you decide to cut?");
            String INcolor = key.next();


            // what happens if they cut the right and wrong wire
            if (INcolor.equalsIgnoreCase("blue")) {
                if (wireColor == "blue") {
                    System.out.println("you managed to cut the correct wire.\n" + "you move on to the next door.");

                    if(x==1)
                        Doors.secondRoomDoors();
                    if(x==2)
                        Doors.exitDoors();
                } else {
                    System.out.println("you didn't cut the correct wire\n" + " the bomb explodes");
                }
            } else if (INcolor.equalsIgnoreCase("green")) {
                if (wireColor == "green") {
                    System.out.println("you managed to cut the correct wire.\n" + "you move on to the next door.");
                    if(x==1)
                        Doors.secondRoomDoors();
                    if(x==2)
                        Doors.exitDoors();
                } else {
                    System.out.println("you didn't cut the correct wire\n" + " the bomb explodes");
                    Doors.Doors();
                }
            } else if (INcolor.equalsIgnoreCase("white")) {
                if (wireColor == "white") {
                    System.out.println("you managed to cut the correct wire.\n" + "you move on to the next door.");
                    if(x==1)
                        Doors.secondRoomDoors();
                    if(x==2)
                        Doors.exitDoors();
                } else {
                    System.out.println("you didn't cut the correct wire\n" + " the bomb explodes");
                }
            } else if (INcolor.equalsIgnoreCase("red")) {
                if (wireColor == "red") {
                    System.out.println("you managed to cut the correct wire.\n" + "you move on to the next door.");
                    if(x==1)
                        Doors.secondRoomDoors();
                    if(x==2)
                        Doors.exitDoors();
                } else {
                    System.out.println("you didn't cut the correct wire\n" + " the bomb explodes");
                }
                // easter egg
            } else if (INcolor.equalsIgnoreCase("black")) {
                System.out.println("you somehow managed to not cut any of the wires in the bomb instead you cut the wires connecting the outlet to the lamp.\n" +
                        "you get abducted by aliens and they move you to the next room.");
                if(x==1)
                    Doors.secondRoomDoors();
                if(x==2)
                    Doors.exitDoors();
            }
        }


        public static void keypad (int x) {
        ///puzzle of a code that you have to enter to exit
            System.out.println();
            System.out.println("this room has a keypad by the door you need to exit.");
            System.out.println("you also see a box in the center of the room something on a shelf, something on a table " +
                    ",something in the lamp, and something in the plant");
            keypadMethod(x);
        }


        ///puzzle 2

        public static void keypadMethod (int x) {
            boolean when = true;
            int count = 0;
            Scanner keyboard = new Scanner(System.in);
            String input;
            int[] randcode = new int[4];
            Random random = new Random();
            int[] code = new int[4];

            for (int i = 0; i < randcode.length; ++i) {
                randcode[i] = random.nextInt(9);
            }
            while (when) {
                System.out.println("what do you want to look at?");
                input = keyboard.next();

                if (input.equalsIgnoreCase("lamp"))
                    System.out.println(random.nextInt(9));
                else if (input.equalsIgnoreCase("shelf"))
                    System.out.println("you find 1  " + randcode[0] + " on a paper taped onto the shelf");
                else if (input.equalsIgnoreCase("table"))
                    System.out.println("you find 2  " + randcode[1] + " carved into the table");
                else if (input.equalsIgnoreCase("box"))
                    System.out.println("you find 3  " + randcode[2] + " written on the box.");
                else if (input.equalsIgnoreCase("plant"))
                    System.out.println("you find 4  " + randcode[3] + " written on the pot of the plant");
                else if (input.equalsIgnoreCase("door")) {
                    System.out.println("what code do you enter?");
                    for (int j = 0; j < code.length; ++j) {
                        System.out.println("enter digit " + (j + 1));
                        code[j] = keyboard.nextInt();
                    }

                    for (int k = 0; k < code.length; ++k) {
                        if (code[k] == randcode[k])
                            count++;
                        System.out.println();
                        if (count == 4) {
                            System.out.println("you hear a ding as the door swings open.");
                            when = false;
                            if(x==1)
                                Doors.secondRoomDoors();
                            if(x==2)
                                Doors.exitDoors();

                        }
                        else{
                            System.out.println("you hear a loud beep.");
                        }
                    }
                }
            }
        }


        // puzzle 3

        public static void password(int x) {
            System.out.println();
            System.out.println("in this room you find a door with a microphone next it.\n" +
                    "and a chest, a lamp, and a taco box");
            passwordMETOD(x);


        }
        public static void passwordMETOD (int x) {
            boolean when = true;
            Scanner key = new Scanner(System.in);
            String input ;
            String password = "";
            String answer = "";
            Random random = new Random();
            int rand = random.nextInt(3) + 1;
          if (rand == 1)
                answer = "rock";
            if (rand == 3)
                answer = "scissors";
            if (rand == 2)
                answer = "paper";






            while (when) {
                System.out.println("what do you want to look at?");
                input = key.next();
                if (input.equalsIgnoreCase("lamp")){
                    System.out.println("you find a paper that says rock");
                    if ( answer == "rock")
                    System.out.println(":}");
                }
                else if (input.equalsIgnoreCase("taco")){
                    System.out.println("you find a paper that says paper");
                if ( answer == "paper")
                    System.out.println(":}");
                }
                else if (input.equalsIgnoreCase("chest")) {
                    System.out.println("you find a paper that says scissors");
                    if ( answer == "scissors")
                        System.out.println(":}");
                }
                else if (input.equalsIgnoreCase("door")) {
                    System.out.println("what do you say?");
                     password=key.next();
                    if (password.equalsIgnoreCase( answer)) {
                        System.out.println("you hear a ding as the door swings open.");
                        when = false;
                        if(x==1)
                            Doors.secondRoomDoors();
                        if(x==2)
                            Doors.exitDoors();


                    } else {
                        System.out.println("the door makes a loud beep.");
                    }
                }
            }
        }

}