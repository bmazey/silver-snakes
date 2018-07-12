package WC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

import static javax.swing.UIManager.get;

public class Game {

    private static WorldCupMap myWCMap = new WorldCupMap();
    private static Map<String, String> Quarters = myWCMap.createQuarters();
    private static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
    private static Map<String, String> groupPhase = myWCMap.createGroupPhaseMap();

    private static WorldCupWinner giveWinnerMap = new WorldCupWinner();
    private static Map<String, String> QuartersW = giveWinnerMap.QuartersWinner();
    private static Map<String, String> SixteenthW = giveWinnerMap.SixteenWinner();
    private static Map<String, String> groupPhaseW = giveWinnerMap.GroupPhaseWinner();



    public static String gameGiver(Map<String, String> map){
        Random random = new Random();
        List<String> keys = new ArrayList<>(map.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()));
        String value = map.get(randomKey);
        System.out.print("Match : " + randomKey + " , winner : ");
        return value;
    }

    public static void main(String[] args) {
        System.out.print("Choose mode (easy/hard) : ");
        Scanner ModeChoosing = new Scanner(System.in);
        String Mode = ModeChoosing.next();

        String[] Maps = {"QuartersW", "SixteenthW", "groupPhaseW"};

        if (Mode == "easy") {
            System.out.println("Ok, in this mode you have to choose the winner of the match!\nRemember, keep your Caps lock on!!");
            for (int i = 0; i < 1;) {
                int m = 0;
                Map<String, String> Phase = Maps[m];
                gameGiver(Phase);


            }


        }

        String value6  = gameGiver(QuartersW);
        Scanner output6 = new Scanner(System.in);
        String guess6 = output6.nextLine();

        if (guess6.equals(value6)) {
            System.out.println("Congrats, you got the first level!");

            String value5  = gameGiver(SixteenthW);
            Scanner output5 = new Scanner(System.in);
            String guess5 = output5.nextLine();

            if (guess5.equals(value5)) {
                System.out.println("Congrats, you got the second level!");

                String value4  = gameGiver(groupPhaseW);
                Scanner output4 = new Scanner(System.in);
                String guess4 = output4.nextLine();

                if (guess4.equals(value4)) {
                    System.out.println("Congrats, you got the third level!");

                    String value3  = gameGiver(Quarters);
                    Scanner output3 = new Scanner(System.in);
                    String guess3 = output3.nextLine();

                    if (guess3.equals(value3)) {
                        System.out.println("Congrats, you got the fourth level!");

                        String value2  = gameGiver(Sixteenth);
                        Scanner output2 = new Scanner(System.in);
                        String guess2 = output2.nextLine();

                        if (guess2.equals(value2)) {
                            System.out.println("Congrats, you got the fifth level!");

                            String value1  = gameGiver(groupPhase);
                            Scanner output1 = new Scanner(System.in);
                            String guess1 = output1.nextLine();

                            if (guess1.equals(value1)) {
                                System.out.println("Congrats, you got it all!");
                            }
                            else { System.out.println("Sorry, wrong answer." +
                                    "\n" + "Here is the correct answer: " + value1); }
                        }
                        else { System.out.println("Sorry, wrong answer." +
                                "\n" + "Here is the correct answer: " + value2); }
                    }
                    else { System.out.println("Sorry, wrong answer." +
                            "\n" + "Here is the correct answer: " + value3); }
                }
                else{ System.out.println("Sorry, wrong answer." +
                        "\n" + "Here is the correct answer: " + value4); }
            }
            else { System.out.println("Sorry, wrong answer." +
                    "\n" + "Here is the correct answer: " + value5); }
        }
        else { System.out.println("Sorry, wrong answer." +
                "\n" + "Here is the correct answer: " + value6); }
    }

}