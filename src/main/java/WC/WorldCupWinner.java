package WC;

import java.util.LinkedHashMap;
import java.util.Map;

public class WorldCupWinner {
    public Map<String, String> GroupPhaseWinner() {
        Map<String, String> groupPhase = new LinkedHashMap<>();
        groupPhase.put("RUS x KSA", "RUS");
        groupPhase.put("EGY x URU", "URU");
        groupPhase.put("MAR x IRN", "IRN");
        groupPhase.put("POR x ESP", "tie");
        groupPhase.put("FRA x AUS", "FRA");
        groupPhase.put("ARG x ISL", "tie");
        groupPhase.put("PER x DEN", "DEN");
        groupPhase.put("CRO x NGA", "CRO");
        groupPhase.put("CRC x SRB", "SRB");
        groupPhase.put("GER x MEX", "MEX");
        groupPhase.put("BRA x SUI", "tie");
        groupPhase.put("SWE x KOR", "SWE");
        groupPhase.put("BEL x PAN", "BEL");
        groupPhase.put("TUN x ENG", "ENG");
        groupPhase.put("COL x JPN", "JPN");
        groupPhase.put("POL x SEN", "SEN");
        groupPhase.put("RUS x EGY", "RUS");
        groupPhase.put("POR x MAR", "POR");
        groupPhase.put("URU x KSA", "URU");
        groupPhase.put("IRN x ESP", "ESP");
        groupPhase.put("DEN x AUS", "tie");
        groupPhase.put("FRA x PER", "FRA");
        groupPhase.put("ARG x CRO", "CRO");
        groupPhase.put("BEL x TUN", "BEL");
        groupPhase.put("KOR x MEX", "KOR");
        groupPhase.put("GER x SWE", "SWE");
        groupPhase.put("ENG x PAN", "ENG");
        groupPhase.put("JPN x SEN", "SEN");
        groupPhase.put("POL x COL", "POL");
        groupPhase.put("URU x RUS", "URU");
        groupPhase.put("KSA x EGY", "KSA");
        groupPhase.put("ESP x MAR", "tie");
        groupPhase.put("IRN x POR", "tie");
        groupPhase.put("AUS x PER", "PER");
        groupPhase.put("DEN x FRA", "tie");
        groupPhase.put("NGA x ARG", "ARG");
        groupPhase.put("ISL x CRO", "CRO");
        groupPhase.put("KOR x GER", "KOR");
        groupPhase.put("MEX x SWE", "SWE");
        groupPhase.put("SRB x BRA", "BRA");
        groupPhase.put("SUI x CRC", "tie");
        groupPhase.put("JPN x POL", "POL");
        groupPhase.put("SEN x COL", "COL");
        groupPhase.put("PAN x TUN", "TUN");
        groupPhase.put("ENG x BEL", "BEL");

        return groupPhase;
    }

    public Map<String, String> QuartersWinner() {
        Map<String, String> createQuarters = new LinkedHashMap<>();
        createQuarters.put("URU x FRA", "FRA");
        createQuarters.put("SWE x ENG", "ENG");
        createQuarters.put("BRA x BEL", "BEL");
        createQuarters.put("RUS x CRO", "CRO");
        return createQuarters;
    }

    public Map<String, String> SixteenWinner() {
        Map<String, String> sixteenPhase = new LinkedHashMap<>();
        sixteenPhase.put("FRA x ARG", "FRA");
        sixteenPhase.put("ESP x RUS", "RUS");
        sixteenPhase.put("BRA x MEX", "BRA");
        sixteenPhase.put("SWE x SUI", "SWE");
        sixteenPhase.put("URU x POR", "URU");
        sixteenPhase.put("CRO x DEN", "CRO");
        sixteenPhase.put("BEL x JPN", "BEL");
        sixteenPhase.put("COL x ENG", "ENG");


        return sixteenPhase;
    }
}