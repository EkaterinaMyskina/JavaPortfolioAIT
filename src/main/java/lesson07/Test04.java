package lesson07;
public class Test04 {
/* вывести факториалы всех натуральных чисел до 20*/

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            int res = 1;
            for (int j = 2; j <= i; j++) {
                res *= j;
            }
            System.out.println(i + "! = " + res);
        }
    }
}

