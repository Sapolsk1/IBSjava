import java.util.Scanner;

/**
 * @author Nursultan Unbaev
 * Готов переработать данное задание, так как есть вопросы
 * по реализации ввода x,y,z.
 * Также интересно нужно ли использовать тип int?
 */

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое значение x = ");
        double x = scanner.nextInt();
        System.out.println("Введите первое значение y = ");
        double y = scanner.nextInt();
        System.out.println("Введите первое значение z = ");
        double z = scanner.nextInt();

        double b = x + y + z;
        double a = b / 2;

        System.out.println(Math.floor(a));
        if (a > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
