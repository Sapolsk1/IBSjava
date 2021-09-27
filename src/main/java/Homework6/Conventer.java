package Homework6;

import java.util.Scanner;

public abstract class Conventer {
    int unit;
    double value;
    int type;

    abstract double convert(int unit, double value, int type);

    public int getUnit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        try {
            unit = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода единицы измерения!");
            return getUnit();
        }
        if (unit == 1 || unit == 2) {
            return unit;
        } else {
            System.out.println("Ошибка ввода единицы измерения!");
            return getUnit();
        }

    }

    public double getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            value = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода числа!");
            return getValue();
        }
        if (value >= 0) {
            return value;
        } else {
            System.out.println("Ошибка ввода числа!");
            return getValue();
        }
    }
}
