import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Закончился ли учебный год? (да/нет): ");
        boolean isYearFinished = scanner.next().equalsIgnoreCase("да");

        System.out.print("Есть ли солнечная погода? (да/нет): ");
        boolean isGoodWeather = scanner.next().equalsIgnoreCase("да");

        System.out.print("Туркружок закупил дождевики? (да/нет): ");
        boolean hasBoughtRaincoats = scanner.next().equalsIgnoreCase("да");

        System.out.print("Тренер Джим свободен от экзамена? (да/нет): ");
        boolean isJimFree = scanner.next().equalsIgnoreCase("да");

        System.out.print("Тренер Кейт вернулась из путешествия? (да/нет): ");
        boolean hasKateComeBack = scanner.next().equalsIgnoreCase("да");

        boolean willGoHiking = false;

        if (isYearFinished && isGoodWeather) {
            if (hasBoughtRaincoats || (isJimFree && !hasKateComeBack) || (!isJimFree && hasKateComeBack)) {
                willGoHiking = true;
            }
        }

        System.out.println("Состоится ли поход? " + (willGoHiking ? "Да" : "Нет"));

        scanner.close();
    }
}
