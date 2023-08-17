
import java.util.Scanner;

public class home5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите суммарную стоимость покупок: ");
        double totalCost = scanner.nextDouble();

        System.out.print("Введите сумму денег, которую дал покупатель: ");
        double givenMoney = scanner.nextDouble();

        double change = givenMoney - totalCost;
        int rubles = (int) change;
        int kopeks = (int) ((change - rubles) * 100);

        System.out.println("Сумма сдачи: " + rubles + " рублей и " + kopeks + " копеек");

        scanner.close();
    }
}
