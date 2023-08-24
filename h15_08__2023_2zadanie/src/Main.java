import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите первое однозначное число:");
        int num1 = scr.nextInt();
        System.out.println("Введите второе однозначное число:");
        int num2 = scr.nextInt();
        System.out.println("Умножьте два числа ");
        int num3 = scr.nextInt();
        if ((num1 * num2) > num3) {
            System.out.println("Ответ неверный");
        }
        if ((num1 * num2) < num3) {
            System.out.println("Ответ неверный");
        } else System.out.println("Правильный ответ " + (num1 * num2));
    }
}