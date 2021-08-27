package homework7;

import java.util.Scanner;

public class Arithmetics {

    public static int add(int a, int b) {
        return (a + b);
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
       return a / b;
    }

    public static void main(String[] args) {

        int operand1;
        int operand2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый операнд");
        operand1 = scanner.nextInt();
        System.out.println("Введите второй операнд");
        operand2 = scanner.nextInt();
        System.out.println("Введите арифметический знак +, -, *, /");
        String sing = scanner.next();

        switch (sing) {

            case "+" : {
                System.out.println(add(operand1, operand2));
                break;
            }

            case "-": {
                System.out.println(sub(operand1, operand2));
                break;
            }
            case "*": {
                System.out.println(mul(operand1, operand2));
                break;
            }
            case "/": {
                if (operand1 == 0 || operand2 == 0) {
                    System.out.println("/ by 0");
                    break;
                }

                System.out.println(div(operand1, operand2));
                break;
            }

        }


    }
}
