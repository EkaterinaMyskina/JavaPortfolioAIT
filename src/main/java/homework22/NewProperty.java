package homework22;

import java.util.HashSet;

public class NewProperty {
    public static void main(String[] args) {

        HashSet<String> hashSetNewProperty = new HashSet<>();
        hashSetNewProperty.add("small house");
        hashSetNewProperty.add("middle house");
        hashSetNewProperty.add("big house");

        for (String newP: hashSetNewProperty) {
            System.out.println(newP);
        }
    }
}

