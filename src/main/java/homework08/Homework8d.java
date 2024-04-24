package homework08;
/*
Задание 4: Пользователь вводит число. Посчитать суммму всех его цифр.
Например, для числа одна тысяча двести тридцать четыре (1234) результат будет 10

Подсказка: разряды
 */
import java.util.Scanner;
public class Homework8d {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for ( ; num > 0; num /= 10) // num/=10 это то же самое, что n = n/10;
            sum += num % 10;   // то же, что и sum = sum + n % 10; n%10. Пример: n=1234, мы делим 1234/10 и берем остаток по модулю, т.е. 123,4, остаток по модулю = 4
        System.out.println(sum);
    }
}

/*
def digit_sum(number): total = 0 while number > 0: total += number % 10 number /= 10 return total

It’s correct but don’t understand how it works
Answer 55cab0ef9376769146000414
3 votes

Permalink

I hope this helps clarify some things with an example:

Take the number n = 1234.

Using modulo (%) just as CodeAcademy said in its instructions, % helps gives you the rightmost digit since its function is basically taking the remainder. So if we do 1234 % 10 (n % 10) , that gives us 4. We add 4 to your total

But how do we isolate the remaining digits? Then we need to use /. By dividing 1234 / 10 (n / 10) AFTER we took the rightmost digit, 4, into our sum we get 123. (Otherwise what’s the point of getting rid of 4 if we never included it in our sum?)

And then the while loop this over and over again until n > 0, because 0/10 gives us an error that disrupts the loop.

Just to help you visualize the loop it should do this: 1234 % 10 (total = 4) 1234 / 10 (n is now 123 and still > 0)

123 % 10 (total = 4 + 3) 123 / 10 (n is now 12 and still > 0)

12 % 10 (total = 4 + 3 + 2) 12 / 10 ( n is now 1 and still > 0)

1 % 10 (total = 4 + 3 + 2 + 1) 1/10 (n is now 0. This makes the while condition ( n > 0) False and the loop breaks and returns the sum of 4 + 3 + 2 + 1 which is 10)

 */
