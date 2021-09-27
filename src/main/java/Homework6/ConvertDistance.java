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


    public int getType() {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println(value * ratioMeter + " метр" + "\n" +
                        value * ratioMile + " миль" + "\n" +
                        value * ratioYard + " ярд" + "\n" +
                        value * ratioFoot + " фут");
                break;
            case 2:
                System.out.println(value / ratioMile + " метр" + "\n" +
                        "миль - " + value * 1 + "\n" +
                        "ярд - " + (value / ratioMile) * ratioYard + "\n" +
                        "фут - " + (value / ratioMile) * ratioFoot);
                break;
            case 3:
                System.out.println(value / ratioYard + " метр" + "\n" +
                        (value / ratioYard) * ratioMile + " миль" + "\n" +
                        value * 1 + " ярд" + "\n" +
                        (value / ratioYard) * ratioFoot + " фут");
                break;
            case 4:
                System.out.println(value / ratioFoot + " метр" + "\n" +
                        (value / ratioFoot) * ratioMile + " миль" + "\n" +
                        (value / ratioFoot) * ratioYard + " ярд" + "\n" +
                        value * 1 + " фут");
                break;
        }
        return 0;
    }


}
