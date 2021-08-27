package homework2;

import java.math.BigDecimal;

public class HomeWork2 {
    public static void main(String[] args) {
        double p = 3.141592653;
       // double e = 2.7182818284590452;
        BigDecimal e = new BigDecimal(2.7182818284590452);

        String first= "\nмоя строка 1";  //перенос на новую строку
        String second = "\tмоя строка 2";// табуляция
       String third = "\\aмоя строка 3";

        System.out.println(p);
        System.out.println(e);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
