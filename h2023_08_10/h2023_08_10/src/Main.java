import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину в метрах: ");

        double meters = scanner.nextDouble();
        double kilometers = meters / 1000;
        double miles = meters / 1609.34;
        double feet = meters * 3.28084;
        double yards = meters * 1.09361;
        double arshin = meters / 0.7112;

        System.out.println("длина в метрах: " + meters);
        System.out.println("длина в километрах: " + kilometers);
        System.out.println("длина в милях: " + miles);
        System.out.println("длина в футах: " + feet);
        System.out.println("длина в аршинах: " + arshin);
    }
}