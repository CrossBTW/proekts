import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Закончился ли учебный год? да/нет: ");
        boolean YearFinished = scn.next().equalsIgnoreCase("да");

        System.out.println("Есть ли солнечная погода? да/нет: ");
        boolean goodWeather = scn.next().equalsIgnoreCase("да");

        System.out.println("туркружок закупил дождевики? да/нет: ");
        boolean isHasBoughtRaincoats = scn.next().equalsIgnoreCase("да");

        System.out.println("Тренер Джим свободен от экзамена? да/нет: ");
        boolean isJimiFree = scn.next().equalsIgnoreCase("да");

        System.out.println("Тренер Кейт вернулась из путешествия? да/нет: ");
        boolean isKateComeback = scn.next().equalsIgnoreCase("да");
        boolean willGoHiking = (YearFinished && (goodWeather || isHasBoughtRaincoats)) && (isJimiFree ^ isKateComeback);
        System.out.println("Состоится ли поход? " + (willGoHiking ? "Да" : "Нет"));
    }
}