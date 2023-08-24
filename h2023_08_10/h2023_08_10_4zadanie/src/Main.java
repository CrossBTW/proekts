import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scn.nextInt();

        int quotient = 0; //quotient это частное я у Антона спрашивал
        while (number >= 2) {
            number -= 2;
            quotient++;
        }
        System.out.println("Результат деления: " + quotient);
    }
}