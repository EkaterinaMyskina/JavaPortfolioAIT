package homework22;

import java.util.HashSet;

public class OldProperty {
    public static void main(String[] args) {
        HashSet<String> hashSetOldProperty = new HashSet<>();
        hashSetOldProperty.add("Temple");
        hashSetOldProperty.add("Castle");
        hashSetOldProperty.add("Ruines");
        hashSetOldProperty.add("small house");


        for (String newP: hashSetOldProperty) {
            System.out.println(newP);
        }
    }
}

