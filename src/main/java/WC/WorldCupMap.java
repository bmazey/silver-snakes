package WC;

import java.util.HashMap;
import java.util.Map;

public class WorldCupMap {

    public Map<String, String> createGroupPhaseMap() {
        Map<String, String> groupPhase = new HashMap<>();
        groupPhase.put("RUS x KSA", "5-0");

        return groupPhase;
    }

    public Map<String, String> createQuarters() {
        Map<String, String> createQuarters = new HashMap<>();
        createQuarters.put("URU x FRA", "0-2");
        createQuarters.put("SWE x ENG", "0-2");
        createQuarters.put("BRA x BEL", "1-2");
        createQuarters.put("RUS x CRO", "2-2");
        return createQuarters;
    }
}
//