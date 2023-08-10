import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {

        //1

        Random random = new Random();
        long longValue = random.nextLong(10000000);
        System.out.println("Значение Long = " + longValue + ";");
        int intValue = random.nextInt(1500);
        System.out.println("Значение Inter = " + intValue + ";");
        float floatValue = (intValue/10)+random.nextFloat();
        System.out.println("Значение Float = " + floatValue + ";");
        double doubleValue = random.nextDouble();
        System.out.println("Значение Double = " + doubleValue + ";");
        double tempValue = random.nextDouble(20.5, 65.2);
        System.out.println("Значение Temperature = " + tempValue + "град;");
        boolean boleenValue = random.nextBoolean();
        System.out.println("Значение Boolean = " + boleenValue + ";");
        String stringValue = UUID.randomUUID().toString();
        System.out.println("Произвольная строка символов = " + stringValue);


        //2

        System.out.println("Задание №2 - ввод данных Scanner data и Random ");
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scr.nextLine();
        System.out.print("Введите ваш возраст: " + " полных лет.");
        int age = scr.nextInt();
        System.out.println("Уважаемый " + name + " в свои " + age + " Вы для нас дороги как золото!");
        

    }
}
