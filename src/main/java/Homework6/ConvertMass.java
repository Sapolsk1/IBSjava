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
                System.out.println(value * ratioGram + " грамм" +  "\n" +
                        value / ratioKilo + " килограмм" + "\n" +
                        value / ratioCentner + " центнер" + "\n" +
                        value / ratioTon + " тонна");
                break;
            case 2:
                System.out.println(value * ratioKilo + " грамм" +  "\n" +
                        value * 1 + " килограмм" + "\n" +
                        value / 10 + " центнер" + "\n" +
                        value / 100 + " тонна");
                break;
            case 3:
                System.out.println(value * ratioCentner + " грамм" +  "\n" +
                        value * 10 + " килограмм" + "\n" +
                        value * 1 + " центнер" + "\n" +
                        value / 10 + " тонна");
                break;
            case 4:
                System.out.println(value * ratioTon + " грамм" +  "\n" +
                        value * 100 + " килограмм" + "\n" +
                        value * 10 + " центнер" + "\n" +
                        value * 1 + " тонна");
                break;
        }
        return 0;
    }
}
