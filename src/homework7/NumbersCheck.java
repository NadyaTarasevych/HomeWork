package homework7;

import java.util.Scanner;

public class NumbersCheck {

    public static void check(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        }

        if (number < 0) {
            System.out.println("Число отрицательное");
        }

        if (number == 0) {
            System.out.println("Введен ноль");
        }
    }

    public static void prime(int number) {
        if (number <= 0) {
            System.out.println("Неверный ввод, число не может быть ноль или отрицательным");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Введено не простое число");
                    return;
                }
            }
            System.out.println("Число является простым " + number);
        }
    }


    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        number = scanner.nextInt();

        check(number);
        prime(number);
    }
}
