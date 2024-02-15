package lesson03;

public class Task01 {
    /**
     *  **Задача на конкатенацию строк:** Создайте две строковые переменные,
     * например, 'firstName' и 'lastName'.
     * Затем объедините их в одну строку 'fullName' и выведите результат на экран.
     */
    static String firstName = "Вининни Пух";
    static String lastName = "Пятачок";
    static String fullName = firstName + " " + lastName;

    public static void main(String[] args) {
        System.out.println (fullName);
        //System.out.println(firstName + lastName);
    }

}
