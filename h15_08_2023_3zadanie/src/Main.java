import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = scn.nextInt();
        if (year <= 1977) {
            System.out.println(year < 1935 ? "Элвис, еще не родился " : "Элвис жив!");
        }
        if (year > 1977) {
            System.out.println("Элвис, навсегда в наших сердцах! ");
        }
    }
}