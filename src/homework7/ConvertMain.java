package homework7;

import java.util.Scanner;

public class ConvertMain {

    public static void main (String[] args) {
        Conversion conversion = new Conversion(); //создан объект
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите валюту");
        int currency = scanner.nextInt();
        System.out.println("Введите курс");
        int exchangeRates = scanner.nextInt();

        int result = conversion.convert(currency, exchangeRates);

        System.out.println("Сумма: " + result);

    }
}
