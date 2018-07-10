package WC;

import java.util.HashMap;
import java.util.Map;

public class WorldCupMap {

    public Map<String, String> createGroupPhaseMap() {
        Map<String, String> groupPhase = new HashMap<>();
        groupPhase.put("RUS x KSA", "5-0");

        return groupPhase;
    }

    public Map<String, String> createSixteenPhaseMap() {
        Map<String, String> sixteenPhase = new HashMap<>();
        sixteenPhase.put("FRA x ARG", "4-3");
        sixteenPhase.put("ESP x RUS", "4-5");
        sixteenPhase.put("BRA x MEX", "2-0");
        sixteenPhase.put("SWE x SUI", "1-0");
        sixteenPhase.put("URU x POR", "2-1");
        sixteenPhase.put("CRO x DEN", "4-3");
        sixteenPhase.put("BEL x JPN", "3-2");
        sixteenPhase.put("COL x ENG", "4-5");


        return sixteenPhase;
    }

}
