package WC;

import java.util.HashMap;
import java.util.Map;

public class WorldCupMap {

    public Map<String, String> createGroupPhaseMap() {
        Map<String, String> groupPhase = new HashMap<>();
        groupPhase.put("RUS x KSA", "5-0");
        groupPhase.put("EGY x URU", "0-1");
        groupPhase.put("MAR x IRN", "0-1");
        groupPhase.put("POR x ESP", "3-3");
        groupPhase.put("FRA x AUS", "2-1");
        groupPhase.put("ARG x ISL", "1-1");
        groupPhase.put("PER x DEN", "0-1");
        groupPhase.put("CRO x NGA", "2-0");
        groupPhase.put("CRC x SRB", "0-1");
        groupPhase.put("GER x MEX", "0-1");
        groupPhase.put("BRA x SUI", "1-1");
        groupPhase.put("SWE x KOR", "1-0");
        groupPhase.put("BEL x PAN", "3-0");
        groupPhase.put("TUN x ENG", "1-2");
        groupPhase.put("COL x JPN", "1-2");
        groupPhase.put("POL x SEN", "1-2");
        groupPhase.put("RUS x EGY", "3-1");
        groupPhase.put("POR x MAR", "1-0");
        groupPhase.put("URU x KSA", "1-0");
        groupPhase.put("IRN x ESP", "0-1");
        groupPhase.put("DEN x AUS", "1-1");
        groupPhase.put("FRA x PER", "1-0");
        groupPhase.put("ARG x CRO", "0-3");
        groupPhase.put("BEL x TUN", "2-0");
        groupPhase.put("KOR x MEX", "2-0");
        groupPhase.put("GER x SWE", "1-2");
        groupPhase.put("ENG x PAN", "5-2");
        groupPhase.put("JPN x SEN", "1-2");
        groupPhase.put("POL x COL", "2-1");
        groupPhase.put("URU x RUS", "3-1");
        groupPhase.put("KSA x EGY", "2-1");
        groupPhase.put("ESP x MAR", "2-2");
        groupPhase.put("IRN x POR", "1-1");
        groupPhase.put("AUS x PER", "0-2");
        groupPhase.put("DEN x FRA", "0-0");
        groupPhase.put("NGA x ARG", "1-2");
        groupPhase.put("ISL x CRO", "1-2");
        groupPhase.put("KOR x GER", "2-0");
        groupPhase.put("MEX x SWE", "0-3");
        groupPhase.put("SRB x BRA", "0-2");
        groupPhase.put("SUI x CRC", "2-2");
        groupPhase.put("JPN x POL", "0-1");
        groupPhase.put("SEN x COL", "0-1");
        groupPhase.put("PAN x TUN", "1-2");
        groupPhase.put("ENG x BEL", "0-1");

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
