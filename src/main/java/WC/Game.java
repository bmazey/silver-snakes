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

    public static void main (String[] args) {
      /* Random rand = new Random();
       int resultToGuess = rand.nextInt(4);
       Scanner input = new Scanner(System.in);
       System.out.println(Quarters.get(resultToGuess));
       guess = input.next();
*/
        for (int i = 0; i < 1;) {
        Random random = new Random();
        List<String> keys = new ArrayList<String>(groupPhase.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()));
        String value = groupPhase.get(randomKey);
        System.out.print("Match : " + randomKey + ",\nresult : ");
        Scanner input = new Scanner(System.in);
        String guess = input.next();




            if (guess.equals(value)) {
                System.out.println("\nCongrats, you got it!");
            } else {
                System.out.println("\nSorry, wrong answer. \nThe result is : " + value + " .");
                i ++;
            }
        }
    }
}
