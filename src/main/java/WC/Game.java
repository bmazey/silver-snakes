package WC;

import java.util.Scanner;
import java.util.Random;
import java.util.Map;

public class Game {

      //WorldCupMap worldCupMap;
      private static WorldCupMap myWCMap = new WorldCupMap();
     static Map<String, String> Quarters = myWCMap.createQuarters();
     static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
     static Map<String, String> GroupPhase = myWCMap.createGroupPhaseMap();
     private static String guess;

    public static void main (String[] args){
       Random rand = new Random();
       int resultToGuess = rand.nextInt(4);
       Scanner input = new Scanner(System.in);
       System.out.println(Quarters.get(resultToGuess));
       guess = input.next();


    }

}
