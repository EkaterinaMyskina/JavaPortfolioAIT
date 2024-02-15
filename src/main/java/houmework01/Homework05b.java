package houmework01;

public class Homework05b {
    public static void main(String[] args) {
        /*
       2. Задание на комбинирование операторов:
      Даны три целых числа x, y и z.
      Напишите программу, которая проверяет, лежит ли y между x и z.
      Ваша программа должна выводить true, если y находится между x и z, и false в противном случае.

         */

        int x = 10;
        int y = 15;
        int z = 30;
        boolean isBetween;
        // boolean isBetweenResult = (y>x) && (y<z);
        // System.out.println(isBetweenResult);

        if(x < y && y < z){
            isBetween=true;
            System.out.println(isBetween);
        }
        else {
            isBetween=false;
            System.out.println(isBetween);
        }
        //if(x-y < 0 && y-z < 0){

        // if((x>y && y>z) || (x<y && y<z) {

        }
    }

