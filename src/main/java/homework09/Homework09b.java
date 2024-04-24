package homework09;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/*
Задание: Программа "Угадай число" (со звездочкой)
Цель: Разработать консольную игру, в которой пользователь должен угадать случайно
сгенерированное число в пределах от 1 до 100. Программа должна давать подсказки после
каждой попытки, сообщая, больше или меньше введенное число, чем загаданное.
Игра продолжается до тех пор, пока число не будет угадано. После угадывания, программа
должна вывести количество попыток, потраченных на угадывание, и предложить пользователю
сыграть еще раз.
Шаги реализации:
    Генерация случайного числа.
        Использовать Math.random() для генерации случайного числа в заданном диапазоне (1-100).
    Основной игровой цикл.
        Использовать цикл (do-while или while), чтобы запросить у пользователя ввод числа до
        тех пор, пока не будет угадано загаданное число.
    Сравнение чисел и подсказки.
        Использовать условные операторы для сравнения введенного числа с загаданным и вывода
        подсказок ("слишком большое", "слишком маленькое").
    Подсчет попыток.
        Вести подсчет числа попыток, которые пользователь сделал для угадывания числа.
    Окончание игры и предложение повторить.
        После угадывания числа вывести количество попыток и спросить пользователя, хочет
        ли он сыграть еще раз.
        Если да, игра начинается заново с генерации нового случайного числа; если нет —
        программа завершается.
Дополнительные условия:
    Обеспечить обработку ввода, чтобы программа принимала только числа и корректно реагировала
    на некорректный ввод (например, буквы или символы).
    Можно добавить функционал для ограничения максимального количества попыток.
 */

import java.util.Scanner;

public class Homework09b {
    // public static void main(String[] args) {

    public static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int counter = 0;
        int goalNumber = getRandomNumber();
        boolean exit = false;

        System.out.println("Я загадал целое число"+"\uD83D\uDC7D" +". Отгадай его!");
        do {
            System.out.println("Введи cвой вариант от 1 до 100: ");
            int userNumberVariant = scanner.nextInt();
            counter++;
            if (userNumberVariant == goalNumber) {
                System.out.println("Поздравляю! Вы угадали число за " + counter + " попыток.");
                // тут начинается вывод музыки
                try {
                    File soundFile = new File("C:\\Users\\Kate\\Downloads\\zvuk-pobedyi-vyiigryisha.wav"); //Звуковой файл

                    //Получаем AudioInputStream
                    //Вот тут могут полететь IOException и UnsupportedAudioFileException
                    AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                    //Получаем реализацию интерфейса Clip
                    //Может выкинуть LineUnavailableException
                    Clip clip = AudioSystem.getClip();

                    //Загружаем наш звуковой поток в Clip
                    //Может выкинуть IOException и LineUnavailableException
                    clip.open(ais);

                    clip.setFramePosition(0); //устанавливаем указатель на старт
                    clip.start(); //Поехали!!!

                    //Если не запущено других потоков, то стоит подождать, пока клип не закончится
                    //В GUI-приложениях следующие 3 строчки не понадобятся
                    Thread.sleep(clip.getMicrosecondLength()/1000);
                    clip.stop(); //Останавливаем
                    clip.close(); //Закрываем
                } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                    exc.printStackTrace();
                } catch (InterruptedException exc) {}



                // тут заканчивается вывод музыки


                System.out.println("Хотите играть еще раз? Нажмите да, чтобы продолжить и нет, чтобы закончить: ");
                String replyExitOrNot = scanner.next();
                if (replyExitOrNot.equals("да")){
                    System.out.println("Ура! Продолжаем. ");
                    counter = 0;
                }
                else {
                    System.out.println("Спасибо за участие! Игра окончена. ");
                    exit = true;}

            } else {
                if (userNumberVariant > goalNumber) {
                    System.out.println("Загаданное число МЕНЬШЕ введенного");
                }
                else {System.out.println("Загаданное число БОЛЬШЕ введенного");}
            }
        }
        while (!exit);
        scanner.close();
    }
}

