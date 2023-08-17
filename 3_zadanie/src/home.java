import java.util.Random;
import java.util.UUID;

public class home {
public static void main(String[] args) {

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
        String stringLine = String.valueOf(boleenValue);
        System.out.println("Произвольный знак = " + stringLine);}
}