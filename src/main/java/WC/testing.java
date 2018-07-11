package WC;

import java.util.*;

public class testing {

    private static WorldCupMap myWCMap = new WorldCupMap();
    static Map<String, String> Quarters = myWCMap.createQuarters();
    static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
    static Map<String, String> groupPhase = myWCMap.createGroupPhaseMap();

    private static WorldCupWinner giveWinnerMap = new WorldCupWinner();
    static Map<String, String> QuartersW = giveWinnerMap.QuartersWinner();
    static Map<String, String> SixteenthW = giveWinnerMap.SixteenWinner();
    static Map<String, String> groupPhaseW = giveWinnerMap.GroupPhaseWinner();

    public static String gameGiver(Map<String, String> map){
        Random random = new Random();
        List<String> keys = new ArrayList<String>(map.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()));
        String value = map.get(randomKey);
        System.out.println("Match : " + randomKey + " , result : ");

        return value;
    }

    public static void main(String[] args){
        String value1  = gameGiver(QuartersW);
        Scanner output1 = new Scanner(System.in);
        String guess1 = output1.nextLine();
        if (guess1.equals(value1)){
            System.out.println("Congrats");
        }
        else { System.out.println("Sorry");}
    }

}
