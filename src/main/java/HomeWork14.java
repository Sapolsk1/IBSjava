import java.util.Arrays;
import java.util.Random;

public class HomeWork14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int min = -20;
        int max = 20;
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(diff + 1) - Math.abs(min);
        }
        System.out.println(Arrays.toString(arr));
        int max1 = 0, min1 = 0;
        for (int i = 0; i < arr.length; i++) {
            max1 = Math.max(max1, arr[i]);
            min1 = Math.min(min1, arr[i]);
        }
        System.out.println("Максимальное число: " + max1 + "\nМинимальное число: " + min1);
        System.out.println("Максимальное число по модулю: " + Math.max(Math.abs(max1), Math.abs(min1)));
    }
}
