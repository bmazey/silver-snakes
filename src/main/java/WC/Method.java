package WC;

import java.util.Scanner;
import java.util.Random;
import java.util.Map;
import java.util.*;

public class Method {

    //WorldCupMap worldCupMap;
    private static WorldCupMap myWCMap = new WorldCupMap();
    static Map<String, String> Quarters = myWCMap.createQuarters();
    static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
    static Map<String, String> groupPhase = myWCMap.createGroupPhaseMap();
    private Random random = new Random();
    // private static String guess;

    public static void main (String[] args){
      /* Random rand = new Random();
       int resultToGuess = rand.nextInt(4);
       Scanner input = new Scanner(System.in);
       System.out.println(Quarters.get(resultToGuess));
       guess = input.next();
*/
        Random       random    = new Random();

        Method game = new Method();

//        List<String> keys3      = new ArrayList<String>(Quarters.keySet());
//        String       randomKey3 = keys3.get( random.nextInt(keys3.size()) );
//        String       value3     = Quarters.get(randomKey3);
//        System.out.println("Match : " + randomKey3 + " , result : ");
//        Scanner input3 = new Scanner(System.in);
//        String guess3 = input3.nextLine();

        String key = game.getRandomKey(Quarters);
        String guess = game.getUserInput(key);

        if (game.checkResult(Quarters, guess).isPresent()) {
            if (guess.equals(game.checkResult(Quarters, guess).get())) {
                System.out.println("Congrats!");
                // move
            }
            else {
                System.out.println("you lose!");
            }
        }


//        if (guess3.equals(value3)){
//            System.out.println("Congrats, you got the first level!");
//
//            List<String> keys2      = new ArrayList<String>(Sixteenth.keySet());
//            String       randomKey2 = keys2.get( random.nextInt(keys2.size()) );
//            String       value2     = Sixteenth.get(randomKey2);
//            System.out.println("Match : " + randomKey2 + " , result : ");
//            Scanner input2 = new Scanner(System.in);
//            String guess2 = input2.nextLine();
//
//            if (guess2.equals(value2)) {
//                System.out.println("Congrats, you got the second level!");
//
//                List<String> keys1      = new ArrayList<String>(groupPhase.keySet());
//                String       randomKey1 = keys1.get( random.nextInt(keys1.size()) );
//                String       value1     = groupPhase.get(randomKey1);
//                System.out.println("Match : " + randomKey1 + " , result : ");
//                Scanner input1 = new Scanner(System.in);
//                String guess1 = input1.nextLine();
//
//                if (guess1.equals(value1)){
//                    System.out.println("Congrats, you got it all!");
//                }
//                else { System.out.println("Sorry, wrong answer.");}
//            }
//            else { System.out.println("Sorry, wrong answer.");}
//        }
        else { System.out.println("Sorry, wrong answer.");}
    }

    public Optional<String> checkResult(Map<String, String> map, String key) {
        return Optional.ofNullable(map.get(key));
    }

    public String getRandomKey(Map<String, String> map) {
        List<String> keys = new ArrayList<>(map.keySet());
        String randomKey = keys.get(this.random.nextInt(keys.size()));
        return randomKey;
    }

    public String getUserInput(String randomKey) {
        System.out.println("Match : " + randomKey + ", result : ");
        Scanner input = new Scanner(System.in);
        String guess = input.nextLine();
        return guess;
    }

}