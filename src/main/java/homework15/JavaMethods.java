package homework15;

public class JavaMethods {
    public static void main(String[] args) {
        printNames("Anna","Alex","Maria");
        printNames("Max");
        printNames("Julia","Romeo","Alla","Inna");

    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    static int yearSalary = 0;
    public static int addSalary(int monthSalary) {
     return   yearSalary = yearSalary + monthSalary ;
    }
    public static int addSalary(int monthSalary, int smallSalary) {
     return   yearSalary = yearSalary + monthSalary + smallSalary;
    }

    public static void printNames(String... names){
        for (String name: names) {
            System.out.println(name);
        }
    }
}
