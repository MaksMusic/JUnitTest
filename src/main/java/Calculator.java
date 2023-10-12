import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Консольный калькулятор");
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. четное число");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = minus(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;

            case 5:
                System.out.println("введите число");
                boolean answer = evenNumber(scanner.nextInt());
                String text = answer ? "число четное" : "число не четное";
                System.out.println(text);
                return;

            default:
                System.out.println("Неверный выбор операции.");
                break;
        }

        System.out.println("Результат: " + result);
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static boolean evenNumber(int num) {
        return num % 2 == 0;
    }

}
