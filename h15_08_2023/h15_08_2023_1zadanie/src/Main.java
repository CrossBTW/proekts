import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int first = scanner.nextInt();
        System.out.println("Введите второе число ");
        int second = scanner.nextInt();
        int sum = 0;
        for (int i = Math.min(first, second); i <= Math.max(first, second); i++) {
            sum = sum += i;
            System.out.println(sum);
        }
    }
}