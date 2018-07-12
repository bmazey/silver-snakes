package WC;

import java.util.*;

public class testing {

    private static WorldCupMap myWCMap = new WorldCupMap();
    static Map<String, String> Quarters = myWCMap.createQuarters(); //4
    static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap(); //5
    static Map<String, String> groupPhase = myWCMap.createGroupPhaseMap(); //6

    private static WorldCupWinner giveWinnerMap = new WorldCupWinner();
    static Map<String, String> QuartersW = giveWinnerMap.QuartersWinner(); //1
    static Map<String, String> SixteenthW = giveWinnerMap.SixteenWinner(); //2
    static Map<String, String> groupPhaseW = giveWinnerMap.GroupPhaseWinner(); //3

    public ArrayList<Map<String, String>> levels;

    public void createLevels(){
        levels = new ArrayList<>();
        levels.add(0, QuartersW);
        levels.add(1, SixteenthW);
        levels.add(2, groupPhaseW);
        levels.add(3, Quarters);
        levels.add(4, Sixteenth);
        levels.add(5, groupPhase);
    }

    public static boolean gameGiver(Map<String, String> map){
        Random random = new Random();
        List<String> keys = new ArrayList<String>(map.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()));
        String value = map.get(randomKey);
        System.out.println("Match : " + randomKey + " , result : ");
        Scanner output = new Scanner(System.in);
        String type = output.nextLine();
        boolean result;
        if (type.equalsIgnoreCase(value)) {result = true;}
        else {result = false;}

        return result;
    }

    public static void main(String[] args){
        testing test = new testing();
        test.createLevels();
           System.out.println("");
       for (Map<String, String> map : test.levels) {
           boolean result = gameGiver(map);
           if (!result) {
               System.out.println("Sorry, you failed!");
               break;
           }
       }
    }

}
