package homework6;

public class Figures {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");

        }
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 0; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        int lines = 10;
        drawRhombus(lines);

    }

    private static void drawRhombus(int lines) {
        if (lines % 2 != 0) {
            lines = lines / 2 * 2;
        }
        int halfNumber = lines / 2;
        for (int i = 1; i < lines; i++) {
            if (i < halfNumber) {

                for (int j = 0; j < lines; j++) {
                    if (j < halfNumber + i && j > halfNumber - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = lines; j > 0; j--) {

                    int t = lines - i - 1;
                    if (j < halfNumber + t && j > halfNumber - t) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

    }
}
