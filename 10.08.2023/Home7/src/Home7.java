import java.util.Scanner;

public class Home7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int quotient = 0;
        while (number >= 2) {
            number -= 2;
            quotient++;
        }

        System.out.println("Результат деления: " + quotient);

        scanner.close();
    }
}
