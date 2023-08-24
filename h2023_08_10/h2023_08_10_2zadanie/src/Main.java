import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите суммарную стоимость покупок: ");
        double totalCost = scanner.nextDouble();
        System.out.println("Сумма денег,которую дал покупатель");
        double howgivenMoney = scanner.nextDouble();

        double change = howgivenMoney - totalCost;
        int rubles = (int) change;
        int Kopeeks = (int) ((change - rubles) * 100);
        System.out.println("сумма сдачи " + rubles + " рублей и " + Kopeeks + " копеек");
    }
}