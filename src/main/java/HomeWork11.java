import java.util.*;

public class HomeWork11 {
    public static void main(String[] args) {
        System.out.println("Введите число, которое запишется int");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Введите число, которое запишется String");
        Scanner scan2 = new Scanner(System.in);
        String str=scan2.nextLine();
        int max=Math.max(num, Integer.parseInt(str));
        System.out.println("Максимальное значение: " + max);
        double min=Math.min(Double.parseDouble(str), (double) num);
        System.out.println("Минимальное значение: " + min);
    }
}