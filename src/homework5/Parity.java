package homework5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("внесите число: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("четное число");
        } else {
            System.out.println("не четное число");
        }

    }
}