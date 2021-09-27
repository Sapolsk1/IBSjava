import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        final String x="Десять";
        final String y="123";
        final String z="IBS";

        System.out.println("Задайте размер числового массива:");
        Scanner scannerSize = new Scanner(System.in);
        int size = scannerSize.nextInt();
        String[] arr = new String[size];
        for (int i=0; i < arr.length; i++){
            System.out.println("Введите данные для элемента "+ i);
            Scanner scannerIndex = new Scanner(System.in);
            arr[i]= scannerIndex.nextLine();
        }
        if (Arrays.asList(arr).contains(x) || Arrays.asList(arr).contains(y) || Arrays.asList(arr).contains(z)) {
            System.out.println("Данное значение имеется в константах");
        }



    }


}
