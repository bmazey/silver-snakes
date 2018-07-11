package WC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Game {

 private static WorldCupMap myWCMap = new WorldCupMap();
 static Map<String, String> Quarters = myWCMap.createQuarters();
 static Map<String, String> Sixteenth = myWCMap.createSixteenPhaseMap();
 static Map<String, String> groupPhase = myWCMap.createGroupPhaseMap();

 private static WorldCupWinner giveWinnerMap = new WorldCupWinner();
 static Map<String, String> QuartersW = giveWinnerMap.QuartersWinner();
 static Map<String, String> SixteenthW = giveWinnerMap.SixteenWinner();
 static Map<String, String> groupPhaseW = giveWinnerMap.GroupPhaseWinner();

 public static void main(String[] args) {
     Random random = new Random();

     List<String> keys6 = new ArrayList<String>(QuartersW.keySet());
     String randomKey6 = keys6.get(random.nextInt(keys6.size()));
     String value6 = QuartersW.get(randomKey6);
     System.out.println("Match : " + randomKey6 + " , result : ");
     Scanner input6 = new Scanner(System.in);
     String guess6 = input6.nextLine();

     if (guess6.equals(value6)) {
         System.out.println("Congrats, you got the first level!");

         List<String> keys5 = new ArrayList<String>(SixteenthW.keySet());
         String randomKey5 = keys5.get(random.nextInt(keys5.size()));
         String value5 = SixteenthW.get(randomKey5);
         System.out.println("Match : " + randomKey5 + " , result : ");
         Scanner input5 = new Scanner(System.in);
         String guess5 = input5.nextLine();

         if (guess5.equals(value5)) {
             System.out.println("Congrats, you got the second level!");

             List<String> keys4 = new ArrayList<String>(groupPhaseW.keySet());
             String randomKey4 = keys4.get(random.nextInt(keys4.size()));
             String value4 = groupPhaseW.get(randomKey4);
             System.out.println("Match : " + randomKey4 + " , result : ");
             Scanner input4 = new Scanner(System.in);
             String guess4 = input4.nextLine();

             if (guess4.equals(value4)) {
                 System.out.println("Congrats, you got the third level!");

                 List<String> keys3 = new ArrayList<String>(Quarters.keySet());
                 String randomKey3 = keys3.get(random.nextInt(keys3.size()));
                 String value3 = Quarters.get(randomKey3);
                 System.out.println("Match : " + randomKey3 + " , result : ");
                 Scanner input3 = new Scanner(System.in);
                 String guess3 = input3.nextLine();

                 if (guess3.equals(value3)) {
                     System.out.println("Congrats, you got the fourth level!");

                     List<String> keys2 = new ArrayList<String>(Sixteenth.keySet());
                     String randomKey2 = keys2.get(random.nextInt(keys2.size()));
                     String value2 = Sixteenth.get(randomKey2);
                     System.out.println("Match : " + randomKey2 + " , result : ");
                     Scanner input2 = new Scanner(System.in);
                     String guess2 = input2.nextLine();

                     if (guess2.equals(value2)) {
                         System.out.println("Congrats, you got the fifth level!");

                         List<String> keys1 = new ArrayList<String>(groupPhase.keySet());
                         String randomKey1 = keys1.get(random.nextInt(keys1.size()));
                         String value1 = groupPhase.get(randomKey1);
                         System.out.println("Match : " + randomKey1 + " , result : ");
                         Scanner input1 = new Scanner(System.in);
                         String guess1 = input1.nextLine();

                         if (guess1.equals(value1)) {
                             System.out.println("Congrats, you got it all!");
                         }
                         else { System.out.println("Sorry, wrong answer."); }
                        }
                        else { System.out.println("Sorry, wrong answer."); }
                    }
                    else { System.out.println("Sorry, wrong answer."); }
                }
                  else{ System.out.println("Sorry, wrong answer."); }
                }
                else { System.out.println("Sorry, wrong answer."); }
            }
            else { System.out.println("Sorry, wrong answer."); }
        }

    }