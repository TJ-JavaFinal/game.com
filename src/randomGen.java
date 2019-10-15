import java.util.Random;
public class randomGen {

    public static void randomcolor(){
Random random = new Random();
String wireColor="you shouldn't see this....";
int randColor = random.nextInt(4)+1;

     if(randColor==1)
         wireColor = "blue";
     else if(randColor==2)
         wireColor = "green";
     else if(randColor==3)
         wireColor = "white";
     else if(randColor==4)
         wireColor = "red";

    }
    public static void randomNum(){
        Random random = new Random();

        int randColor = random.nextInt(4)+1;

    }
}
