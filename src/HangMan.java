import java.util.Scanner;
// huge waste of time
public class HangMan {
    public static void main(String[] args) {
        String word = "word";
        Scanner key = new Scanner(System.in);
        String inputStr;
        boolean exit = true;
        int chances = 5;
        int  wrongCount=0;
        char[] rightLetter= new char[4];
        int winCount;

        while (exit) {
            winCount=0;
            System.out.println("enter a letter>>>>");
            inputStr = key.next();
            char input = inputStr.charAt(0);


            for (int i = 0; i < 4; i++) {


                if (word.charAt(i) == input) {
                    rightLetter[i]= input;
                    System.out.println("you got it right");
                }


                else
                    wrongCount += 1;


                 if (wrongCount == 4) {
                    chances--;
                    wrongCount=0;
                    System.out.println(" you lost a chance. " + chances + " chances left");

                }
               else if(rightLetter[i]==word.charAt(i))
                 winCount += 1;
            }

                if (chances == 0) {
                    System.out.println("you lose");
                    exit = false; }

            else if(winCount==4){
                System.out.println("you win!");
                exit=false;
                }
        }

    }
}



