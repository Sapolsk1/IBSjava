import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork7Integer {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        System.out.println(compare(array));
    }

    public static int[] initializeArray() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива:");
        int size = scanner.nextInt();
        System.out.println("Введите данные для элементов массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static boolean compare(int[] array) {
        final int x = 1;
        final int y = 2;
        final int z = 3;

        boolean s = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == (x) || array[i] == (y) || array[i] == (z)) {
                s = true;
                System.out.println("Данное значение имеется в константах");
            } else {
                System.out.println("Совпадений нет");
            }
        }
        return s;
    }
}
