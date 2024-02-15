
/*
Задание 1:
Напишите программу, которая запросит ввести ваш возраст,
и напишет, кем вы являетесь: ребенком, подростком,
взрослым либо стариком.*/

/*
    static public void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        if (age < 0 || age >= 123) {
            System.out.println("Столько не живут! Перепридумайте свой возраст.");
        } else {
            if (age >= 0 && age <= 11) {
                System.out.println("Вы ребенок");
            } else if (age >= 12 && age <= 19) {
                System.out.println("Вы подросток");
            } else if (age >= 20 && age <= 64) {
                System.out.println("Вы взрослый");
            } else {
                System.out.println("Вы мудрец");
            }
        }
        scanner.close();
    }
}
 */
/*
Напечатать в консоль все парные числа от 1 до 20
 */
package houmework01;
public class Homework07a {
    public static void main(String[] args) {
    for (int number = 1; number <= 20; number++) {
        if ((number % 2) == 0) {
            System.out.print(number + "\n");}
        }
    }
}