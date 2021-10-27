import java.util.Scanner;

public class FinalHW {
    public static void main(String[] args) {
        System.out.println("Конвертер валют\nВведите текущий курс");
        Scanner scanner1 = new Scanner(System.in);
        double price = scanner1.nextDouble();
        System.out.println("Введите число вашей валюты: ");
        Scanner scanner2 = new Scanner(System.in);
        double rub = scanner2.nextDouble();
        System.out.print("Курс доллара ");
        System.out.printf("%.2f", price);
        System.out.print("\n");
        System.out.println("Количество рублей: " + rub);
        System.out.print("Количество ваших долларов ");
        System.out.printf("%.2f", rub / price);
    }
}
