package homework6;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        int a;
        int b;
        int sum = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("введите первое число: ");
      a = scanner.nextInt();
      System.out.println("введите второе число: ");
      b = scanner.nextInt();

       while (a < b - 1){

           sum = sum + ++a;
           //System.out.println(a);

           if (a % 2 != 0)  {
               System.out.println(a);
           }

       }
       System.out.println(sum);


    }

}
