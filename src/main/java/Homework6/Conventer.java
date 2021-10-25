package Homework6;

import java.util.Scanner;

public abstract class Conventer {
    int unit;
    double value;
    int type;

    abstract double convert(double value, int type);


    public int getUnit(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
            unit = Integer.parseInt(scanner.nextLine());
            if (unit == 1 || unit == 2) {
                return unit;
            } else {
                System.out.println("Ошибка ввода единицы измерения!");
                return getUnit();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода единицы измерения!");
            return getUnit();
        }

    }

    public double getValue() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите число:");
            value = Double.parseDouble(scanner.nextLine());
            if (value >= 0) {
                return value;
            } else {
                System.out.println("Ошибка ввода числа!");
                return getValue();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода числа!");
            return getValue();
        }
    }
}
