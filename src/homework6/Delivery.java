package homework6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        int n;
        int counter = 0;
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("количество клиентов: ");
        n = scanner.nextInt();
        do {
            result = result * ++counter;
        } while (counter < n);

        System.out.println(result);
    }

}
