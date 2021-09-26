package Homework6;

import java.util.Scanner;

/**
 * Единицы измерения расстояния:
 * метр - 1,
 * миля - 0,00062137
 * ярд - 1,094
 * фут - 3,281
 */

public class ConvertDistance extends Conventer {

    final double ratioMeter = 1;
    final double ratioMile = 0.0006214;
    final double ratioYard = 1.094;
    final double ratioFoot = 3.281;

    Scanner scanner = new Scanner(System.in);

    public double getValue() {
        System.out.println("Введите число: ");
        if (scanner.hasNextDouble() && value >= 0) {
            return scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода числа!");
            scanner.next();
            return getValue();
        }
    }

    public int getType() {
        type = scanner.nextInt();
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
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
                System.out.println("meter - " + value * ratioMeter + "\n" +
                        "mile - " + value * ratioMile + "\n" +
                        "yard - " + value * ratioYard + "\n" +
                        "foot - " + value * ratioFoot);
                break;
            case 2:
                System.out.println("meter - " + value / ratioMile + "\n" +
                        "mile - " + value * 1 + "\n" +
                        "yard - " + (value / ratioMile) * ratioYard + "\n" +
                        "foot - " + (value / ratioMile) * ratioFoot);
                break;
            case 3:
                System.out.println("meter - " + value / ratioYard + "\n" +
                        "mile - " + (value / ratioYard) * ratioMile + "\n" +
                        "yard - " + value * 1 + "\n" +
                        "foot - " + (value / ratioYard) * ratioFoot);
                break;
            case 4:
                System.out.println("meter - " + value / ratioFoot + "\n" +
                        "mile - " + (value / ratioFoot) * ratioMile + "\n" +
                        "yard - " + (value / ratioFoot) * ratioYard + "\n" +
                        "foot - " + value * 1);
                break;
        }
        return 0;
    }


}
