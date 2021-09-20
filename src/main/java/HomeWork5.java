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
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода числа!");
            scanner.next();
            return getDob();
        }
    }

    public static char getOper() {
        System.out.println("Введите операцию:");
        if (scanner.hasNext()) {
            return scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода операции");
            scanner.next();
            return getOper();
        }
    }

    public static double calculate(double num1, double num2, char op) {
        double result = 0;
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
            /**
             * На данном этапе не могу отказаться от default.
             */
            default:
                System.out.println("Операция неверная.");
                result = calculate(num1, num2, getOper());
        }
        return result;
    }
}
