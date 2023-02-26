import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner number_1 = new Scanner(System.in);
        System.out.println("Введите твердость:");
        int num_1 = number_1.nextInt();
        System.out.println("Вы ввели " + num_1);

        if (num_1 < 10 && num_1 > 0) {
            System.out.println("Твердость по шкале Мооса: " + num_1);
        } else {
            System.out.println("Неверно определена твёрдость");
        }
        vivod(num_1);
    }

    public static void vivod(Integer num) {
        switch (num) {
            case 1:
                System.out.println("Это тальк!");
                break;
            case 2:
                System.out.println("Это гипс!");
                break;
            case 3:
                System.out.println("Это кальцит!");
                break;
            case 4:
                System.out.println("Это флюорит!");
                break;
            case 5:
                System.out.println("Это апатит!");
                break;
            case 6:
                System.out.println("Это ПШ!");
                break;
            case 7:
                System.out.println("Это кварц!");
                break;
            case 8:
                System.out.println("Это топаз!");
                break;
            case 9:
                System.out.println("Это корунд!");
                break;
            case 10:
                System.out.println("Это алмаз!");
                break;
            default:
                System.out.println("Попробуй еще раз");
        }
    }
}