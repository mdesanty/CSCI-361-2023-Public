package labs.sets_and_maps;

import java.util.HashMap;
import java.util.Map;

public class Plates {
    private Map<String, Integer> plateMap;

    public Plates() {
        plateMap = new HashMap<>();
    }

    public void buildMap() {
        // Implement me...
    }

    public void printCounts() {
        System.out.println("Number of Plates: " + plateMap.keySet().size());

        for (Map.Entry<String, Integer> entry : plateMap.entrySet())
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
    }
}