package homework4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


    int operand1 = 7;
    int operand2 = 4;

    System.out.println ("Выберите арифметическвю операцию  +, -, *, / ");

    Scanner scanner = new Scanner(System.in);
      String sing = scanner.next();

    switch (sing) {

        case "*": {
            System.out.println(operand1 * operand2);
            break;
        }
        case "+": {
            System.out.println(operand1 + operand2);
            break;
        }
        case "-": {
            System.out.println(operand1 - operand2);
            break;
        }
        case "/" : {
            if (operand2 == 0) {
                System.out.println("/ by 0");
                break;
            }

            System.out.println(operand1 / operand2);
            break;
        }
    }


    }
}
