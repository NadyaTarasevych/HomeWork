package homework3;

import java.util.Scanner;

public class Volume {
      final static double PI = 3.1415;

    public static void main(String[] args) {
        int r, h;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус: ");
        r = scanner.nextInt();
        System.out.println("Введите высоту: ");
        h = scanner.nextInt();

        double V = PI * r * r *h;
        System.out.println("Объем: " + V);

        double S = 2 * Math.PI * r * (r + h);
        System.out.println("Площадь: " + S);
    }
}
