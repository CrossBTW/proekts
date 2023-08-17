import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину в метрах: ");
        double meters = scanner.nextDouble();

        double kilometers = meters / 1000;
        double miles = meters / 1609.34;
        double feet = meters * 3.28084;
        double yards = meters * 1.09361;
        double arshins = meters / 0.7112;

        System.out.println("Длина в метрах: " + meters);
        System.out.println("Длина в километрах: " + kilometers);
        System.out.println("Длина в милях: " + miles);
        System.out.println("Длина в футах: " + feet);
        System.out.println("Длина в аршинах: " + arshins);

        scanner.close();
    }
}