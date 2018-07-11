package WC;

import java.util.Scanner;
import java.util.Random;
import java.util.Map;
import java.util.*;

public class Game {

      //WorldCupMap worldCupMap;
      private static WorldCupMap myWCMap = new WorldCupMap();
     static Map<String, String> Quarters = myWCMap.createQuarters();
     static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
     static Map<String, String> groupPhase = myWCMap.createGroupPhaseMap();
    // private static String guess;

    public static void main (String[] args){
      /* Random rand = new Random();
       int resultToGuess = rand.nextInt(4);
       Scanner input = new Scanner(System.in);
       System.out.println(Quarters.get(resultToGuess));
       guess = input.next();
*/
        Random       random    = new Random();

        List<String> keys1      = new ArrayList<String>(groupPhase.keySet());
        String       randomKey1 = keys1.get( random.nextInt(keys1.size()) );
        String       value1     = groupPhase.get(randomKey1);
        System.out.println("Match : " + randomKey1 + " , result : ");
        Scanner input1 = new Scanner(System.in);
        String guess1 = input1.nextLine();

        List<String> keys2      = new ArrayList<String>(Sixteenth.keySet());
        String       randomKey2 = keys2.get( random.nextInt(keys2.size()) );
        String       value2     = groupPhase.get(randomKey2);
        System.out.println("Match : " + randomKey2 + " , result : ");
        Scanner input2 = new Scanner(System.in);
        String guess2 = input2.nextLine();

        List<String> keys3      = new ArrayList<String>(Quarters.keySet());
        String       randomKey3 = keys3.get( random.nextInt(keys3.size()) );
        String       value3     = groupPhase.get(randomKey3);
        System.out.println("Match : " + randomKey3 + " , result : ");
        Scanner input3 = new Scanner(System.in);
        String guess3 = input3.nextLine();

        if (guess1.equals(value1)){
            System.out.println("Congrats, you got it!");
        }
        else { System.out.println("Sorry, wrong answer.");}
    }

}
