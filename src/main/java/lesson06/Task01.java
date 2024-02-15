package lesson06;

public class Task01 {
    /*
    Напишите программу, которая рассчитывает скидку на основе
    суммы покупки и стажа покупателя в магазине.
    Если сумма покупки превышает 1000,
    скидка составляет 10%
    Если стаж > 6 лет, скидка составляет %
     */

    public static void main(String [] args) {
        // покупательский стаж
        int experience = 6;

        // сумма покупок
        double sum = 2000;

        // скидка
        double discount = 0;
        //double totalSum = sum - discount;


        if(sum<1000) {
        System.out.println("Сумма покупки " + sum + " eвро");
        System.out.println("Стаж покупателя " + experience + " лет");
        System.out.println("Размер скидки " + (discount * 100) + " %" );
        System.out.println("Сумма скидки " + discount +  " евро");
        System.out.println("Итоговая сумма " + sum + " евро");
    }
    else {
        discount = 0.1;
        double discountSum = sum * discount;
        double sumToPay = sum - discountSum;
        if (experience > 5) {
            discount = 0.05;
            sumToPay = sumToPay - (sumToPay * discount);
        }

        System.out.println("Сумма покупки " + sum + " eвро");
        System.out.println("Стаж покупателя " + experience + "лет");
        System.out.println("Сумма скидки " + (sum - sumToPay) +  " евро");
        System.out.println("Итоговая сумма " + sumToPay + " евро");
    }

    double sumWithDiscount;

    if(sum > 1000) {
        discount = 0.1;
        sumWithDiscount = sum - (sum * discount);
        if(experience>5) {
            discount = 0.05;
            sumWithDiscount = sumWithDiscount - (sumWithDiscount * discount);
        }
    } else
        sumWithDiscount=sum;

        System.out.println("Cумма к оплате= " + sumWithDiscount);
        System.out.println("Ваша скидка состалвяет " + discount*100 + "%");
        System.out.println("Cумма скидки =" + (sum-sumWithDiscount));


    }
}
