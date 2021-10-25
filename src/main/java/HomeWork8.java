import java.util.*;


public class HomeWork8 {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Сумма целых нечетных чисел от 1 до " + num + " составляет: " + sum);
    }
}
