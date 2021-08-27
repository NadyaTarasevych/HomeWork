package homework3;

import java.util.Scanner;

public class Circle {
    final static double PI = 3.1415;

    public static void main(String[] args) {
        int r;
        double area;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = PI * r * r;
        System.out.println("Area of circle:"+area);

    }
}
