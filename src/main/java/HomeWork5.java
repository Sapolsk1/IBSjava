import java.util.Scanner;

public class HomeWork5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double number1 = getDob();
        double number2 = getDob();
        char operation = getOper();
        double result = calculate(number1, number2, operation);
        System.out.println("Результат операции: " + Math.floor(result));
    }

    public static double getDob() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода числа!");
            scanner.next();
            num = getDob();
        }
        return num;
    }

    public static char getOper() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода операции");
            scanner.next();
            operation = getOper();
        }
        return operation;

    }

    public static double calculate(double num1, double num2, char op) {
        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция неверная.");
                result = calculate(num1, num2, getOper());
        }
        return result;
    }
}
