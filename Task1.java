import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        boolean validInput = false;

        // Ввод первого числа
        while (!validInput) {
            try {
                System.out.print("Введите первое число (a): ");
                a = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        validInput = false;

        // Ввод второго числа
        while (!validInput) {
            try {
                System.out.print("Введите второе число (b): ");
                b = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление: невозможно (деление на ноль)");
        }
    }
}
