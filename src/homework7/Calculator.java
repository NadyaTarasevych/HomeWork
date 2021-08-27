package homework7;

import java.util.Scanner;

public class Calculator {

    public static int calculate(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        c = scanner.nextInt();
        System.out.println(calculate(a, b, c));

    }
}
