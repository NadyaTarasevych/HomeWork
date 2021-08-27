package homework8;

import java.util.Scanner;

public class Bank {

    private static int creditSum = 700;

    public static void credit(int sumPay) {
        creditSum = creditSum - sumPay;

        if (sumPay > creditSum) {
            System.out.println("Нужно вернуть разницу: " + creditSum);
            creditSum = 0;
        }

        if (sumPay > 100) {
            int overpayment = sumPay - 100;
            System.out.println("Сумма переплаты: " + overpayment);
        }

        if (creditSum > 0) {
            System.out.println("Сумма задолженности: " + creditSum);
        }

        if (creditSum == 0) {
            System.out.println("Долг отсутствует");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите сумму платежа: ");
            int sumPay = scanner.nextInt();
            credit(sumPay);
            if (creditSum == 0) {
                break;
            }
        }

    }
}
