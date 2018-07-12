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
        levels.add(1, QuartersW);
        levels.add(2, SixteenthW);
        levels.add(3, groupPhaseW);
        levels.add(4, Quarters);
        levels.add(5, Sixteenth);
        levels.add(6, groupPhase);
    }

    public static boolean gameGiver(Map<String, String> map, String guess){
        Random random = new Random();
        List<String> keys = new ArrayList<String>(map.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()));
        String value = map.get(randomKey);
        System.out.println("Match : " + randomKey + " , result : ");
        boolean result;
        if (guess.equals(value)) { result = true; }
        else {result = false; }

        return result;
    }

    public static void main(String[] args){
        testing test = new testing();
        test.createLevels();
       for (Map<String, String> map : test.levels) {
          Scanner output = new Scanner(System.in);

           gameGiver(map)

       }
    }

}
