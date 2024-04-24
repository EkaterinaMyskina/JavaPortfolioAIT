package homework09;

public class Test09 {
    public static void main(String[] args) {


        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Character.toString(0x1F60E));
            }
            System.out.println();
        }
    }
}
