package Homework6;

import java.util.Scanner;

/**
 * Единицы измерения массы:
 * грамм 1
 * кг 1000
 * центнер 10^5
 * тн 10^6
 */

public class ConvertMass extends Conventer{

    final double ratioGram = 1;
    final double ratioKilo = 1000;
    final double ratioCentner = 10000;
    final double ratioTon = 100000;

    public int getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
        if (scanner.hasNextInt() || type == 1 || type == 2 || type == 3 || type == 4) {
            return scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода типа!");
            scanner.next();
            return getType();
        }

    }

    @Override
    double convert(double value, int type) {
        switch (type) {
            case 1:
                System.out.println("грамм - " + value * ratioGram + "\n" +
                        "килограмм - " + value * ratioKilo + "\n" +
                        "центнер - " + value * ratioCentner + "\n" +
                        "тонна - " + value * ratioTon);
                break;
            case 2:
                System.out.println("грамм - " + value / ratioKilo + "\n" +
                        "килограмм - " + value * 1 + "\n" +
                        "центнер - " + (value / ratioKilo) * ratioCentner + "\n" +
                        "тонна - " + (value / ratioKilo) * ratioTon);
                break;
            case 3:
                System.out.println("грамм - " + value / ratioCentner + "\n" +
                        "килограмм - " + (value / ratioCentner) * ratioKilo + "\n" +
                        "центнер - " + value * 1 + "\n" +
                        "тонна - " + (value / ratioCentner) * ratioTon);
                break;
            case 4:
                System.out.println("грамм - " + value / ratioTon + "\n" +
                        "килограмм - " + (value / ratioTon) * ratioKilo + "\n" +
                        "центнер - " + (value / ratioTon) * ratioCentner + "\n" +
                        "тонна - " + value * 1);
                break;
        }
        return 0;
    }
}
