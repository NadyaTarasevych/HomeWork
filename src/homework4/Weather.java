package homework4;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        System.out.println("введите слово: ");

        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();

        switch (weather) {

            case "ясно": {
                System.out.println("clear");
                break;
            }
            case "дождь": {
                System.out.println("rain");
                break;
            }
            case "ветренно": {
                System.out.println("windy");
                break;
            }
            case "град": {
                System.out.println("hail");
                break;
            }
            case "облачно": {
                System.out.println("cloudy");
                break;
            }
            case "гроза": {
                System.out.println("thunderstorm");
                break;
            }
            case "снег": {
                System.out.println("snow");
                break;
            }
            case "радуга": {
                System.out.println("rainbow");
                break;
            }
            case "солнечно": {
                System.out.println("sunny");
                break;
            }
            case "солнце с дождем": {
                System.out.println("sun and rain");
                break;
            }
            default: {
                System.out.println("в переводчике нет этого слова");
            }
        }
    }
}
