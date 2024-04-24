package homework22;

import java.util.HashSet;

public class TestProperty {
    public static void main(String[] args) {
        HashSet<Property> comparePropertyOldAndNew = new HashSet<>();
        Property oldProperty1 =  new Property("Strasse 8, Frankfurt","house" );
        Property oldProperty2 = new Property("Mittwoch 38, Berlin", "klein house");
        Property oldProperty2Clone = new Property("Mittwoch 38, Berlin", "klein house");

        // добавляю Property в HashSet
        comparePropertyOldAndNew.add(oldProperty1);
        comparePropertyOldAndNew.add(oldProperty2);
        comparePropertyOldAndNew.add(oldProperty2Clone);

        System.out.println();
    }
}
