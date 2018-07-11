package WC;

import java.util.*;

public class Game {

      //WorldCupMap worldCupMap;
      private static WorldCupMap myWCMap = new WorldCupMap();
     static Map<String, String> Quarters = myWCMap.createQuarters();
     static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
     static Map<String, String> GroupPhase = myWCMap.createGroupPhaseMap();
     private static String guess;

    public static void main (String[] args){
        Random       random    = new Random();
        List<String> keys      = new ArrayList<String>(groupPhase.keySet());
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        String       value     = groupPhase.get(randomKey);
        System.out.println("Match : " + randomKey + " , result : " + value);


    }

}
